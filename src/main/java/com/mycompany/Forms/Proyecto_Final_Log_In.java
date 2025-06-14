package com.mycompany.Forms;

import com.mycompany.Clases.Libro;
import com.mycompany.Clases.Cupon;
import com.mycompany.Clases.Programa;
import com.mycompany.Clases.Proveedor;
import com.mycompany.Clases.Usuario;
import com.mycompany.Clases.Venta;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Proyecto_Final_Log_In {

    //Declarando e inicializando Arreglos
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Cupon> cupones = new ArrayList<>();
    public static ArrayList<Venta> ventas = new ArrayList<>();
    public static ArrayList<Proveedor> proveedores = new ArrayList<>();
    
    public static int itemVentaSeleccionada;
    
    
    public static Libro sellBook; //BORRAR: Solo es de prueba
    
    public static void main(String[] args) {
        Programa datosPrograma = (Programa) leerArchivoBinario("datosNoBorrados.progra");
        
        if(datosPrograma == null){
            //Creando usuario "admin" por defecto.
            Usuario admin = new Usuario();
            //Añadiendo valores de usuario por defecto de "administrador" una vez se inicie el programa.
            admin.setNombre("Default Admin");
            admin.setPassword("admin");
            admin.setUsuario("admin");
            admin.setRol("Administrador");
            admin.setActivo(true);
            usuarios.add(admin);

            //Creando usuario "defSeller" por defecto.
            Usuario vendedor = new Usuario();
            //Añadiendo valores de usuario por defecto de "vendedor" una vez se inicie el programa.
            vendedor.setNombre("Default Seller");
            vendedor.setPassword("defSeller");
            vendedor.setUsuario("defSeller");
            vendedor.setRol("Vendedor");
            vendedor.setActivo(true);
            usuarios.add(vendedor);

            //Creando libro "defBook1" por defecto.
            Libro defBook1 = new Libro();
            //Añadiendo valores de libro por defecto de "defBook1" una vez se inicie el programa.
            defBook1.setTitulo("Default Book");
            defBook1.setAutor("Autor1");
            defBook1.setPrecio_compra(150.0);
            defBook1.setPrecio_venta(225.0);
            defBook1.setGenero("Comedia");
            defBook1.setCantidad(40);
            defBook1.setActivo(true);
            libros.add(defBook1);

            //Creando libro "defBook2" por defecto.
            Libro defBook2 = new Libro();
            //Añadiendo valores de libro por defecto de "defBook2" una vez se inicie el programa.
            defBook2.setTitulo("2Default Book");
            defBook2.setAutor("Autor2");
            defBook2.setPrecio_compra(120.0);
            defBook2.setPrecio_venta(200.0);
            defBook2.setGenero("Terror");
            defBook2.setCantidad(25);
            defBook2.setActivo(true);
            libros.add(defBook2);
        }else{
            
            usuarios = datosPrograma.getUsuarios();
            libros = datosPrograma.getLibros();
            cupones = datosPrograma.getCupones();
            ventas = datosPrograma.getVentas();
            proveedores = datosPrograma.getProveedor();
            
        }
        
        Login l = new Login();
        l.setVisible(true);
        
        l.addWindowListener(new java.awt.event.WindowAdapter() { // Séobreescribiendo un método que se ejecuta al cerrar la ventana Log in.
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                Programa datosLocales = new Programa();

                datosLocales.setUsuarios(usuarios);
                datosLocales.setProveedor(proveedores);
                datosLocales.setLibros(libros);
                datosLocales.setCupones(cupones);
                datosLocales.setVentas(ventas);

                escribirArchivoBinario(datosLocales, "datosNoBorrados.progra");
            }
        });
    }
    
    static private void escribirArchivoBinario (Object o, String ruta){
        try{
            FileOutputStream archivo =  new FileOutputStream(ruta);
            ObjectOutputStream escribe =  new ObjectOutputStream(archivo);
            escribe.writeObject(o);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    static private Object leerArchivoBinario (String ruta){
        try{
            FileInputStream archivo =  new FileInputStream(ruta);
            ObjectInputStream lee =  new ObjectInputStream(archivo);
            return lee.readObject();
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + ruta);
        } catch (java.io.IOException e) {
            System.err.println("Error de entrada/salida al leer el archivo: " + ruta);
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no encontrada al deserializar el archivo.");
        }
        
        return null;
    }
    
    
}
