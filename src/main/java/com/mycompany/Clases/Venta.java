package com.mycompany.Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Venta implements Serializable{
    
    private String nit;
    private String nombre;
    private String direccion;
    private ArrayList<Libro_Vendido> librosVendidos = new ArrayList<>();
    private double total;
    private double totalSinIVA;
    private String vendedor;
    private Calendar fechaYHora = Calendar.getInstance();
    private boolean activo;

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the librosVendidos
     */
    public ArrayList<Libro_Vendido> getLibrosVendidos() {
        return librosVendidos;
    }

    /**
     * @param librosVendidos the librosVendidos to set
     */
    public void setLibrosVendidos(ArrayList<Libro_Vendido> librosVendidos) {
        this.librosVendidos = librosVendidos;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the totalSinIVA
     */
    public double getTotalSinIVA() {
        return totalSinIVA;
    }

    /**
     * @param totalSinIVA the totalSinIVA to set
     */
    public void setTotalSinIVA(double totalSinIVA) {
        this.totalSinIVA = totalSinIVA;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the fechaYHora
     */
    public Calendar getFechaYHora() {
        return fechaYHora;
    }

    /**
     * @param fechaYHora the fechaYHora to set
     */
    public void setFechaYHora(Calendar fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}