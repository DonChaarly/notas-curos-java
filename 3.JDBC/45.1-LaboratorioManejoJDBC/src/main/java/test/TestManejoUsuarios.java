package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO UsuarioDao = new UsuarioDAO();//Creacion de objeto de tipo UsuarioDAO para ejecutar las sentencias insertar, eliminar, borrar, modificar

        //Insternado un nuevo registro
//        Usuario usuarioNuevo = new Usuario("Carlos", "usuariopassword1");
//        UsuarioDao.insertar(usuarioNuevo);
        
        //Modificando un registro
//        Usuario usuarioModificar = new Usuario(1, "Juan Carlos", "usuariopassword2");
//        UsuarioDao.actualizar(usuarioModificar);

        //Eliminando un registro
        Usuario usuarioEliminar = new Usuario(1);
        UsuarioDao.eliminar(usuarioEliminar);
        
        //Listando los registros de la base de datos e imprimiendo este registro
        List<Usuario> usuarios = UsuarioDao.seleccionar();
        for (Usuario usuario1 : usuarios) {
            System.out.println(usuario1);
        };
    }
}
