/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Eric Ramirez Santis
 */
import Modelos.Usuario;
import Vistas.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorRegistro implements ActionListener {

    private ControladorPrincipal main;
    private ControladorLogin LoginC;
    private VistaRegistro RegV;
    private Usuario UsuarioM;
    
        
    public ControladorRegistro(ControladorPrincipal main){
        RegV = new VistaRegistro();
        RegV.agregarListener(this);
    }
    public void activarVistaRegistro(){
        RegV.setVisible(true);

    }

    public void botonLogin() {
        LoginC = new ControladorLogin(main);
        LoginC.activarLoginV();
        RegV.setVisible(false);
    }

    public void botonRegistrarse() {
        String loginString = RegV.getUsername();
        String contrasena = RegV.getPassword1();
        int LGUsuario = loginString.length();
        int LGcontrasena = loginString.length();
        if (LGUsuario < 1){
            JOptionPane.showMessageDialog(RegV, "Nombre de Usuario en Blanco");
        }
        if (LGcontrasena < 1){
            JOptionPane.showMessageDialog(RegV, "Contraseña en Blanco");
        }
        else if (LGUsuario < 6 || LGUsuario >14){
            JOptionPane.showMessageDialog(RegV, "El Nombre de Usuario debe tener entre 6 a 14 caracteres");
        }
        else if (RegV.getUsername().contains(" ")){
            JOptionPane.showMessageDialog(RegV, "El Nombre de Usuario No puede contener espacios");
        }
        else if (RegV.getUsername().contains(" ")){
            JOptionPane.showMessageDialog(RegV, "El Nombre de Usuario No puede contener espacios");
        }
        else if (!RegV.getUsername().matches("[a-zA-Z0-9]+")){
            JOptionPane.showMessageDialog(RegV, "Este nombre de usuario contiene caracteres invalidos");   
        }
        else if ( LGcontrasena < 1){
            JOptionPane.showMessageDialog(RegV, "Contraseña en Blanco");
        }
        else if (LGcontrasena < 4 || LGcontrasena >15){
            JOptionPane.showMessageDialog(RegV, "La contraseña debe tener entre 4 a 14 caracteres");
        }
        else if (!RegV.getPassword1().equals(RegV.getPassword2())){
            JOptionPane.showMessageDialog(RegV, "Las contraseñas no coinciden");
        }
        else try {
            if (Usuario.VerificarDatos(loginString+" "+contrasena,false)==true){
                System.out.println(loginString);
                JOptionPane.showMessageDialog(RegV, "Registro Exitoso");
                RegV.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(RegV, "Nombre de Usuario ya registrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==RegV.getBotonLoguearse()){
            botonLogin();
        }
        if(ae.getSource()==RegV.getBotonRegistrarme()){
            botonRegistrarse();
        }
    }
}
