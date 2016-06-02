/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Usuario;
import Vistas.VistaLogin;
import Vistas.VistaMenuPrincipal;
import Vistas.VistaRegistro;
import Controladores.ControladorLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Esterlina
 */
public class ControladorMenuPrincipal implements ActionListener {
    
    private ControladorPrincipal main;
    private VistaLogin LoginV;
    private ControladorLogin LoginC;
    private Usuario UsuarioV;
    private VistaMenuPrincipal menuV;
    
    public ControladorMenuPrincipal(ControladorPrincipal main){
        menuV = new VistaMenuPrincipal();
        menuV.agregarListener(this);
    }
    public void activarVistaMenuPrincipal(){
        menuV.setVisible(true);
    }
    public void botonVerPerfil(){
        
    }
    public void botonPartidaLibre(){
        
    }
    public void botonPuzzleDados(){
        
    }
    public void botonTorneo(){
        
    }
    public void botonConfiguraciones(){
        
    }
    
    public void botonCerrarSesion(){
        LoginC = new ControladorLogin(main);
        LoginC.activarLoginV();
        menuV.dispose();
    }
        
        
        
    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==menuV.getbotonCerrarSesion()){
            botonCerrarSesion();
        }
    }
}
    
    
    
    
    
    
  