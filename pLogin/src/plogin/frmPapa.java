/*
 * Programa de ejemplo en eque se raliza una práctica
 * que consiste en diseñar un formulario de incio de sesión que permita loguearse en un MDI identificando al usuario cuyos datos residen en un archivo de texto
 * Se crean y se centran ventanas hijas que son accedidas al dar clic en los menús.
 */
package plogin;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MSc, Alexánder NARVAEZ - @narvaezberrio 
 * Canal en Youtube: https://www.youtube.com/alexnarvaez
 */
public class frmPapa extends javax.swing.JFrame {

    frmPacientes p;
    frmDoctors d;

    /**
     * Creates new form frmPapa
     */
    public frmPapa() {
        initComponents();

        this.setExtendedState(frmPapa.MAXIMIZED_BOTH);//lo maximizamos
        this.setTitle("SONRIE: Programa Odontológico");//le colocamos título

        //Recuerda citarme, sé bueno y respeta mi autoría
        String texto = "Programa creado por Alexander Naváez \n@narvaezberrio\n"
                + "Canal en Youtube: https://www.youtube.com/alexnarvaez";
        JOptionPane.showMessageDialog(null, texto, " Inicio de Sesión  - MDI y Ventanas  Hijas", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(texto);
        
        
        ///////////////////////////////////

             
        ///////////////////////////////
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JDesktopPane();
        lblImgUser = new javax.swing.JLabel();
        lblDoctors = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnuPacientes = new javax.swing.JMenuItem();
        mnuDoctors = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuAcerca = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelFondo.add(lblImgUser);
        lblImgUser.setBounds(0, 0, 0, 0);

        lblDoctors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sonrie.png"))); // NOI18N
        panelFondo.add(lblDoctors);
        lblDoctors.setBounds(270, 30, 1400, 700);

        getContentPane().add(panelFondo);
        panelFondo.setBounds(-230, 0, 1740, 770);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");

        mnuPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor.png"))); // NOI18N
        mnuPacientes.setMnemonic('o');
        mnuPacientes.setText("Pacientes");
        mnuPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPacientesActionPerformed(evt);
            }
        });
        fileMenu.add(mnuPacientes);

        mnuDoctors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dentist.png"))); // NOI18N
        mnuDoctors.setMnemonic('s');
        mnuDoctors.setText("Doctores");
        mnuDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoctorsActionPerformed(evt);
            }
        });
        fileMenu.add(mnuDoctors);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        mnuSalir.setMnemonic('x');
        mnuSalir.setText("Exit");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        fileMenu.add(mnuSalir);

        menuBar.add(fileMenu);

        jMenu1.setText("Ayuda");

        mnuAcerca.setText("Acerca de ...");
        mnuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAcerca);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPacientesActionPerformed
        if (!(p instanceof frmPacientes)) {//sino hay instancia en memoria
            p = new frmPacientes();//creamos la instancia
        }
        CentrarHijas(p);     //centramos la ventana hija en el MDI 

    }//GEN-LAST:event_mnuPacientesActionPerformed

    private void mnuDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoctorsActionPerformed
        if (!(d instanceof frmDoctors)) {//sino hay instancia en memoria
            d = new frmDoctors();//creamos la instancia
        }
        CentrarHijas(d);     //centramos la ventana hija en el MDI 
    }//GEN-LAST:event_mnuDoctorsActionPerformed

    private void mnuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaActionPerformed
        String texto = "Programa creado por ALexander Naváez \n@narvaezberrio\n"
                + "Canal en Youtube: https://www.youtube.com/alexnarvaez";
        JOptionPane.showMessageDialog(null, texto, " Inicio de Sesión  - MDI y Ventanas  Hijas", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(texto);
    }//GEN-LAST:event_mnuAcercaActionPerformed

    void CentrarHijas(JInternalFrame hija) {
        int ancho = (panelFondo.getWidth() / 2) - hija.getWidth() / 2;
        int alto = (panelFondo.getHeight() / 2) - hija.getHeight() / 2;
        if (hija.isShowing()) {// sis se está mostrando
            hija.setLocation(ancho, alto);//centrarla

        } else {
            panelFondo.add(hija);
            hija.setLocation(ancho, alto);
            hija.show();//la mostramos
        }

    }
    
    
    ///////////////////////////

    //////////////////////////
    
    
    
    
    

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
            java.util.logging.Logger.getLogger(frmPapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblDoctors;
    private javax.swing.JLabel lblImgUser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAcerca;
    private javax.swing.JMenuItem mnuDoctors;
    private javax.swing.JMenuItem mnuPacientes;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JDesktopPane panelFondo;
    // End of variables declaration//GEN-END:variables

}
