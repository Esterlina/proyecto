package Controladores;

import Modelos.Usuario;
import Vistas.VistaLogin;
import Vistas.VistaMenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener{
    
    private ControladorPrincipal main;
    private VistaLogin LoginV;
    private Usuario UsuarioM;
    private int IntentosFallidos = 0;
    private ControladorRegistro RegC;
    private ControladorMenuPrincipal menuC;
    
    public ControladorLogin(ControladorPrincipal main){
        LoginV = new VistaLogin();
        LoginV.agregarListener(this);
    }
    
    public void activarLoginV(){
         LoginV.setVisible(true);
    }

    public void botonIngresar(){
        try {
            String Username = LoginV.getUsername();
            String password = LoginV.getPassword();
            int LGContrasena = password.length();
            int LGUsuario = Username.length();
            String LoginString = Username+" "+password;
            boolean booleano;
            if (LGUsuario < 1){
                JOptionPane.showMessageDialog(LoginV, "Nombre de Usuario en Blanco");}
            else if ( LGContrasena < 1){
                JOptionPane.showMessageDialog(LoginV, "Contraseña en Blanco");}
            else if ( (booleano = Usuario.VerificarDatos(LoginString,true))){
                UsuarioM = new Usuario();
                UsuarioM.setUsuario(Username);
                UsuarioM.setContrasena(password);
                JOptionPane.showMessageDialog(LoginV, "Login Existoso");
                menuC = new ControladorMenuPrincipal(main);
                menuC.activarVistaMenuPrincipal();
                LoginV.dispose();
            }
            else{
                JOptionPane.showMessageDialog(LoginV, "Datos Incorrectos");
                IntentosFallidos+=1;
                if (IntentosFallidos == 5){
                    LoginV.dispose();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }

    public void botonRegistrate() {
        RegC = new ControladorRegistro(main);
        RegC.activarVistaRegistro();
        LoginV.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==LoginV.getBotonIngresar()){
            botonIngresar();
        }
        if(ae.getSource()==LoginV.getBotonRegistarse()){
            botonRegistrate();
        }
        
    }
}

