/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojacomputador;

import telas.TelaCompra;

/**
 *
 * @author priscyla.poliveira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        TelaCompra frame = new TelaCompra();
        frame.setVisible(true);
        frame.setTitle("Realização de compra");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    
}
