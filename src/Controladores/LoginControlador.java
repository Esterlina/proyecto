package Controladores;

import Modelos.Usuario;
import Vistas.Login;
import Vistas.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginControlador implements ActionListener{
    
    private PrincipalControlador main;
    private Login LoginV;
    private Usuario UsuarioV;
    private int IntentosFallidos = 0;
    private RegistrarseControlador RegV;
    
    public LoginControlador(PrincipalControlador main){
        LoginV = new Login();
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
                UsuarioV = new Usuario();
                UsuarioV.setUsuario(Username);
                UsuarioV.setContrasena(password);
                JOptionPane.showMessageDialog(LoginV, "Login Existoso");
                MenuPrincipal MenuPrincipal= new MenuPrincipal();
                MenuPrincipal.setVisible(true);
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
            Logger.getLogger(LoginControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }

    public void botonRegistrate() {
        RegV = new RegistrarseControlador(main);
        RegV.activarVistaRegistro();
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

