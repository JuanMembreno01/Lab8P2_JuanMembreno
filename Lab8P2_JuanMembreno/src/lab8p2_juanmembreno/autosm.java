/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_juanmembreno;

/**
 *
 * @author usuario
 */
public class autosm {
   private String vin;
   private String marca;
   private String tipocarro;
   private int numeropuertas;
   private String color;
   private String tipodemotro;
   private  int precio;
   private String hibridacion;
   private int cantidaddepasajeros;
   private int tiempodeensanblaje;

    public autosm() {
    }

    public autosm( String  vin, String marca, String tipocarro, int numeropuertas, String color, String tipodemotro, int precio, String hibridacion, int cantidaddepasajeros, int tiempodeensanblaje) {
        this.vin = vin;
        this.marca = marca;
        this.tipocarro = tipocarro;
        this.numeropuertas = numeropuertas;
        this.color = color;
        this.tipodemotro = tipodemotro;
        this.precio = precio;
        this.hibridacion = hibridacion;
        this.cantidaddepasajeros = cantidaddepasajeros;
        this.tiempodeensanblaje = tiempodeensanblaje;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipocarro() {
        return tipocarro;
    }

    public void setTipocarro(String tipocarro) {
        this.tipocarro = tipocarro;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipodemotro() {
        return tipodemotro;
    }

    public void setTipodemotro(String tipodemotro) {
        this.tipodemotro = tipodemotro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getHibridacion() {
        return hibridacion;
    }

    public void setHibridacion(String hibridacion) {
        this.hibridacion = hibridacion;
    }

    public int getCantidaddepasajeros() {
        return cantidaddepasajeros;
    }

    public void setCantidaddepasajeros(int cantidaddepasajeros) {
        this.cantidaddepasajeros = cantidaddepasajeros;
    }

    public int getTiempodeensanblaje() {
        return tiempodeensanblaje;
    }

    public void setTiempodeensanblaje(int tiempodeensanblaje) {
        this.tiempodeensanblaje = tiempodeensanblaje;
    }

   

    @Override
    public String toString() {
        return vin;
        //return "auto{" + "vin=" + vin + ", marca=" + marca + ", tipocarro=" + tipocarro + ", numeropuertas=" + numeropuertas + ", color=" + color + ", tipodemotro=" + tipodemotro + ", precio=" + precio + ", hibridacion=" + hibridacion + ", cantidaddepasajeros=" + cantidaddepasajeros + ", tiempodeensanblaje=" + tiempodeensanblaje + '}';
    }
   
   
}
