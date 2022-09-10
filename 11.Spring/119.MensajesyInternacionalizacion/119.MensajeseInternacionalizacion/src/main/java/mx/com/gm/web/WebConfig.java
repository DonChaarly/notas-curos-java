package mx.com.gm.web;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

//119 Se coloca la anotacion de Configuration para indicar a spring que esta clase es un bean de configuracion
@Configuration
//119 Se implementa la interface WebMvcConfigured
public class WebConfig implements WebMvcConfigurer{
    
    //119 El metodo de localResolver congifura la internazionalizacion
    //119 Se agrega la anotacion de Bean para que spring lo agregue al contenedor de spring
    @Bean
    public LocaleResolver localeResolver(){
        //Creamos una variable llamda slr
        var slr = new SessionLocaleResolver ();
        //Con la variable slr mandamos llamar el metodo setDefaultLocal para epecificar el idioma que queremos que se maneje
        slr.setDefaultLocale(new Locale("es"));
        //retornamos la variable slr
        return slr;
    }
    
    //119 Se configura un interceptor para poder cambiar de idioma de forma dinamica
    @Bean 
    public LocaleChangeInterceptor localeChangeInterceptor(){
        //119 Creamos una variable lci
        var lci = new LocaleChangeInterceptor();
        //119 Especificamos el parametro con el cual vamos a cambiar de de lenguaje
        lci.setParamName("lang");
        //119 retornamos la variable lci
        return lci;
    }

    //119 Por ultimo registramos el interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registro){
        //119 Registramos nuestro interceptor
        registro.addInterceptor(localeChangeInterceptor());
    }
    
    
    
}
