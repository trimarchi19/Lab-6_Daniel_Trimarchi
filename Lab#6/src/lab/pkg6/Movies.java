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
public class Movies {
    
    private String id_pelicula;
    private String nombre_pelicula;
    private String categoria;
    private ArrayList<String> idiomas=new ArrayList();
    private ArrayList<String> subtitulos=new ArrayList();
    private ArrayList<String> lista_comentarios=new ArrayList();
    private String Director;
    private String productora;
    private ArrayList<String> actores=new ArrayList();
    private String rating;
    private String duracion;

    public Movies() {
    }

    public Movies(String id_pelicula, String nombre_pelicula, String categoria, String Director, String productora, String rating, String duracion) {
        this.id_pelicula = id_pelicula;
        this.nombre_pelicula = nombre_pelicula;
        this.categoria = categoria;
        this.Director = Director;
        this.productora = productora;
        this.rating = rating;
        this.duracion = duracion;
    }

    public String getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(String id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    public ArrayList<String> getLista_comentarios() {
        return lista_comentarios;
    }

    public void setLista_comentarios(ArrayList<String> lista_comentarios) {
        this.lista_comentarios = lista_comentarios;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
  
}
