package com.mycompany.Clases;

import java.io.Serializable;

public class Cupon implements Serializable{
    private String codigo;
    private String tipo; // Si por porcentaje o monto fijo.
    private double valor_descuento;
    private String expira;
    private boolean activo;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor_descuento
     */
    public double getValor_descuento() {
        return valor_descuento;
    }

    /**
     * @param valor_descuento the valor_descuento to set
     */
    public void setValor_descuento(double valor_descuento) {
        this.valor_descuento = valor_descuento;
    }

    /**
     * @return the expira
     */
    public String getExpira() {
        return expira;
    }

    /**
     * @param expira the expira to set
     */
    public void setExpira(String expira) {
        this.expira = expira;
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