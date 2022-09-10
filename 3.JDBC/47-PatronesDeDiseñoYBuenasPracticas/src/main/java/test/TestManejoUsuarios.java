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
            UsuarioDaoJDBC usuarioDao = new UsuarioDaoJDBC(conexion);

            List<UsuarioDTO> usuarios = usuarioDao.seleccionar();
            usuarios.forEach(usuario->{
                System.out.println("Usuario DTO: " + usuario);
            });
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
