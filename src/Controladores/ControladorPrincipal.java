/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.ControladorLogin;
import Controladores.ControladorRegistro;
import Controladores.ControladorMenuPrincipal;
/**
 *
 * @author Eric Ramirez Santis
 */
public class ControladorPrincipal {
    private ControladorLogin inicio;
    private ControladorRegistro registrar;
    private ControladorMenuPrincipal menuPrincipal;
    
    public static void main(String[] args) {
        new ControladorPrincipal();
        ControladorPrincipal cp = new ControladorPrincipal();
        cp.inicio = new ControladorLogin(cp);
        cp.registrar = new ControladorRegistro(cp);
        cp.menuPrincipal = new ControladorMenuPrincipal (cp);
        
        cp.inicio.activarLoginV();
    }
    
}
