package com.mycompany.Forms;

import com.mycompany.Clases.Libro;
import com.mycompany.Clases.Cupon;
import com.mycompany.Clases.Proveedor;
import com.mycompany.Clases.Usuario;
import com.mycompany.Clases.Venta;
import java.util.ArrayList;

public class Proyecto_Final_Log_In {

    //Declarando e inicializando Arreglos.
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Cupon> cupones = new ArrayList<>();
    public static ArrayList<Venta> ventas = new ArrayList<>();
    public static ArrayList<Proveedor> proveedores = new ArrayList<>();
    
    public static int itemVentaSeleccionada;
    
    public static Usuario usuarioActual;
    public static Libro sellBook; //BORRAR: Solo es de prueba
    
    public static void main(String[] args) {
        //Creando usuario "admin" por defecto.
        Usuario admin = new Usuario();
        //Añadiendo valores de usuario por defecto de "administrador" una vez se inicie el programa.
        admin.nombre = "Default Admin";
        admin.password = "admin";
        admin.usuario = "admin";
        admin.rol = "Administrador";
        admin.activo = true;
        usuarios.add(admin);
        
        //Creando usuario "defSeller" por defecto.
        Usuario vendedor = new Usuario();
        //Añadiendo valores de usuario por defecto de "vendedor" una vez se inicie el programa.
        vendedor.nombre = "Default Seller";
        vendedor.password = "defSeller";
        vendedor.usuario = "defSeller";
        vendedor.rol = "Vendedor";
        vendedor.activo = true;
        usuarios.add(vendedor);
        
        //Creando libro "defBook1" por defecto.
        Libro defBook1 = new Libro();
        //Añadiendo valores de libro por defecto de "defBook1" una vez se inicie el programa.
        defBook1.titulo = "Default Book";
        defBook1.autor = "Autor1";
        defBook1.precio_compra = 150.0;
        defBook1.precio_venta = 225.0;
        defBook1.genero = "Comedia";
        defBook1.cantidad = 40;
        defBook1.activo = true;
        libros.add(defBook1);
        
        //Creando libro "defBook2" por defecto.
        Libro defBook2 = new Libro();
        //Añadiendo valores de libro por defecto de "defBook2" una vez se inicie el programa.
        defBook2.titulo = "2Default Book";
        defBook2.autor = "Autor";
        defBook2.precio_compra = 120.0;
        defBook2.precio_venta = 200.0;
        defBook2.genero = "Terror";
        defBook2.cantidad = 25;
        defBook2.activo = true;
        libros.add(defBook2);
        
        Login l = new Login();
        l.setVisible(true);
    }
}
