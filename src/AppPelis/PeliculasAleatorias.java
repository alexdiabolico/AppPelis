
package AppPelis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class PeliculasAleatorias extends javax.swing.JFrame {

    private int numAleatorio1, numAleatorio2;
    private ArrayList<String> pelis;
    private ArrayList<Integer> posiciones;
    private String buscar;
    public static String tituloPelicula;

    /**
     * Creates new form PeliculasAleatorias
     */
    public PeliculasAleatorias() {
        initComponents();
        pelis = new ArrayList<String>();

        FileReader fr = null;
        try {
            fr = new FileReader("texto.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            while ((cadena = br.readLine()) != null) {
                pelis.add(cadena);
            }
            //Número de lineas del archivo txt

        } catch (IOException ex) {
            Logger.getLogger(PeliculasAleatorias.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(PeliculasAleatorias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String obtenerAleatorio(boolean esPrimero) {
        int aleatorio = new Random().nextInt(pelis.size());
        String seleccion = pelis.get(aleatorio);

        if (esPrimero) {
            numAleatorio1 = aleatorio;
        } else {
            numAleatorio2 = aleatorio;
        }

        return seleccion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pelicula1B = new javax.swing.JButton();
        pelicula2B = new javax.swing.JButton();
        verPeli1RB = new javax.swing.JRadioButton();
        verPeli2RB = new javax.swing.JRadioButton();
        borrarAleatorio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pelicula1TA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        pelicula2TA = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        buscarTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buscarB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPeliculas = new javax.swing.JList<>();
        borrarLista = new javax.swing.JButton();
        mostrarTodasB = new javax.swing.JButton();
        editarB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        aniadirTF = new javax.swing.JTextField();
        aniadirB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Películas Aleatorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Película 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Película 2");

        pelicula1B.setText("Película Aleatoria");
        pelicula1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarAleatorio1(evt);
            }
        });

        pelicula2B.setText("Otra Película");
        pelicula2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarAleatorio2(evt);
            }
        });

        buttonGroup1.add(verPeli1RB);
        verPeli1RB.setText("Ver película 1");
        verPeli1RB.setEnabled(false);

        buttonGroup1.add(verPeli2RB);
        verPeli2RB.setText("Ver película 2");
        verPeli2RB.setEnabled(false);

        borrarAleatorio.setText("Borrar película");
        borrarAleatorio.setEnabled(false);
        borrarAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarAleatorioPelicula(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pelicula1TA.setColumns(20);
        pelicula1TA.setLineWrap(true);
        pelicula1TA.setRows(5);
        pelicula1TA.setAutoscrolls(false);
        jScrollPane2.setViewportView(pelicula1TA);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pelicula2TA.setColumns(20);
        pelicula2TA.setLineWrap(true);
        pelicula2TA.setRows(5);
        pelicula2TA.setAutoscrolls(false);
        jScrollPane3.setViewportView(pelicula2TA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47))
                            .addComponent(verPeli1RB)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pelicula1B)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pelicula2B)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(verPeli2RB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(borrarAleatorio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pelicula2B, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(pelicula1B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verPeli1RB)
                    .addComponent(verPeli2RB))
                .addGap(18, 18, 18)
                .addComponent(borrarAleatorio)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscador de Películas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Introduce nombre:");

        buscarB.setText("Buscar");
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });

        listaPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPeliculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaPeliculas);

        borrarLista.setText("Borrar película");
        borrarLista.setActionCommand("");
        borrarLista.setEnabled(false);
        borrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarListaActionPerformed(evt);
            }
        });

        mostrarTodasB.setText("Mostrar todas");
        mostrarTodasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodasBActionPerformed(evt);
            }
        });

        editarB.setText("Editar");
        editarB.setEnabled(false);
        editarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarTF)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(buscarB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(mostrarTodasB)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(borrarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarB)
                        .addGap(61, 61, 61))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarB)
                    .addComponent(mostrarTodasB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarLista)
                    .addComponent(editarB))
                .addGap(17, 17, 17))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Añadir Películas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        aniadirB.setText("Añadir");
        aniadirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aniadirTF, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aniadirB)
                .addGap(136, 136, 136))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniadirTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadirB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leyenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel4.setText("Signo * : Películas ya vistas");

        jLabel5.setText("Signo + : Películas descargadas");

        jLabel6.setText("Al añadir película, el año va al final, los signos al principio.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lanzarAleatorio1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarAleatorio1
        // TODO add your handling code here:
        pelicula1TA.setText(obtenerAleatorio(true));
        verPeli1RB.setEnabled(true);
        verPeli1RB.setSelected(true);
        if (!borrarAleatorio.isEnabled()) {
            borrarAleatorio.setEnabled(true);
        }
    }//GEN-LAST:event_lanzarAleatorio1

    private void lanzarAleatorio2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarAleatorio2
        // TODO add your handling code here:
        pelicula2TA.setText(obtenerAleatorio(false));
        verPeli2RB.setEnabled(true);
        verPeli2RB.setSelected(true);
        if (!borrarAleatorio.isEnabled()) {
            borrarAleatorio.setEnabled(true);
        }
    }//GEN-LAST:event_lanzarAleatorio2

    private void borrarAleatorioPelicula(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarAleatorioPelicula
        // TODO add your handling code here:

        if (verPeli1RB.isSelected()) {
            pelis.remove(numAleatorio1);
            pelicula1TA.setText("");

        } else {
            pelis.remove(numAleatorio2);
            pelicula2TA.setText("");
        }

        try {
            actualizarTexto();
            JOptionPane.showMessageDialog(null, "La película se ha borrado correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(PeliculasAleatorias.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        verPeli1RB.setEnabled(false);
        verPeli2RB.setEnabled(false);
        borrarAleatorio.setEnabled(false);
    }//GEN-LAST:event_borrarAleatorioPelicula

    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        String busqueda = buscarTF.getText().replace(" ", "");
        if (!busqueda.equals("")) {
            buscar = buscarTF.getText();
            buscarPeli();
        } else {
            JOptionPane.showMessageDialog(null, "Introduzca una película", "Aviso", JOptionPane.WARNING_MESSAGE);
            listaPeliculas.setModel(new DefaultListModel());
        }
        borrarLista.setEnabled(false);
        editarB.setEnabled(false);
    }//GEN-LAST:event_buscarBActionPerformed

    private void buscarPeli() {
        posiciones = new ArrayList<>();

        DefaultListModel<String> modelo = new DefaultListModel<>();
        String normalizado = Normalizer.normalize(buscar, Normalizer.Form.NFD);
        String textofinal = normalizado.replaceAll("[^\\p{ASCII}]", "");
        textofinal = textofinal.toLowerCase();

        for (int i = 0; i < pelis.size(); i++) {
            String normalizado2 = Normalizer.normalize(pelis.get(i), Normalizer.Form.NFD);
            String textofinal2 = normalizado2.replaceAll("[^\\p{ASCII}]", "");
            textofinal2 = textofinal2.toLowerCase();

            if (textofinal2.contains(textofinal)) {
                modelo.addElement(pelis.get(i));
                posiciones.add(i);
            }
        }
        if (modelo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se han encontrado resultados", "Atención", JOptionPane.INFORMATION_MESSAGE);
            borrarLista.setEnabled(false);
            editarB.setEnabled(false);
        }
        listaPeliculas.setModel(modelo);
    }

    private void listaPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPeliculasMouseClicked
        if (!borrarLista.isEnabled() && listaPeliculas.getSelectedIndex() != -1) {
            borrarLista.setEnabled(true);
        }

        if (!editarB.isEnabled() && listaPeliculas.getSelectedIndex() != -1) {
            editarB.setEnabled(true);
        }
    }//GEN-LAST:event_listaPeliculasMouseClicked

    //Si no tiene las dos marcas (* ó +)
    private boolean peliculaEditable() {
        return !(listaPeliculas.getSelectedValue().substring(0, 2).contains("*")
                && listaPeliculas.getSelectedValue().substring(0, 2).contains("+"));
    }

    private void borrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarListaActionPerformed

        try {
            int pos = posiciones.get(listaPeliculas.getSelectedIndex());
            pelis.remove(pos);
            actualizarTexto();
            buscarPeli();
            JOptionPane.showMessageDialog(null, "La película se ha borrado correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            borrarLista.setEnabled(false);
            editarB.setEnabled(false);
        } catch (IOException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido borrar la película. Error con el fichero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_borrarListaActionPerformed

    private void aniadirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirBActionPerformed
        String texto = aniadirTF.getText().replace(" ", "");
        String anio;
        int posAniadir;
        String expRegAnio = "^(\\+\\*|\\*\\+|\\+|\\*)?[a-zA-Z0-9]+[^\\+\\*]*[0-9]{4}$";

        if (!texto.equals("")) {
            //Esto se quita para no tener que pulsar en el checkbox, se hace solo
            //if (anioCB.isSelected()) {
            if (Pattern.matches(expRegAnio, aniadirTF.getText().toString())) {
                //Se comprueba si se introduce un patrón correcto y se actualiza el año
                anio = aniadirTF.getText().substring(aniadirTF.getText().length() - 4, aniadirTF.getText().length());
                posAniadir = buscarAnio(anio)+1;

                //if (posAniadir == -1) {
                    JOptionPane.showMessageDialog(null, "La película se ha añadido correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                //} else {
                    pelis.add(posAniadir, aniadirTF.getText());
                //}

            } else {
                JOptionPane.showMessageDialog(null, "La cadena introducida no cumple el patrón", "Error", JOptionPane.ERROR_MESSAGE);
                //pelis.add(aniadirTF.getText());
            }

            try {
                actualizarTexto();
                aniadirTF.setText("");

            } catch (IOException ex) {
                Logger.getLogger(PeliculasAleatorias.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Introduzca una película", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_aniadirBActionPerformed
    
    private void mostrarTodasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodasBActionPerformed
        DefaultListModel<String> modelo = new DefaultListModel<>();
        posiciones = new ArrayList<>();

        for (int i = 0; i < pelis.size(); i++) {
            modelo.addElement(pelis.get(i));
            posiciones.add(i);
        }
        if (modelo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ninguna película", "Atención", JOptionPane.INFORMATION_MESSAGE);
        } else {
            listaPeliculas.setModel(modelo);
        }
        borrarLista.setEnabled(false);
        editarB.setEnabled(false);
        buscar = "";
    }//GEN-LAST:event_mostrarTodasBActionPerformed

    private void editarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBActionPerformed
        int posicion = -1;

        if (peliculaEditable()) {
            String titulo = listaPeliculas.getSelectedValue();
            posicion = listaPeliculas.getSelectedIndex();

            EditarPeliculas editar = new EditarPeliculas(new javax.swing.JDialog(), true, titulo);
            editar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            editar.setTitle("Editar Películas");
            editar.setLocationRelativeTo(null);
            editar.setVisible(true);
            borrarLista.setEnabled(false);
            editarB.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "La película no es editable", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

        if (posicion != -1) {
            pelis.set(posiciones.get(posicion), PeliculasAleatorias.tituloPelicula);
            try {
                actualizarTexto();
                buscarPeli();
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_editarBActionPerformed

    public void actualizarTexto() throws IOException { //introduce el arrayList en el .txt
        FileWriter fichero = null;
        PrintWriter pw = null;
        fichero = new FileWriter("texto.txt");
        pw = new PrintWriter(fichero);

        for (int i = 0; i < pelis.size(); i++) {
            pw.println(pelis.get(i));
        }

        fichero.close();
    }

    private int buscarAnio(String anio) {
        //Si se quiere usar el método de alvaro poner posAniadir =-1 y en el if poner posAniadir = -1
        //Quitar que se le sume 1 en el método de aniadir
        int posAniadir = -2;
        boolean encontrado = false;
        int anioPrimeraPeli = Integer.parseInt(pelis.get(0).substring(pelis.get(0).length() - 4, pelis.get(0).length()));
        //int anioPeli = Integer.parseInt(anio);

        if (Integer.parseInt(anio) < anioPrimeraPeli) {
            posAniadir = -1;
            encontrado = true;
        }
        /*
        int posLista=0;
        while(anioPrimeraPeli<=anioPeli){
            posAniadir = posLista;
            anioPrimeraPeli = Integer.parseInt(pelis.get(posLista).substring(pelis.get(posLista).length() - 4, pelis.get(posLista).length()));
            posLista++;
        }
        */
        
        while (!encontrado) {
            for (int i = 0; i < pelis.size(); i++) {
                if (pelis.get(i).contains(anio)) {
                    posAniadir = i;
                    encontrado = true;
                }
            }
            anio = Integer.toString(Integer.parseInt(anio) - 1);
        }
        return posAniadir;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aniadirB;
    private javax.swing.JTextField aniadirTF;
    private javax.swing.JButton borrarAleatorio;
    private javax.swing.JButton borrarLista;
    private javax.swing.JButton buscarB;
    private javax.swing.JTextField buscarTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton editarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaPeliculas;
    private javax.swing.JButton mostrarTodasB;
    private javax.swing.JButton pelicula1B;
    private javax.swing.JTextArea pelicula1TA;
    private javax.swing.JButton pelicula2B;
    private javax.swing.JTextArea pelicula2TA;
    private javax.swing.JRadioButton verPeli1RB;
    private javax.swing.JRadioButton verPeli2RB;
    // End of variables declaration//GEN-END:variables

}
