/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author X
 */
public class Uniflix extends javax.swing.JFrame {

    administrarUS ap = new administrarUS("./US.txt");
    administrarSeries sp = new administrarSeries("./series.txt");
    administrarMovies mp = new administrarMovies("./movies.txt");

    ArrayList<Series> s = new ArrayList();
    ArrayList<Movies> m = new ArrayList();
    int actual;

    /**
     * Creates new form Uniflix
     */
    public Uniflix() {
        initComponents();
        ap.cargarArchivo();
        sp.cargarArchivo();
        mp.cargarArchivo();
        for (Usuarios u : ap.getListaUs()) {
            us.add(u);
        }
        actual = us.size();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registrar = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r_us = new javax.swing.JTextField();
        r_trajeta = new javax.swing.JTextField();
        r_con = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_series = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        j_movies = new javax.swing.JList<>();
        cb_movies = new javax.swing.JComboBox<>();
        cb_series = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        aplicacion = new javax.swing.JDialog();
        agregar = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        j_tree = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        enviar = new javax.swing.JToggleButton();
        ingresar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_us = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_con = new javax.swing.JPasswordField();

        jd_registrar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Contraseña");
        jd_registrar.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 92, 55));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 2, 18)); // NOI18N
        jLabel5.setText("Registrar");
        jd_registrar.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 0, 92, 55));

        jLabel6.setText("Tarjeta de Credito");
        jd_registrar.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 92, 55));

        jLabel8.setText("Usuario");
        jd_registrar.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 92, 55));
        jd_registrar.getContentPane().add(r_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 172, 35));
        jd_registrar.getContentPane().add(r_trajeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 172, 33));
        jd_registrar.getContentPane().add(r_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 172, 40));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jd_registrar.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 355, 140, 60));

        jLabel9.setText("Series");
        jd_registrar.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 80, 20));

        j_series.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(j_series);

        jd_registrar.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 200, 150));

        j_movies.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(j_movies);

        jd_registrar.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 170, 160));

        cb_movies.setMaximumRowCount(12);
        cb_movies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peliculas" }));
        cb_movies.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_moviesItemStateChanged(evt);
            }
        });
        jd_registrar.getContentPane().add(cb_movies, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 110, 30));

        cb_series.setMaximumRowCount(12);
        cb_series.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Series", " " }));
        cb_series.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_seriesItemStateChanged(evt);
            }
        });
        jd_registrar.getContentPane().add(cb_series, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 30));

        jLabel10.setText("Peliculas");
        jd_registrar.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 30));

        agregar.setText("Agergar A la Lista");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Uniflix");
        j_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(j_tree);

        j_list.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(j_list);

        enviar.setText("-->");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aplicacionLayout = new javax.swing.GroupLayout(aplicacion.getContentPane());
        aplicacion.getContentPane().setLayout(aplicacionLayout);
        aplicacionLayout.setHorizontalGroup(
            aplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aplicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aplicacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        aplicacionLayout.setVerticalGroup(
            aplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aplicacionLayout.createSequentialGroup()
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(aplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addGroup(aplicacionLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(enviar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_us)
                                    .addComponent(tf_con, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_us, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_con, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_series.getModel();
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_movies.getModel();
        int cont = 0;
        for (Series s : sp.getListaMovies()) {
            System.out.println(s.getNombre_serie());
            modelo.addElement(new Series(s.getNombre_serie(), s.getCategoria()));
        }
        for (Movies s : mp.getListaMovies()) {
            modelo2.addElement(s);
        }
        cb_series.setModel(modelo);
        cb_movies.setModel(modelo2);
        jd_registrar.setModal(true);
        jd_registrar.pack();
        jd_registrar.setLocationRelativeTo(this);
        jd_registrar.setVisible(true);

    }//GEN-LAST:event_registrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String usuario = r_us.getText();
        String contra = r_con.getText();
        ArrayList<Series> series = new ArrayList();
        ArrayList<Movies> movies = new ArrayList();
        DefaultListModel modelo
                = (DefaultListModel) j_series.getModel();
        DefaultListModel modelo2
                = (DefaultListModel) j_movies.getModel();
        for (int i = 0; i < modelo.size(); i++) {
            series.add(new Series());
            series.get(i).setNombre_serie(modelo.get(i).toString());

        }
        for (int i = 0; i < modelo2.size(); i++) {
            movies.add(new Movies());
            movies.get(i).setNombre_pelicula(modelo2.get(i).toString());

        }
        String tarjeta = r_trajeta.getText();
        r_us.setText("");
        r_con.setText("");
        r_trajeta.setText("");
        modelo.removeAllElements();
        modelo2.removeAllElements();
        j_series.setModel(modelo);
        j_movies.setModel(modelo2);
        us.add(new Usuarios(contra, usuario, tarjeta));
        us.get(actual).setSeries(series);
        us.get(actual).setMovies(movies);
        ap.setPersona(us.get(actual));
        //System.out.println(ap+"---");
        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        actual += 1;
        ap.cargarArchivo();
        sp.cargarArchivo();
        mp.cargarArchivo();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_seriesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_seriesItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            // Contactos s = (Contactos) cb_amigos.getSelectedItem();
            if (!(cb_series.getSelectedItem().toString().equals("Series")
                    || cb_series.getSelectedItem().toString().equals(" "))) {
                String s = cb_series.getSelectedItem().toString();
                DefaultListModel modelo
                        = (DefaultListModel) j_series.getModel();
                modelo.addElement(s);
                j_series.setModel(modelo);

            }
        }
    }//GEN-LAST:event_cb_seriesItemStateChanged

    private void cb_moviesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_moviesItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            // Contactos s = (Contactos) cb_amigos.getSelectedItem();
            if (!(cb_movies.getSelectedItem().toString().equals("Peliculas"))) {
                String s = cb_movies.getSelectedItem().toString();
                DefaultListModel modelo
                        = (DefaultListModel) j_movies.getModel();
                modelo.addElement(s);
                j_movies.setModel(modelo);
            }
        }

    }//GEN-LAST:event_cb_moviesItemStateChanged

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:

        String us1 = tf_us.getText();
        String con = tf_con.getText();
        int actual = 0;
        int con_us = 0;
        int cont = 0;

        System.out.println(us.get(1).getSeries().get(0).getCategoria() + "---" + us.get(1).getSeries().get(0).getNombre_serie());
        for (Usuarios u : us) {
            if (u.getCorreo().contains(us1) && u.getContraseña().equals(con)) {
                cont = 1;
                actual = con_us;
            }
            con_us += 1;
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(this, "No se ha Encontrado el Usuario");
        }
        if (cont == 1) {
            actualizar_list();
            DefaultListModel modelo = (DefaultListModel) j_list.getModel();
            for (Series s : sp.getListaMovies()) {
                modelo.addElement(s);
            }
            for (Movies m : mp.getListaMovies()) {
                modelo.addElement(m);
            }
            DefaultTreeModel modeloARBOL
                    = (DefaultTreeModel) j_tree.getModel();
            DefaultMutableTreeNode raiz
                    = (DefaultMutableTreeNode) modeloARBOL.getRoot();
            String Categoria = "";
            String nombre = "";
            raiz.removeAllChildren();
            for (int k = 0; k < us.get(actual).getSeries().size(); k++) {
                int centinela = -1;
                int centinela2 = -1;

                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (raiz.getChildAt(i).toString().
                            equals(us.get(actual).getSeries().get(k).getCategoria())) {
                        for (int j = 0; j < raiz.getChildAt(i).getChildCount(); j++) {
                            if (raiz.getChildAt(i).getChildAt(j).toString().
                                    contains(us.get(actual).getSeries().get(k).getNombre_serie())) {
                                centinela2 = 1;

                            }
                        }

                        if (centinela2 == -1) {
                            nombre = us.get(actual).getSeries().get(k).getNombre_serie();
                            nombre = nombre.replaceAll(" ", "");
                            DefaultMutableTreeNode p
                                    = new DefaultMutableTreeNode(
                                            new Series(nombre)
                                    );
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);

                        }
                        centinela = 1;

                    }
                }
                if (centinela == -1) {
                    Categoria = us.get(actual).getSeries().get(k).getCategoria();
                    nombre = us.get(actual).getSeries().get(k).getNombre_serie();
                    Categoria = Categoria.replaceAll(" ", "");
                    nombre = nombre.replaceAll(" ", "");

                    DefaultMutableTreeNode n
                            = new DefaultMutableTreeNode(Categoria);

                    DefaultMutableTreeNode p
                            = new DefaultMutableTreeNode(
                                    new Series(nombre)
                            );
                    n.add(p);
                    raiz.add(n);
                }
                //---------------------------------------------------------------------------------

            }
            for (int k = 0; k < us.get(actual).getMovies().size(); k++) {
                int centinela = -1;
                int centinela2 = -1;

                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (raiz.getChildAt(i).toString().
                            equals(us.get(actual).getMovies().get(k).getCategoria())) {
                        for (int j = 0; j < raiz.getChildAt(i).getChildCount(); j++) {
                            System.out.println("......");
                            if (raiz.getChildAt(i).getChildAt(j).toString().
                                    contains(us.get(actual).getMovies().get(k).getNombre_pelicula())) {
                                centinela2 = 1;

                            }
                        }

                        if (centinela2 == -1) {
                            nombre = us.get(actual).getMovies().get(k).getNombre_pelicula();
                            nombre = nombre.replaceAll(" ", "");
                            DefaultMutableTreeNode p
                                    = new DefaultMutableTreeNode(
                                            new Movies(nombre)
                                    );
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);

                        }
                        centinela = 1;

                    }
                }
                if (centinela == -1) {

                    Categoria = us.get(actual).getMovies().get(k).getCategoria();
                    nombre = us.get(actual).getMovies().get(k).getNombre_pelicula();
                    Categoria = Categoria.replaceAll(" ", "");
                    nombre = nombre.replaceAll(" ", "");

                    DefaultMutableTreeNode n
                            = new DefaultMutableTreeNode(Categoria);

                    DefaultMutableTreeNode p
                            = new DefaultMutableTreeNode(
                                    new Series(nombre)
                            );
                    n.add(p);
                    raiz.add(n);
                }
                //---------------------------------------------------------------------------------

            }
            if (us.get(actual).getCorreo().contains("admin")) {
                agregar.setVisible(true);
            } else {
                agregar.setVisible(false);
            }
            modeloARBOL.reload();

            j_list.setModel(modelo);
            aplicacion.setModal(true);
            aplicacion.pack();
            aplicacion.setLocationRelativeTo(this);
            aplicacion.setVisible(true);
        }


    }//GEN-LAST:event_ingresarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
        if (j_list.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloARBOL
                    = (DefaultTreeModel) j_tree.getModel();
            DefaultMutableTreeNode raiz
                    = (DefaultMutableTreeNode) modeloARBOL.getRoot();
            //obtener la persona a guardar
            DefaultListModel modeloLISTA
                    = (DefaultListModel) j_list.getModel();
            String Categoria, nombre;
            int edad;
            int centinela = -1;
            int centinela2 = -1;
            if (modeloLISTA.get(j_list.getSelectedIndex()) instanceof Series) {
                Categoria = ((Series) modeloLISTA.get(j_list.getSelectedIndex())).getCategoria();
                nombre = ((Series) modeloLISTA.get(j_list.getSelectedIndex())).getNombre_serie();
                Categoria = Categoria.replaceAll(" ", "");
                nombre = nombre.replaceAll(" ", "");
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (Categoria.
                            contains(raiz.getChildAt(i).toString())) {

                        for (int j = 0; j < raiz.getChildAt(i).getChildCount(); j++) {
                            if (raiz.getChildAt(i).getChildAt(j).toString().
                                    equals(nombre)) {
                                centinela2 = 1;

                            }
                        }

                        if (centinela2 == -1) {
                            DefaultMutableTreeNode p
                                    = new DefaultMutableTreeNode(
                                            new Series(nombre, Categoria)
                                    );
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);

                        }
                        centinela = 1;

                    }
                }
                if (centinela == -1) {
                    DefaultMutableTreeNode n
                            = new DefaultMutableTreeNode(Categoria);

                    DefaultMutableTreeNode p
                            = new DefaultMutableTreeNode(
                                    new Series(nombre,
                                            Categoria)
                            );
                    n.add(p);
                    raiz.add(n);
                }
            } else if (modeloLISTA.get(j_list.getSelectedIndex()) instanceof Movies) {
                Categoria = ((Movies) modeloLISTA.get(j_list.getSelectedIndex())).getCategoria();
                nombre = ((Movies) modeloLISTA.get(j_list.getSelectedIndex())).getNombre_pelicula();
                Categoria = Categoria.replaceAll(" ", "");
                nombre = nombre.replaceAll(" ", "");
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (Categoria.
                            contains(raiz.getChildAt(i).toString())) {

                        for (int j = 0; j < raiz.getChildAt(i).getChildCount(); j++) {
                            if (raiz.getChildAt(i).getChildAt(j).toString().
                                    contains(nombre)) {
                                centinela2 = 1;

                            }
                        }

                        if (centinela2 == -1) {
                            DefaultMutableTreeNode p
                                    = new DefaultMutableTreeNode(
                                            new Movies(nombre, Categoria)
                                    );
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);

                        }
                        centinela = 1;

                    }
                }
                if (centinela == -1) {
                    DefaultMutableTreeNode n
                            = new DefaultMutableTreeNode(Categoria);

                    DefaultMutableTreeNode p
                            = new DefaultMutableTreeNode(
                                    new Movies(nombre,
                                            Categoria)
                            );
                    n.add(p);
                    raiz.add(n);
                }

            }
            modeloARBOL.reload();
        }
    }//GEN-LAST:event_enviarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Uniflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uniflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uniflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uniflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Uniflix().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton agregar;
    private javax.swing.JDialog aplicacion;
    private javax.swing.JComboBox<String> cb_movies;
    private javax.swing.JComboBox<String> cb_series;
    private javax.swing.JToggleButton enviar;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> j_list;
    private javax.swing.JList<String> j_movies;
    private javax.swing.JList<String> j_series;
    private javax.swing.JTree j_tree;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JPasswordField r_con;
    private javax.swing.JTextField r_trajeta;
    private javax.swing.JTextField r_us;
    private javax.swing.JButton registrar;
    private javax.swing.JPasswordField tf_con;
    private javax.swing.JTextField tf_us;
    // End of variables declaration//GEN-END:variables
ArrayList<Usuarios> us = new ArrayList();

    public void actualizar_list() {
        ArrayList<Usuarios> s = new ArrayList<>();
        for (Usuarios u : ap.getListaUs()) {
            s.add(u);
        }
        us = s;
    }
}
