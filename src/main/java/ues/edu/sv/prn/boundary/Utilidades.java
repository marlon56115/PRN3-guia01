/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.prn.boundary;

/**
 *
 * @author marlon
 */
public class Utilidades {
    
    private String marca;
    private String modelo;
    private String color;
    private String anio;
    private String tipo;

    public Utilidades() {
    }

    public Utilidades(String marca, String modelo, String color, String anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.tipo = tipo;
    }
    
    
     /**
     * devuelve los parametros ordenados
     *
     * @param marca
     * @param modelo
     * @param color
     * @param anio
     * @param tipo
     * @return
     */
    public String textualizar(String marca, String modelo, String color, String anio, String tipo) {
        marca = marca.substring(0, 1).toUpperCase() + marca.substring(1, marca.length());
        modelo = modelo.substring(0, 1).toUpperCase()  + modelo.substring(1, modelo.length());
        color = color.substring(0, 1).toUpperCase()  + color.substring(1, color.length());
        anio = anio.substring(0, 1).toUpperCase()  + anio.substring(1, anio.length());
        tipo = tipo.substring(0, 1).toUpperCase()  + tipo.substring(1, tipo.length());
        return "el resultado es: "+anio+" "+marca+" "+modelo+" "+tipo+" "+color;
    }
}
