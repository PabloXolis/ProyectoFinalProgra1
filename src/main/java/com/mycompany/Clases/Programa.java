package com.mycompany.Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pabloxolis
 */

public class Programa implements Serializable{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Libro> libros;
    //private ArrayList<Libro_Vendido> librosVentas;
    private ArrayList<Cupon> cupones;
    private ArrayList<Venta> ventas;

    /**
     * @return the usuarios
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the proveedor
     */
    public ArrayList<Proveedor> getProveedor() {
        return proveedores;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(ArrayList<Proveedor> proveedor) {
        this.proveedores = proveedor;
    }

    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * @return the cupones
     */
    public ArrayList<Cupon> getCupones() {
        return cupones;
    }

    /**
     * @param cupones the cupones to set
     */
    public void setCupones(ArrayList<Cupon> cupones) {
        this.cupones = cupones;
    }

    /**
     * @return the ventas
     */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
}
