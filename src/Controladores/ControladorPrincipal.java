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
    }
    
    private void iniciarRegistro(){
        this.contreg = new ControladorRegistro();
    }
    private void iniciarSesion(){
        String mensaje = this.contlog.vereficarDatos();
        if("Datos correctos".equals(mensaje)){
            this.contmenu = new ControladorMenuPrincipal();
        }else{
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
