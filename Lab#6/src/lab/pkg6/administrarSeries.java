/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author X
 */
public class administrarSeries {

    private ArrayList<Series> listaMovies = new ArrayList();
    private File archivo = null;

    public administrarSeries(String path) {
        archivo = new File(path);
    }

    public ArrayList<Series> getListaMovies() {
        return listaMovies;
    }

    public void setListaPersonas(ArrayList<Series> listaPersonas) {
        this.listaMovies = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaMovies + "\n";
    }

    public void setPersona(Series p) {
        this.listaMovies.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw); //           
            for (Series t : listaMovies) {
                bw.write(t.getId_serie() + ",");
                bw.write(t.getNombre_serie() + ",");
                bw.write(t.getCategoria() + ",");
                bw.write(t.getTemporadas() + ",");
                bw.write(t.getDirector() + ",");
                bw.write(t.getProductora() + ",");
                bw.write(t.getRating() + ",");
                bw.write(t.getDuracion() + ",");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaMovies = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    String a, b, c, d, e, f, g, h;
                    a = sc.next();
                    b = sc.next();
                    c = sc.next();
                    d = sc.next();
                    e = sc.next();
                    f = sc.next();
                    g = sc.next();
                    h = sc.next();
                    listaMovies.add(new Series(a, b, c, d, e, f, g, h));
                }//Fin del WHILE TOTAL
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
            sc.close();
        }//Fin del If

    }
}
