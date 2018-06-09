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
import java.util.Date;
import java.util.Scanner;

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
        listaUs = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ArrayList<Series> temp = new ArrayList<>();
                    ArrayList<Movies> temp2 = new ArrayList<>();
                    String c, n, e;
                    c = sc.next();
                    n = sc.next();
                    Scanner s2 = new Scanner(sc.next());
                    Scanner s3 = new Scanner(sc.next());
                    e = sc.next();
                    s2.useDelimiter(",");
                    int x = 0;
                    while (s2.hasNext()) {
                        temp.add(new Series());
                        temp.get(x).setNombre_serie(s2.next());
                        x += 1;
                    }           
                    s3.useDelimiter(",");
                    x = 0;
                    while (s3.hasNext()) {
                        temp2.add(new Movies());
                        temp2.get(x).setNombre_pelicula(s3.next());
                        x += 1;
                    }   
                         
                       //  listaUs.add(new Usuarios(n, c, e));
                      // listaUs.get(listaUs.size() - 1).setSeries(temp);
                        //listaUs.get(listaUs.size() - 1).setMovies(temp2);
                    }//Fin del WHILE TOTAL
                }catch (Exception e) {
                System.out.println(e);
                System.out.println("NO SE PORQUE");
            }
                sc.close();
            }//Fin del If

        }
    }
