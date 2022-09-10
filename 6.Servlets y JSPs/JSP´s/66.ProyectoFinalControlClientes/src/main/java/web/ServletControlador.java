package web;

import dominio.Cliente;
import datos.ClienteDaoJDBC;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperamos nuestro parametro accion
        String accion = request.getParameter("accion");
        //Nos aseguramos que la accion no es null
        if (accion != null) {
            //Dependiendo de la accion, se ejecutara un codigo diferente
            switch (accion) {
                case "editar":
                    //Llamamos al metodo editar cliente
                    this.editarCliente(request, response);
                    break;
                case "eliminar":
                    this.eliminarCliente(request, response);
                    break;
                //Si no concide con nada la accion se ejecuta el codigo por default
                default:
                    this.accionDefault(request, response);

            }
        } else {
            //En caso de que la accion sea igual a null, tambien se ejecuta el metodo por default
            this.accionDefault(request, response);
        }
    }

    //Creamos un metodo default en donde se ejecutaran las sentencias de recuperar la lista de cliente, procesarla y compartirla
    private void accionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //El metodo accionDefault va a recuperar la lista de clientes accediendo a la clase Dao
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        System.out.println("clientes = " + clientes);
        //Para compartir la informacion con el metodo sendRedirect necesitamosque los elementos esten en un alcance mayor que request
        HttpSession sesion = request.getSession();
        //Compartimos esta informacion en algun alcance
        sesion.setAttribute("clientes", clientes);
        //Compartimos tambien el tamaño de la lista para asi obtener el numero de clientes
        sesion.setAttribute("totalClientes", clientes.size());
        //Compartimos el saldoTotal con la ayuda del metodo calcularSaldoTotal
        sesion.setAttribute("saldoTotal", this.calcularSaldoTotal(clientes));
        //Llamamos el metodo forwar para propagar el request y response donde esta toda la informacion a la pagina clientes.jsp
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
        //Mejor llamamos al metodo sendRedirect para evitar que el formulario se vuelva a enviar al hacer refresh de la pagina
        response.sendRedirect("clientes.jsp");
    }

    //Hacemos un metodo para calcular el saldo total de los clientes
    private double calcularSaldoTotal(List<Cliente> clientes) {
        //Creamos una variable para almacenar el saltoTotal
        double saldoTotal = 0;
        //Iteramos la lista de clientes
        for (Cliente cliente : clientes) {
            saldoTotal += cliente.getSaldo();
        }
        return saldoTotal;
    }

    //Creamos un metodo para editar los clientes 
    private void editarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperamos el idCliente que nos paso el button en el jsp listadoClientes
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        //Buscamos el registro del cliente con el metodo encontrar de la clase ClienteDaoJDBC de la cpa de datos
        Cliente cliente = new ClienteDaoJDBC().encontrar(new Cliente(idCliente));
        //Colocamos este objeto cliente en algun alcance
        request.setAttribute("cliente", cliente);
        //Definimos la pagina jsp que vamos a utilizar 
        String jspEditar = "/WEB-INF/paginas/cliente/editarCliente.jsp";
        //Mandamos la infromacion al jsp de editarCliente
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }
    
    //Creamos un metodo para eliminar un cliente
    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperamos el idCliente
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        //Creamos un objeto cliente
        Cliente cliente = new Cliente(idCliente);
        //Llamamos al metodo eliminar de la clase ClienteDaoJDBC y almacenamos el numero de registros afectados
        int registrosModificado = new ClienteDaoJDBC().eliminar(cliente);
        System.out.println("registrosModificado = " + registrosModificado);
        //Llamamos al metodo default
        this.accionDefault(request, response);
    }

    //Inlcuimos el metodo doPost para procesar el formulario de agregarCliente
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperamos nuestro parametro accion
        String accion = request.getParameter("accion");
        //Nos aseguramos que la accion no es null
        if (accion != null) {
            //Dependiendo de la acion, se ejecutara un codigo diferente
            switch (accion) {
                case "insertar":
                    //Llamamos al metodo insertar cliente
                    this.insertarCliente(request, response);
                    break;
                case "modificar":
                    this.modificarCliente(request, response);
                    break;
                //Si no concide con nada la accion se ejecuta el codigo por default
                default:
                    this.accionDefault(request, response);

            }
        } else {
            //En caso de que la accion sea igual a null, tambien se ejecuta el metodo por default
            this.accionDefault(request, response);
        }
    }

    //Creamos un metodo para insertar un nuevo cliente en la lista de clientes el cual recibira loobjetos request y response
    private void insertarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperamos los argumentos del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        //Para recuperar el saldo hay que asegurarnos que no estamos obteniendo null o cadena vacia para poder convertir el saldo a double del input
        double saldo = 0;
        String saldoString = request.getParameter("saldo");
        if (saldoString != null & !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }

        //Creamos el objeto cliente (modelo) con estos datos
        Cliente cliente = new Cliente(nombre, apellido, email, telefono, saldo);
        //Instertamos el nuevo cliente en la base de datos, al usar este metodo nos regresara el numero de registros afectado
        int registrosModificados = new ClienteDaoJDBC().insertar(cliente);
        System.out.println("registrosModificados = " + registrosModificados);
        //Redirigimos al metodo accionDefault
        this.accionDefault(request, response);
    }
    
    //Creamos un metodo para modificar un nuevo cliente en la lista de clientes el cual recibira loobjetos request y response
    private void modificarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //Recuperamostodos los valores que nos envio el formulario de editarCliente
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        //Para recuperar el saldo hay que asegurarnos que no estamos obteniendo null o cadena vacia para poder convertir el saldo a double del input
        double saldo = 0;
        String saldoString = request.getParameter("saldo");
        if(saldoString != null & !"".equals("saldoString")){
            saldo = Double.parseDouble(saldoString);
        }
        //Almacenamos estos datos en un objeto cliente
        Cliente cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
        //Lalamamos al metodo actualizar de la clase ClienteDaoJDBC
        int registrosModificados = new ClienteDaoJDBC().actualizar(cliente);
        System.out.println("registrosModificados = " + registrosModificados);
        //Llamamos al metodo default para realizar las acciones correspondientes
        this.accionDefault(request, response);
    }
}
