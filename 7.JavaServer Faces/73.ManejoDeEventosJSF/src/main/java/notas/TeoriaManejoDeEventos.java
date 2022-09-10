package notas;

public class TeoriaManejoDeEventos {
    
    /*
                                Value Change Listener en JSF
    
    JSF provee dos maneras de detectar cambios (value change) en los componentes, 
    ya sea agregando un atributo valueChangeListener al componente o como un elemento 
    interno. Por ejemplo:
    
    <h:input Text id="codigoPostal" onchange="this.form.submit()"
    value="#{empleadoBean.codigoPostal}"
    valueChangeListener="#{vacanteForm.codigoPostalListener}" />
    
    Una vez definido el atributo o elemento interno, se debe agregar el método action 
    en el ManageBean qye escucha el cambio en la Vista.
    
    public void codigoPostalListener(ValueChangeEvent valueChangeEvent) {...}
    
    
                            Action Lstener en JSF
    
    JSF provee dos maneras de configurar la detección de eventos cuando un usuario
    ejecuta una acción de tipo submit, ya sea agregando el atributo actionListener
    al componente JSF o como un elemento interno en el componente.
    
    Algunos componentes de este tipo son h:commandButton y h:commandLink
    
        <h:commandLink actionListener="#{vacanteForm.enviar"/>
    
    Una vez definido el atributo o elemento interno, se debe agregar el método 
    action en el Manged Bean que procesa la petición de la Vista
    
        public void enviar(ActionEvent actionEvent){...}
            
    
    */
    
}
