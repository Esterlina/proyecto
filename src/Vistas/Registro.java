/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Eric Ramirez Santis
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public Registro() {
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

        Username = new javax.swing.JTextField();
        Contraseña1 = new javax.swing.JPasswordField();
        Contraseña2 = new javax.swing.JPasswordField();
        Registrarme = new javax.swing.JButton();
        Loguearse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        Username.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Username.setText("usuario");
        Username.setToolTipText("Ingrese un nombre de usuario");
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username);
        Username.setBounds(30, 190, 280, 40);

        Contraseña1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Contraseña1.setToolTipText("Ingrese su contraseña");
        getContentPane().add(Contraseña1);
        Contraseña1.setBounds(30, 290, 280, 40);

        Contraseña2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Contraseña2.setToolTipText("Ingrese nuevamente su contraseña");
        getContentPane().add(Contraseña2);
        Contraseña2.setBounds(30, 400, 280, 40);

        Registrarme.setToolTipText("Registrar cuenta");
        Registrarme.setBorderPainted(false);
        Registrarme.setContentAreaFilled(false);
        getContentPane().add(Registrarme);
        Registrarme.setBounds(30, 460, 180, 50);

        Loguearse.setToolTipText("Ir a pantalla de Login");
        Loguearse.setBorderPainted(false);
        Loguearse.setContentAreaFilled(false);
        getContentPane().add(Loguearse);
        Loguearse.setBounds(80, 630, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/Registrarse.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña1;
    private javax.swing.JPasswordField Contraseña2;
    private javax.swing.JButton Loguearse;
    private javax.swing.JButton Registrarme;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
