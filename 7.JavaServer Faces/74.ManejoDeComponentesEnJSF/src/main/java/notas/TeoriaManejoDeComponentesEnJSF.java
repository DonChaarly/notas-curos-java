package notas;

public class TeoriaManejoDeComponentesEnJSF {
    
    /*
                                Componentes HTML en JSF
    
    El API de JSF provee de varios componentes basicos para el despliegue de informacion HTML:
    
    Estos siempre estan envueltos en <h:.../>
    
        form                            inputText                       inputTextarea
        inputSecret                     inputHidden                     outputLabel
        outputLink                      outputFormat                    outputText
        commandButton                   commandLink                     message
        messages                        panelGrid                       panelGroup
        dataTable                       column                          selectOneListbox
        selectOneRadio                  selectBooleanCheckbox           selectManyCheckbox
        selectManyListbox               selectManyMenu                  
    
    
                                Componentes Core de JSF
    
    El API de JSF provee varios componentes core para el manejo de eventos, administración de componentes, entre otros.
    
    Estos siempre estan envueltos en <f:.../>
        view                            subview                         facet
        attribute                       param                           actionListener
        valueChangeListener             converter                       convertDateTime
        coverNumber                     validator                       validateDoubleRange
        calidateLength                  validateLongRange               loadBundle
        selectItems                     selectItem                      vervatim
    
    
                                Arquitectura de componetes JSF
    
    Un componente JSF se compone de 3 partes:
    
    1. Etiqueta JSF (codigo Pagina JSF)
        h:inputText
    2. Despliegue Componete (Código HTML  que visualiza el cliente)
        Elemento HTML
    3. Componente JSF UI (Código Java en el Managed Bean)
        HTMLLInputText
    
    
                                Componentes de selcción en JSF
    
    El API de JSF provee distintos tipos de componentes de seleccion:
    
    Estos siempre estan envueltos en <h:.../>
    selectOneListbox
    selectOneMenu
    selectOneRadio
    selectBooleanCheckbox
    selectManyCheckbox
    selectManyListbox
    selectManyMenu
    
    En la pagina de corejsf podemos encontrar ejemplos de estos componentesJSF
    www.corejsf.com/jsf-tags.html
    
    
                                Select Items en JSF
    
    Los componentes JSF tales como h:selectOneMenu muestran una lista de datos, 
    los cuales se conocen como Select Items (elementos de selección)
    
    Lista de elementos Select Item ligada a una propiedad del Manage Bean:
    
        <h:selectOneMenu>
            <f:selectItems value="#{coloniaHelper.coloniaSelectItems}" />
        </h:selectOneMenu>
    
    Lista de elementos en código duro en la página JSF:
    
        <h:selectOneMenu>
            <f:selectItems>
                <f:selectItems itemLabel="Rojo" itemValue="rojo" />
                <f:selectItems itemLabel="Verde" itemValue="verde" />
                <f:selectItems itemLabel="Azul" itemValue="azul" />
            </f:selectItems>
    */
    
}
