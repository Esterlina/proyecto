/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.LoginControlador;
import Controladores.RegistrarseControlador;
/**
 *
 * @author Eric Ramirez Santis
 */
public class PrincipalControlador {
    private LoginControlador inicio;
    private RegistrarseControlador registrar;
    
    public static void main(String[] args) {
        new PrincipalControlador();
        PrincipalControlador cp = new PrincipalControlador();
        cp.inicio = new LoginControlador(cp);
        cp.registrar = new RegistrarseControlador(cp);
        
        cp.inicio.activarLoginV();
    }
    
}
