/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones3;

import java.util.ArrayList;
import relaciones3.entidades.Baraja;
import relaciones3.entidades.Carta;
import relaciones3.servicios.ServicioBaraja;

/**
 *
 * @author lauta
 */
public class Relaciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList();
        Baraja baraja = new Baraja();
        ServicioBaraja sb = new ServicioBaraja();
        ArrayList<Carta> repartidas = new ArrayList();
        
        sb.crearBaraja(baraja);
    
        
        sb.barajar(baraja);
        
        sb.mostrarBaraja(baraja);
        
        System.out.println("-----------------------------------");
        
        //sb.siguienteCarta(baraja, repartidas);
        sb.darCartas(5, baraja, repartidas);
        
        sb.cartasMonton(repartidas);
        
        System.out.println("Cartas que aun se pueden repartir: " + sb.cartasDisponibles(baraja));
        
        
        
        
        
        
        
    }

}
