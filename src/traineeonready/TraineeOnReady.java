/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traineeonready;
import java.util.ArrayList;
import model.vehiculo;
import gestor.gestor;

/**
 *
 * @author Dell
 */
public class TraineeOnReady {

    /**
     * @param args the command line arguments
     * @return
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gestor gestor = new gestor();
        ArrayList<vehiculo> listaVehiculo = gestor.cargaListaAutos();
        for (int i = 0; i < listaVehiculo.size(); i++) {
            System.out.println(listaVehiculo.get(i));
        }

        System.out.println("====================");

        vehiculo vehiculo = gestor.vehiculoMasCaro();
        System.out.println("Vehiculo más caro: " + vehiculo.getMarca() + " " + vehiculo.getModelo() + ", Precio: $" + vehiculo.getPrecio());

        vehiculo vehiculo1 = gestor.vehiculoMasBarato();
        System.out.println("Vehiculo más caro: " + vehiculo1.getMarca() + " " + vehiculo1.getModelo() + ", Precio: $" + vehiculo1.getPrecio());

        vehiculo vehiculo2 = gestor.vehiculoConY();
        System.out.println("Vehiculo que contiene en el modelo la letra Y: " + vehiculo2.getMarca() + " " + vehiculo2.getModelo() + " " + vehiculo2.getPrecio());

        System.out.println("====================");

        vehiculo[] vehiculos = gestor.precioMayorAMenor();
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        for (int i = 0; i < vehiculos.length; i++) {

            System.out.println(vehiculos[i]);
        }

    }

}
