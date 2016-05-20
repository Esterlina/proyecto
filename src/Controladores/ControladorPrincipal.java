/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Esterlina
 */
public class ControladorPrincipal {
    private ControladorLogin contlog;
    private ControladorMenuPrincipal contmenu;
    private ControladorRegistro contreg;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        ControladorPrincipal contPrin = new ControladorPrincipal();
        contPrin.contlog = new ControladorLogin();
        contPrin.contlog.getVisLog().setVisible(true);
        contPrin.contreg = new ControladorRegistro();
        contPrin.agregarListenersVistaLogin();
    }
    
    private void agregarListenersVistaLogin(){
        // Obtener boton de ingresar
        JButton botonIngresar = this.contlog.getVisLog().getBotonIngresar();
        botonIngresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                iniciarSesion();
            }
        });
        JButton botonRegistrar = this.contlog.getVisLog().getBotonRegistrarse();
        botonRegistrar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                iniciarRegistro();
            }
        });
        JButton botonVolverLogin = this.contreg.getreg().getBotonLoguearse();
        botonVolverLogin.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            volverLogin();
        }
    });
    }
    
    private void iniciarRegistro(){
        this.contlog.getVisLog().setVisible(false);
        this.contreg.getreg().setVisible(true);
    }
    private void iniciarSesion(){
        String mensaje = this.contlog.vereficarDatos();
        if("Datos correctos".equals(mensaje)){
            this.contmenu = new ControladorMenuPrincipal();
            this.contlog.getVisLog().setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    
    private void volverLogin(){
        this.contreg.getreg().setVisible(false);
        this.contlog.getVisLog().setVisible(true);
    }
}
