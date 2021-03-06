/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author smggu
 */
public class MainView extends javax.swing.JFrame {
    
    private EnviarDato enviar_dato = new EnviarDato();
    private MostrarDatos mostrar_datos = new MostrarDatos();
    private ProcesarDato procesar_dato = new ProcesarDato();

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enviarDatoB = new javax.swing.JButton();
        mostrarDatosB = new javax.swing.JButton();
        procesamientoB = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enviarDatoB.setText("Enviar dato");
        enviarDatoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarDatoBActionPerformed(evt);
            }
        });

        mostrarDatosB.setText("Mostrar datos");
        mostrarDatosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDatosBActionPerformed(evt);
            }
        });

        procesamientoB.setText("Procesamiento de datos");
        procesamientoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesamientoBActionPerformed(evt);
            }
        });

        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPrincipal.setLayout(new javax.swing.BoxLayout(panelPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enviarDatoB)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarDatosB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                        .addComponent(procesamientoB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarDatoB)
                    .addComponent(mostrarDatosB)
                    .addComponent(procesamientoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarDatoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarDatoBActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(enviar_dato);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_enviarDatoBActionPerformed

    private void mostrarDatosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDatosBActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(mostrar_datos);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_mostrarDatosBActionPerformed

    private void procesamientoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesamientoBActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(procesar_dato);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_procesamientoBActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviarDatoB;
    private javax.swing.JButton mostrarDatosB;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton procesamientoB;
    // End of variables declaration//GEN-END:variables
}
