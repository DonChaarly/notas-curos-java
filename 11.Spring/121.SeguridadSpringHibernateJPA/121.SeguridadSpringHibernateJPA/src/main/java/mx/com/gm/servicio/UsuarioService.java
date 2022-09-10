package mx.com.gm.servicio;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.IUsuarioDao;
import mx.com.gm.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//121 Se coloca la anotcion de service par convertir esta clase a una de servicio y se especifica el nombre que va a tener la clase para que la seguridad de spring la reconozca
//121 la Anotacion de slf4j es para mandar informacion a la consola
//121 Tambien se debe implementar la interface userDetailsService para utilizar sus mtodos
@Service("userDetailsService")
@Slf4j
public class UsuarioService implements UserDetailsService{
    
    //121 Se inyecta un objeto de UsuarioDao para utilizar sus metodos
    @Autowired
    private IUsuarioDao usuarioDao;

    //121 Se implementa el sig metodo donde va a buscar el usuario y regresara un objeto User el cual es parte de springSecurity ya con todos los detalles del usuario
    @Override
    //121 Se debe indicar que el meotdo es transaccional y que es solo de lectura para que pueda hacer transacciones con la base de datos
    @Transactional(readOnly =true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        //121 Recuperamos el usuario a partir del username con la clase usuarioDao
        Usuario usuario = usuarioDao.findByUsername(username);
        
        //121 Verificamos que el usuairo no sea null y si lo es mandmos una excepcion
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }
        
        //121 Creamos una lista de roles donde se guardaran los roles del usuario ya envueltos en un objeto GrantedAuhority
        var roles = new ArrayList<GrantedAuthority>();
        
        //121 Recorremos cada uno de los roles y los envolvemos en un objeto de tipo SimpleGrantedAuthority la cual extiende de la clase GrantedAuthority
        for (Rol rol : usuario.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        
        //121 Retornamos un objeto User al cual le pasamos los datos que ya recuperamos
        return new User(usuario.getUsername(), usuario.getPassword(), roles);
        
    }
    
    
    
}
