/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Series {
     private String id_serie;
    private String nombre_serie;
    private String categoria;
    private String temporadas;
    private ArrayList<String> idiomas=new ArrayList();
    private ArrayList<String> subtitulos=new ArrayList();
    private ArrayList<String> lista_comentarios=new ArrayList();
    private String Director;
    private String productora;
    private ArrayList<String> actores=new ArrayList();
    private String rating;
    private String duracion;

    public Series() {
        
    }

    public Series(String id_serie, String nombre_serie, String categoria, String temporadas, String Director, String productora, String rating, String duracion) {
        this.id_serie = id_serie;
        this.nombre_serie = nombre_serie;
        this.categoria = categoria;
        this.temporadas = temporadas;
        this.Director = Director;
        this.productora = productora;
        this.rating = rating;
        this.duracion = duracion;
    }

    public String getId_serie() {
        return id_serie;
    }

    public void setId_serie(String id_serie) {
        this.id_serie = id_serie;
    }

    public String getNombre_serie() {
        return nombre_serie;
    }

    public void setNombre_serie(String nombre_serie) {
        this.nombre_serie = nombre_serie;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
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

    @Override
    public String toString() {
        return  nombre_serie ;
    }
    
    
  
}
