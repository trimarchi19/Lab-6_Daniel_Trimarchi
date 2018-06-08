/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author X
 */
public class Usuarios {

    private String contraseña;
    private String correo;
    private String fecha;
    private ArrayList<Series> series=new ArrayList();
    private ArrayList<Movies> movies=new ArrayList();
    private String tarjeta;
    
    public Usuarios() {
        
    }

    public Usuarios(String contraseña, String correo, String fecha, String tarjeta) {
        this.contraseña = contraseña;
        this.correo = correo;
        this.fecha = fecha;
        this.tarjeta = tarjeta;
    }
    
    
  
    

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Series> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Series> series) {
        this.series = series;
    }

    public ArrayList<Movies> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movies> movies) {
        this.movies = movies;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    

  


}
