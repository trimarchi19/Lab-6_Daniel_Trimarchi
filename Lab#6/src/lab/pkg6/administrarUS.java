/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author X
 */
public class administrarUS {

    private ArrayList<Usuarios> listaUs = new ArrayList();
    private File archivo = null;

    public administrarUS(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaUs() {
        return listaUs;
    }

    public void setListaUs(ArrayList<Usuarios> listaUs) {
        this.listaUs = listaUs;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaUs + "\n";
    }

    public void setPersona(Usuarios p) {
        this.listaUs.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios t : listaUs) {
                bw.write(t.getCorreo() + ";");
                bw.write(t.getContraseña() + ";");
                for (Series s : t.getSeries()) {
                    bw.write(s.getNombre_serie() + ",");
                }
                bw.write(";");
                for (Movies m : t.getMovies()) {
                    bw.write(m.getNombre_pelicula() + ",");
                }
                bw.write(";");
                bw.write(t.getTarjeta() + ";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        StringTokenizer sc1 = new StringTokenizer(archivo.toString(), ";");
        listaUs = new ArrayList();
        if (archivo.exists()) {
            try {
                administrarSeries sp = new administrarSeries("./series.txt");
                administrarMovies mp = new administrarMovies("./movies.txt");
                mp.cargarArchivo();
                sp.cargarArchivo();
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ArrayList<Series> temp = new ArrayList<>();
                    ArrayList<Movies> temp2 = new ArrayList<>();
                    String b, a, c, d, e, f;
                    b = sc.next();
                    if (sc.hasNext()) {
                        a = sc.next();
                        c = sc.next();
                        d = sc.next();
                        e = sc.next();
                        /*
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(d);
                        System.out.println(e);
                        System.out.println("-------------------");
                         */
                        Scanner st1 = new Scanner(c);
                        st1.useDelimiter(",");
                        Scanner st2 = new Scanner(d);
                        st2.useDelimiter(",");
                        int x = 0;
                        while (st1.hasNext()) {
                            temp.add(new Series());
                            temp.get(x).setNombre_serie(st1.next());
                            x += 1;
                        }
           
                        x = 0;
                        while (st2.hasNext()) {
                            temp2.add(new Movies());
                            temp2.get(x).setNombre_pelicula(st2.next());
                            x += 1;
                        }
                     
                        listaUs.add(new Usuarios(a, b, e));
                        listaUs.get(listaUs.size() - 1).setSeries(temp);
                        listaUs.get(listaUs.size() - 1).setMovies(temp2);

                        for (int j = 0; j < listaUs.get(listaUs.size() - 1).getSeries().size(); j++) {

                            for (int k = 0; k < sp.getListaMovies().size(); k++) {
                              
                                if (listaUs.get(listaUs.size() - 1).getSeries().get(j).getNombre_serie().contains(
                                        sp.getListaMovies().get(k).getNombre_serie())) {
                               
                                    listaUs.get(listaUs.size() - 1).getSeries().get(j).setCategoria(
                                            sp.getListaMovies().get(k).getCategoria());
                                }
                            }
                        }
                        
                      
                            for (int j = 0; j < listaUs.get(listaUs.size() - 1).getMovies().size(); j++) {

                            for (int k = 0; k < sp.getListaMovies().size(); k++) {
                                
                                if (listaUs.get(listaUs.size() - 1).getMovies().get(j).getNombre_pelicula().contains(
                                        mp.getListaMovies().get(k).getNombre_pelicula())) {
                                    
                                    listaUs.get(listaUs.size() - 1).getMovies().get(j).setCategoria(
                                            mp.getListaMovies().get(k).getCategoria());
                                }
                            }
                        }

                    }
                }//Fin del WHILE TOTAL

                System.out.println(listaUs.get(1).getSeries());

            } catch (Exception e) {
                System.out.println(e);

            }
            sc.close();
        }//Fin del If

    }
}
