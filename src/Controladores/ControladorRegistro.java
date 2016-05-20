/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Vistas.Registro;
import Modelos.Usuario;

/**
 *
 * @author Esterlina
 */
public class ControladorRegistro {
    private Registro reg;
    
    public ControladorRegistro(){
        this.reg = new Registro();
    }   
    public Registro getreg(){
        return this.reg;
    }
}
