package com.mycompany.Clases;

import java.util.ArrayList;
import java.util.Calendar;

public class Venta {
    
    public String nit;
    public String nombre;
    public String direccion;
    public ArrayList<Libro_Vendido> librosVendidos = new ArrayList<>();
    public double total;
    public double totalSinIVA;
    public String vendedor;
    public Calendar fechaYHora = Calendar.getInstance();
    public boolean activo;
}