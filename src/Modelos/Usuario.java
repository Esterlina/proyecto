/***********************************************************************
 * Module:  Usuario.java
 * Author:  Esterlina
 * Purpose: Defines the Class Usuario
 ***********************************************************************/
package Modelos;
import java.util.*;

/** @pdOid 4448778a-ad7b-457a-9a1b-0de7ec5fb3df */
public class Usuario extends Jugador {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    /**metodos**/
     public boolean existe(String username){
        return username.equals(this.username);
    }

    public boolean verificarDatos(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }
    

}