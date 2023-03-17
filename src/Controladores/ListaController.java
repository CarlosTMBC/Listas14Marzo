
package Controladores;

import Vistas.frmListas;
import Modelos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class ListaController implements ActionListener {
frmListas VistaLista;
ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        //poner a la escucha los botones
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        //Levantar formulario
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.btnIngresarCliente)
        {
            this.ModeloLista.EncolarCLiente(this.VistaLista.txtApellidos.getText(),this.VistaLista.txtNombre.getText());
            Queue<Clientes>listaLocal = this.ModeloLista.ListarClientes();
            String Cadena = "";
            for(Clientes MiListaClientes: listaLocal)
            {
                Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombres()+"\n";
            }
            
            this.VistaLista.txtAListaClientes.setText(Cadena);
            this.VistaLista.txtApellidos.setText("");
            this.VistaLista.txtNombre.setText("");
            
        }
        if(e.getSource()==this.VistaLista.btnAtenderCliente)
        {
           this.ModeloLista.DesEncolar();
           
        }
        if(e.getSource()==this.VistaLista.btnAtenderTodos)
        {
          
        }
    }
    
}
