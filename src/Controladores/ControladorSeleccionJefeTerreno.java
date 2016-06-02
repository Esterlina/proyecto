/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.JefeDeTerreno;
import Modelos.Usuario;
import Modelos.PersonajeNoJugable;
import Vistas.VistaSeleccionJefeTerreno;
import Vistas.VistaMenuPrincipal;
import Controladores.ControladorMenuPrincipal;
import Vistas.VistaRegistro;

/**
 *
 * @author Esterlina
 */
public class ControladorSeleccionJefeTerreno {
    private ControladorPrincipal main;
    private ControladorMenuPrincipal menuC;
    private VistaSeleccionJefeTerreno jefeTerrenoV;
    private VistaMenuPrincipal menuV;
    private Usuario usarioM;
    private PersonajeNoJugable pnj;
    
    public ControladorSeleccionJefeTerreno(ControladorPrincipal main){
        jefeTerrenoV = new VistaSeleccionJefeTerreno();
        jefeTerrenoV.agregarListener(this);
    }
    public void activarVistaRegistro(){
        jefeTerrenoV.setVisible(true);
    }
}
