package mx.com.gm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//120 Se coloca la anotacion de Configuration para indicar a spring que esta clase es un bean de configuracion
//120 Se coloca la anotacion de EnableWebSecurity para habilitar la seguirdad web
//120 Se extiende de la clase WebSecurityConfiguredAdapter la cual usaremos para configurar los usario a utilizar
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    //121 Inyectamo el servicio de usuairios que cremos en la clase UsuarioService
    @Autowired
    private UserDetailsService userDetailsService;
    
    //121 Definimos el tipo de inscripcion que vamos a utilizar y colocamos la anotacion de bean para que spring lo reconozca como un bean y lo guarde en el contenedor
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    //121 Anotamos el siguiente metodo con autowired para que spring inyecte el objeto configurerGlobal
    //121 La anotacion causa problemas, se puso entre comentarios, aun asi la aplicion sigue funcionando
    //@Autowired
    public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception{
        //121 le pasamos el objeto userDetailsService para que spring utilice la configuracion que definimos en esa clase y especificamos cual es el tipo de codificacion que utilizaremos
        build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
    
    
    //120 Se sobreescribe el metodo de configure para restringir las url de nuestra aplicacion web
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        //120 Se configuran los url que van a estar restringidos
        //120 En el metodo antMatchers se especifican los url que queremos restringir, se coloca el path seguido de /** para restringir los path que se encuentren dentro del path principal
        //120 Con hasRole se especifican los usuarios que van a tener acceso a los url
        //120 Con formLogin se configura el login que vamos a utilizar y con loginPage indicamos cual es la pagina de login que vamos a utilizar
        //120 Con exceptionHandling y accessDeniedPage se especifica cual es la pagina que se mandara cuando no se tenga acceso a una pagina
        http.authorizeHttpRequests()
                .antMatchers("/editar/**", "/agregar/**", "/eliminar")
                    .hasRole("ADMIN")
                .antMatchers("/")
                    .hasAnyRole("USER", "ADMIN")
                .and()
                .formLogin()
                    .loginPage("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403")
                ;
    
    }   
    
    
}
