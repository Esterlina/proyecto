package Modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Usuario extends Jugador{
    private String Usuario = "";
    private String Contrasena = "";

    public Usuario() {
    }

    public Usuario(String Usuario, String Contrasena) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }    

    //@Override
    //public String toString() {
        //return Usuario + " "+Contrasena;
    //}
    public static boolean VerificarDatos(String Login , boolean login) throws FileNotFoundException, IOException{
        String cadena;
        FileReader FILE;
        FileWriter FILEW;
        BufferedReader br;
        BufferedWriter bw;
        FILE = new FileReader("src\\Database\\Usuarios.txt");
        br = new BufferedReader(FILE);
        if (login){ 
            while ((cadena = br.readLine()) != null){
                if (cadena.equals(Login)){
                    FILE.close();
                    return true;
                }
            }
            FILE.close();
            return false;
        }else{
            while((cadena = br.readLine()) != null){
                String token = cadena.split(" ")[0];
                if (token.equals(Login.split(" ")[0])){
                    return false;
                }
            }
            FILE.close();
            File archivoUsuario = new File("src\\Database\\Usuarios.txt");
            PrintWriter escritor = new PrintWriter(new FileWriter(archivoUsuario, true));
            escritor.println(Login);
            escritor.close();
            return true;
        }
    }
}
