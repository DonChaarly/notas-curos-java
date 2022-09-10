package test;

import datos.*;

import domain.*;
import java.sql.*;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() == true) {
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);

            Usuario usuarioNuevo = new Usuario("Panchito", "panchitopapu");
            usuarioDao.insertar(usuarioNuevo);

            Usuario cambioUsuario = new Usuario(2, "Rodigo Carmelo", "585858");
            usuarioDao.actualizar(cambioUsuario);

            conexion.commit();
            System.out.println("Se ha hecho commit");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Se ha entrado al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
