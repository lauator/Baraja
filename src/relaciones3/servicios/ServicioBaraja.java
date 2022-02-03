/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones3.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import relaciones3.entidades.Baraja;
import relaciones3.entidades.Carta;

/**
 *
 * @author lauta
 */
public class ServicioBaraja {
    
    public void crearBaraja(Baraja baraja){
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 8 || j == 9) {
                    continue;
                }

                if (i == 0) {
                    Carta carta = new Carta("Espadas", j);
                    baraja.getCartas().add(carta);
                }
                if (i == 1) {
                    Carta carta = new Carta("Copas", j);
                    baraja.getCartas().add(carta);
                }
                if (i == 2) {
                    Carta carta = new Carta("Oros", j);
                    baraja.getCartas().add(carta);
                }
                if (i == 3) {
                    Carta carta = new Carta("Bastos", j);
                    baraja.getCartas().add(carta);
                }

            }
        }
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getCartas());
    }

    public Carta siguienteCarta(Baraja baraja, ArrayList<Carta> repartidas) {

        Carta carta = new Carta();

        Iterator<Carta> it = baraja.getCartas().iterator();

        if (it.hasNext()) {
            carta = it.next();
            repartidas.add(carta);
            it.remove();

        } else {
            System.out.println("No hay mas cartas");
        }

        return carta;
    }

    public int cartasDisponibles(Baraja baraja) {
        return baraja.getCartas().size();
    }

    public ArrayList<Carta> darCartas(int cantidad, Baraja baraja, ArrayList<Carta> repartidas) {
        ArrayList<Carta> cartas = new ArrayList();
        Carta carta = new Carta();

        Iterator<Carta> it = baraja.getCartas().iterator();

        for (int i = 0; i < cantidad; i++) {
            if (it.hasNext()) {
                carta = it.next();
                cartas.add(carta);
                repartidas.add(carta);
                it.remove();

            } else {
                System.out.println("No hay mas cartas");
            }
        }

        return cartas;
    }

    public void cartasMonton(ArrayList<Carta> repartidas) {
        for (Carta carta : repartidas) {
            System.out.println(carta);
        }

        if (repartidas.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        }
    }

    public void mostrarBaraja(Baraja baraja) {
        for (Carta carta : baraja.getCartas()) {
            System.out.println(carta);
        }
    }
    
    
    
    
    

}
