package beans.lifecycle;


import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Para que esta clase pueda funcionar comoun listener de JSF debe implementar la interface PhaseListener
public class DebuggerListener implements PhaseListener {

    //Se implementan los metodos abstractos de esta interface
    
    //Se define una variable Logger la cual nos permitira mandar mensajes a la consola usando el api de log4g
    Logger log = LogManager.getRootLogger();
    //Este metodo se manda a llamar antes de que se ejecute la fase
    @Override
    public void beforePhase(PhaseEvent pe) {
        //Se va a mandar un mensaje si es que la configuracion de log esta a nivel de info
        if (log.isInfoEnabled()) {
            log.info("Antes de la fase: " + pe.getPhaseId().toString());
        }
    }

    //Este metodo se manda a llamar despues de que se ejecute la fase
    @Override
    public void afterPhase(PhaseEvent pe) {
        if (log.isInfoEnabled()) {
            log.info("Despues de la fase: " + pe.getPhaseId().toString());
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
