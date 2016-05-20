/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Usuario;
import Vistas.Login;

/**
 *
 * @author Esterlina
 */
public class ControladorLogin {
    private Login visLog;
    private Usuario usuario;
    
    public ControladorLogin(){
        this.visLog = new Login();
        this.usuario = new Usuario("lina", "123");
    }

    public Login getVisLog() {
        return visLog;
    }
    
    public String vereficarDatos(){
        if (visLog.getnombre().isEmpty() || visLog.getpassword().isEmpty()){
            return "Algun campo esta vacio";
        }else{
            if (usuario.existe(visLog.getnombre())){
                if(usuario.verificarDatos(visLog.getnombre(), visLog.getpassword())){
                    return "Datos correctos";
                }else{
                    return "Contraseña incorrecta";
                }
            }else{
                return "Usuario no existe";
            }
        }
    }
        
    }

