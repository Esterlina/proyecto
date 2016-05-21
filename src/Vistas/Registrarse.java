/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Eric Ramirez Santis
 */

public class Registrarse extends javax.swing.JFrame {


    public Registrarse() {
        initComponents();
        this.setMinimumSize(new Dimension (702, 702));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JTextField();
        contrasena1 = new javax.swing.JPasswordField();
        contrasena2 = new javax.swing.JPasswordField();
        Registrarme = new javax.swing.JButton();
        Loguearse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        Username.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Username.setToolTipText("Ingrese un nombre de usuario");
        getContentPane().add(Username);
        Username.setBounds(30, 190, 280, 40);

        contrasena1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        contrasena1.setToolTipText("Ingrese su contraseña");
        getContentPane().add(contrasena1);
        contrasena1.setBounds(30, 290, 280, 40);

        contrasena2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        contrasena2.setToolTipText("Ingrese nuevamente su contraseña");
        getContentPane().add(contrasena2);
        contrasena2.setBounds(30, 400, 280, 40);

        Registrarme.setToolTipText("Registrar cuenta");
        Registrarme.setBorderPainted(false);
        Registrarme.setContentAreaFilled(false);
        Registrarme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Registrarme);
        Registrarme.setBounds(30, 460, 180, 50);

        Loguearse.setToolTipText("Ir a pantalla de Login");
        Loguearse.setBorderPainted(false);
        Loguearse.setContentAreaFilled(false);
        Loguearse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Loguearse);
        Loguearse.setBounds(80, 630, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/Registrarse.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loguearse;
    private javax.swing.JButton Registrarme;
    private javax.swing.JTextField Username;
    private javax.swing.JPasswordField contrasena1;
    private javax.swing.JPasswordField contrasena2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

 public JButton getBotonLoguearse() {
        return Loguearse;
    }

 public void agregarListener(ActionListener al)
    {
        this.Loguearse.addActionListener(al);
        this.Registrarme.addActionListener(al);
    }        

    public Object getBotonRegistrarme() {
        return Registrarme;
    }
    public String getUsername(){
        return this.Username.getText();
    }
    public String getPassword1(){
        return String.valueOf(this.contrasena1.getPassword());
    }
     public String getPassword2(){
        return String.valueOf(this.contrasena2.getPassword());
     }
}
