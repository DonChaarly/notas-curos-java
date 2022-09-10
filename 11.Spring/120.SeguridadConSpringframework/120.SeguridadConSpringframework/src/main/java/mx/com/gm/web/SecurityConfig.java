package mx.com.gm.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//120 Se coloca la anotacion de Configuration para indicar a spring que esta clase es un bean de configuracion
@Configuration
//120 Se coloca la anotacion de EnableWebSecurity para habilitar la seguirdad web
@EnableWebSecurity
//120 Se extiende de la clase WebSecurityConfiguredAdapter la cual usaremos para configurar los usario a utilizar
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    //120 Se sobreescribe el metodo de configure el cual sirve para agregar mas usuarios y personalizar los usuarios que vamos a usar para hacer loggin en la aplicacion
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        //120 Se van a crear usuarios directamente en la memoria llamando de manera concatenada cada metodo que necesitamos para configurar los usuarios
        //120 El password debe estar codificado pero para especificar que no se encripte el password colocamos {noop}
        auth.inMemoryAuthentication()
                .withUser("admin")
                    .password("{noop}123")
                    .roles("ADMIN","USER")
                .and()
                .withUser("user")
                    .password("{noop}123")
                    .roles("USER")
                ;
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
