/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.ControladorLogin;
import Controladores.ControladorRegistro;
import Modelos.Musica;
import java.io.IOException;
/**
 *
 * @author Eric Ramirez Santis
 */
public class ControladorPrincipal {
    private ControladorLogin inicio;
    private ControladorRegistro registrar;
    
    public static void main(String[] args) throws IOException {
        new ControladorPrincipal();
        Musica.cargarDatabase();
        ControladorPrincipal cp = new ControladorPrincipal();
        cp.inicio = new ControladorLogin(cp);
        cp.registrar = new ControladorRegistro(cp);
        
        cp.inicio.activarLoginV();
    }
    
}
