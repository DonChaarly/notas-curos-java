package beans.backing;

import beans.helper.ColoniaHelper;
import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class VacanteForm {

    @Inject
    private Candidato candidato;

    //Se agrega el atributo boolean comentarioEnviado para ocultar o mostrar el cuadro de comenrarios
    private boolean comentarioEnviado;

    @Inject
    private ColoniaHelper coloniaHelper;

    Logger log = LogManager.getRootLogger();

    public VacanteForm() {
        log.info("Creando el objeto VacanteForm");
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("Juan")) {
            //Se agrega un if coo validacion
            if (this.candidato.getApellido().equals("Perez")) {
                String msg = "Gracias, pero Juan Perez ya trabaja con nosotros";
                //Mandamos este mensaje a nuestr pagina JSF creando un objeto FacesMessage y elegios un error severo y pasamos el mensaje como parametro
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;//Este mensaje es global
                facesContext.addMessage(componentId, facesMessage);
                return "index";
            }
            log.info("Entrando al caso de exito");
            return "exito";
        } else {
            log.info("Entrando al caso de fallo");
            return "fallo";
        }
    }

    //Se agrega un metodo de tipo value changeListener para agregar los campos de ciudad y colonia de manera automatica
    public void codigoPostalListener(ValueChangeEvent valueChangeEvent) {
        //Declaramos nuestro objeto FacesContex y utilizamos la instancia actual para obtener este objeto
        FacesContext facesContext = FacesContext.getCurrentInstance();
        //Declaramos un objeto UIViewRoot ya que con este componete vamos a buscar nuestro componente dentro de nuestro formulario
        UIViewRoot uiViewRoot = facesContext.getViewRoot();
        //Con la variable valueChangeEvent que estamos recibiendo del metodo vamos a recuperar el nuevo codigo postal
        //casteamos el objeto a un tipo long para evitar un error de conversion, y de este long sacamos el int value
        int nuevoCodigoPostal = ((Long) valueChangeEvent.getNewValue()).intValue();

        //Recuperamos los elementos de colonia y ciudad con su id respectivo
        UIInput coloniaIdInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:coloniaId");
        //asignamos el id del con el codigo postal que estamos recibiendo, llamos al metodo getColoniaIdPorCP
        int nuevaColoniaId = this.coloniaHelper.getColoniaIdPorCP(nuevoCodigoPostal);
        //Asignamos la nueva colonia
        coloniaIdInputText.setValue(nuevaColoniaId);
        //Para que se complete correctamente esta tarea debemos utilizar el metodo setSubmitedValue ya que estamos haciendo el cambio desde el codigo Java hacia el JSF
        coloniaIdInputText.setSubmittedValue(nuevaColoniaId);

        //Hacemos lo mismo del elemento ciudad
        UIInput ciudadInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:ciudad");
        String nuevaCiudad = "Oaxaca";
        ciudadInputText.setValue(nuevaCiudad);
        ciudadInputText.setSubmittedValue(nuevaCiudad);

        //Hacemos que mande los cambios con el metodo renderResponse
        facesContext.renderResponse();

    }

    //Se agrega el metodo actionEvent ocultar comentario, este metodo lo unico que hara es invertir el valor de comentarioEnviado, ya que este lo utilizamos para mostrar o ocultar la barra de comentarios
    public void ocultarComentario(ActionEvent actionEvent) {
        this.comentarioEnviado = !this.comentarioEnviado;
    }

    public boolean isComentarioEnviado() {
        return comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }

    public ColoniaHelper getColoniaHelper() {
        return coloniaHelper;
    }

    public void setColoniaHelper(ColoniaHelper coloniaHelper) {
        this.coloniaHelper = coloniaHelper;
    }

}
