/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author carlt
 */
public class ListaModel {
    Queue<Clientes> ListaClientes = new LinkedList();
    public void EncolarCLiente(String apellido, String nombre)
    {
        Clientes nuevoCliente = new Clientes(apellido, nombre);
        this.ListaClientes.add(nuevoCliente);
        
        JOptionPane.showMessageDialog(null, "");
    }
    
    public Queue ListarClientes()
    {
        
        return this.ListaClientes;
    }
    
    public void DesEncolar()
    {
        this.ListaClientes.poll();
    }
}
