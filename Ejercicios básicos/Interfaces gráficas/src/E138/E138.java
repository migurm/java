/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package E138;

import java.awt.Color;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class E138 extends javax.swing.JFrame {
    
    //Variable para almacenar texto en caso de ENTER, que se quede en la salida.
    String textoSalida="";


    public E138() {
        initComponents();
        jSalidaTexto.setBackground(Color.BLACK);
        jSalidaTexto.setForeground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jEntradaTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSalidaTexto = new javax.swing.JTextArea();
        bBotonLimpia = new javax.swing.JButton();
        bBotonFormato = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(153, 153, 255));

        jEntradaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEntradaTexto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jEntradaTextoCaretUpdate(evt);
            }
        });
        jEntradaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntradaTextoActionPerformed(evt);
            }
        });

        jSalidaTexto.setEditable(false);
        jSalidaTexto.setBackground(new java.awt.Color(0, 0, 0));
        jSalidaTexto.setColumns(20);
        jSalidaTexto.setForeground(new java.awt.Color(255, 255, 255));
        jSalidaTexto.setLineWrap(true);
        jSalidaTexto.setRows(5);
        jScrollPane1.setViewportView(jSalidaTexto);

        bBotonLimpia.setText("Actualiza");
        bBotonLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotonLimpiaActionPerformed(evt);
            }
        });

        bBotonFormato.setText("Formato");
        bBotonFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotonFormatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(bBotonFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jEntradaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bBotonLimpia)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(bBotonFormato)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEntradaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBotonLimpia))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jEntradaTextoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jEntradaTextoCaretUpdate
        // TODO add your handling code here:
        jSalidaTexto.setText(textoSalida+jEntradaTexto.getText());
    }//GEN-LAST:event_jEntradaTextoCaretUpdate

    private void jEntradaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntradaTextoActionPerformed
        //Caso pulsacion tecla enter
        textoSalida+=jEntradaTexto.getText()+"\n";
        jEntradaTexto.setText("");
    }//GEN-LAST:event_jEntradaTextoActionPerformed

    private void bBotonLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotonLimpiaActionPerformed
        //Pulsamos el boton de limpieza, lo que haya en la entrada a la salida, lo demás se resetea.
        textoSalida="";//Vaciamos el contenido y añadimos si hay algo en la salida.
        textoSalida+=jEntradaTexto.getText()+"\n";
        jSalidaTexto.setText(textoSalida);//Ponemos en la salida la entrada.
        jEntradaTexto.setText("");
        
    }//GEN-LAST:event_bBotonLimpiaActionPerformed

    private void bBotonFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotonFormatoActionPerformed
        //Caso pulsar el boton de formato.
        if(jSalidaTexto.getBackground()!=Color.BLACK){
            jSalidaTexto.setBackground(Color.BLACK);
            jSalidaTexto.setForeground(Color.WHITE);
        }else{
            jSalidaTexto.setBackground(Color.WHITE);
            jSalidaTexto.setForeground(Color.BLUE);
        }
    }//GEN-LAST:event_bBotonFormatoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(E138.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(E138.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(E138.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(E138.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E138().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bBotonFormato;
    private javax.swing.JButton bBotonLimpia;
    private javax.swing.JTextField jEntradaTexto;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextArea jSalidaTexto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
