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
import Vistas.Registrarse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistrarseControlador implements ActionListener {

    private PrincipalControlador main;
    private LoginControlador LoginV;
    private Registrarse RegistrarseV;
    private Usuario UsuarioV;
    
        
    public RegistrarseControlador(PrincipalControlador main){
        RegistrarseV = new Registrarse();
        RegistrarseV.agregarListener(this);
    }
    public void activarVistaRegistro(){
        RegistrarseV.setVisible(true);

    }

    public void botonLogin() {
        LoginV = new LoginControlador(main);
        LoginV.activarLoginV();
        RegistrarseV.setVisible(false);
    }

    public void botonRegistrarse() {
        String loginString = RegistrarseV.getUsername();
        String contrasena = RegistrarseV.getPassword1();
        int LGUsuario = loginString.length();
        int LGcontrasena = loginString.length();
        if (LGUsuario < 1){
            JOptionPane.showMessageDialog(RegistrarseV, "Nombre de Usuario en Blanco");
        }
        else if (LGUsuario < 6 || LGUsuario >14){
            JOptionPane.showMessageDialog(RegistrarseV, "El Nombre de Usuario debe tener entre 6 a 14 caracteres");
        }
        else if (RegistrarseV.getUsername().contains(" ")){
            JOptionPane.showMessageDialog(RegistrarseV, "El Nombre de Usuario No puede contener espacios");
        }
        else if ( LGcontrasena < 1){
            JOptionPane.showMessageDialog(RegistrarseV, "Contraseña en Blanco");
        }
        else if ( LGcontrasena < 6 || LGcontrasena >14){
            JOptionPane.showMessageDialog(RegistrarseV, "La contraseña debe tener entre 6 a 14 caracteres");
        }
        else if (RegistrarseV.getUsername().contains(" ")){
            JOptionPane.showMessageDialog(RegistrarseV, "El Nombre de Usuario No puede contener espacios");
        }
        else if (!RegistrarseV.getPassword1().equals(RegistrarseV.getPassword2())){
            JOptionPane.showMessageDialog(RegistrarseV, "Las contraseñas no coinciden");
        }
        else try {
            if (Usuario.VerificarDatos(loginString+" "+contrasena,false)==true){
                System.out.println(loginString);
                JOptionPane.showMessageDialog(RegistrarseV, "Registro Existoso");
            }
            else{
                JOptionPane.showMessageDialog(RegistrarseV, "Nombre de Usuario ya registrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(RegistrarseControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==RegistrarseV.getBotonLoguearse()){
            botonLogin();
        }
        if(ae.getSource()==RegistrarseV.getBotonRegistrarme()){
            botonRegistrarse();
        }
    }
}
