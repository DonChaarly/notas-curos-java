package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Usuario;

@Local
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorId (Usuario usuario);
    
    public void insertarUsuario (Usuario usuario);
    
    public void actualizarUsuario (Usuario usuario);
    
    public void eliminarUsuario (Usuario usuario);
    
}
