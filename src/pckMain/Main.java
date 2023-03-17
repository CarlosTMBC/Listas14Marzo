
package pckMain;

import Controladores.ListaController;
import Modelos.ListaModel;
import Vistas.frmListas;

/**
 *
 * @author carlt
 */
public class Main {
    public static void main(String args[])
    {
        
        frmListas VistaListas = new frmListas();
        ListaModel ModeloLista = new ListaModel();  
        ListaController ControladorLista = new ListaController(VistaListas,ModeloLista);
        
    }
}
