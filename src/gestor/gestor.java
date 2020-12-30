/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;
import java.util.ArrayList;
import model.vehiculo;

/**
 *
 * @author Dell
 */
public class gestor {

    //Este metodo carga la lista de los autos de manera automatica.
    public ArrayList<vehiculo> cargaListaAutos() {
        ArrayList<vehiculo> listaVehiculo = new ArrayList();

        vehiculo vehiculo1 = new vehiculo("Peugeot", "206", "Puertas: 4", 200000.00);
        listaVehiculo.add(vehiculo1);

        vehiculo vehiculo2 = new vehiculo("Honda", "Titan", "Cilindrada: 125cc", 60000.00);
        listaVehiculo.add(vehiculo2);

        vehiculo vehiculo3 = new vehiculo("Peugeot", "208", "Puertas: 5", 250000.00);
        listaVehiculo.add(vehiculo3);

        vehiculo vehiculo4 = new vehiculo("Yamaha", "YBR", "Cilindrada: 160cc", 80500.50);
        listaVehiculo.add(vehiculo4);

        return listaVehiculo;
    }

    //Este metodo muestra el vehiculo con precio el más elevado.
    public vehiculo vehiculoMasCaro() {
        double precio = 0;
        vehiculo vehiculo = new vehiculo();
        ArrayList<vehiculo> listaVehiculo = cargaListaAutos();

        for (int i = 0; i < listaVehiculo.size(); i++) {
            if (precio < listaVehiculo.get(i).getPrecio()) {
                precio = listaVehiculo.get(i).getPrecio();
                vehiculo = listaVehiculo.get(i);
            }
        }

        return vehiculo;

    }

//Este metodo muestra el vehiculo con precio el más economico.
    public vehiculo vehiculoMasBarato() {
        double precio = vehiculoMasCaro().getPrecio();
        vehiculo vehiculo = new vehiculo();
        ArrayList<vehiculo> listaVehiculo = cargaListaAutos();

        for (int i = 0; i < listaVehiculo.size(); i++) {
            if (precio > listaVehiculo.get(i).getPrecio()) {
                precio = listaVehiculo.get(i).getPrecio();
                vehiculo = listaVehiculo.get(i);
            }
        }

        return vehiculo;

    }

    //Este metodo muestra el vehiculo que posee la letra "y" en su modelo
    public vehiculo vehiculoConY() {
        vehiculo vehiculo = new vehiculo();
        ArrayList<vehiculo> listaVehiculo = cargaListaAutos();

        String modelo;
        String letra = "Y";

        for (int i = 0; i < listaVehiculo.size(); i++) {
            modelo = listaVehiculo.get(i).getModelo();
            int indice = modelo.indexOf(letra);
            if (indice != -1) {
                vehiculo = listaVehiculo.get(i);
            }
        }
        return vehiculo;
    }

    // Implementando el metodo burbuja para ordenar los precios de mayor a menor
    public vehiculo[] precioMayorAMenor() {
        ArrayList<vehiculo> listaVehiculo = cargaListaAutos();
        vehiculo[] vehiculo = new vehiculo[listaVehiculo.size()];
        vehiculo = listaVehiculo.toArray(vehiculo);

        vehiculo aux;

        for (int i = 0; i < vehiculo.length - 1; i++) {
            for (int j = 0; j < vehiculo.length - 1; j++) {
                if (vehiculo[j].getPrecio() < vehiculo[j + 1].getPrecio()) {
                    aux = vehiculo[j];
                    vehiculo[j] = vehiculo[j + 1];
                    vehiculo[j + 1] = aux;
                }
            }

        }
        return vehiculo;

    }

}
