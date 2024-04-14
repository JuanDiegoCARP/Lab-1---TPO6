/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Producto;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas
 */
public class ListadoPorPrecio extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    private TreeSet<Producto> productos;

    /**
     * Creates new form ListadoPorPrecio
     */
    public ListadoPorPrecio(TreeSet<Producto>productos) {
        initComponents();
        this.productos=productos;
        armarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtPrecioBajo = new javax.swing.JTextField();
        jtPrecioAlto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtProductos = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Listado Por Precio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Entre $");

        jtPrecioBajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioBajoKeyReleased(evt);
            }
        });

        jtPrecioAlto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioAltoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("y");

        JtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtProductos);

        jbCerrar.setText("Cerrar Ventana");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtPrecioBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtPrecioAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jbCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jbCerrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtPrecioBajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecioAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jtPrecioBajoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioBajoKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        double num=0;
        
        try {
            num = Integer.parseInt(jtPrecioBajo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero");
            jtPrecioBajo.requestFocus();
            return;        
        }
        
     
       
        for (Producto p : productos) {
            if (p.getPrecio()>=num) {               
                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getDescripcion(),
                    p.getPrecio(),
                    p.getStock()
                });
             
            }
   
        }
    }//GEN-LAST:event_jtPrecioBajoKeyReleased

    private void jtPrecioAltoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioAltoKeyReleased
        // TODO add your handling code here:
         borrarFilas();
         double num2=0;
          
       try {
            num2 = Integer.parseInt(jtPrecioAlto.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero");
            jtPrecioAlto.requestFocus();
            return;
        }
       
       
       
        for (Producto p : productos) {
            if (p.getPrecio()<=num2) {               
                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getDescripcion(),
                    p.getPrecio(),
                    p.getStock()
                });
             
            }
   
        }
    }//GEN-LAST:event_jtPrecioAltoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JTextField jtPrecioAlto;
    private javax.swing.JTextField jtPrecioBajo;
    // End of variables declaration//GEN-END:variables

    private void armarLista() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        JtProductos.setModel(modelo);
    }
    
    private void borrarFilas(){
        int filas = JtProductos.getRowCount() - 1;
        
        for(int f = filas; f >= 0; f-- ){
            modelo.removeRow(f);
        }
    }
}
