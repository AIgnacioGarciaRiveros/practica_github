package integrador;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroCapicua(Integer num) {
        boolean condicion = false;
        int numAux;
        int numInverso = 0;
        int residuoMod;

        if (num != null) {
            numAux = num;
            while (numAux != 0) {
                residuoMod = numAux % 10;
                numInverso = numInverso * 10 + residuoMod;
                numAux = numAux / 10;
                if (num == numInverso) {
                    condicion = true;
                }
            }
            if (num == 0) {
                condicion = true;
            }

        }

        return condicion;
    }

    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de ladrones en ronda, contemplando
     * al primer ladron que se sienta, como el ladron 0. A los ladrones se le
     * repartira una m cantidad de caramelos contemplando que se comenzaran a
     * repartir los caramelos desde el primer ladron (inicio). El ultimo
     * caramelo en repartirse estara podrido, determinar a que ladron, segun su
     * posicion en la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadLadrones
     * @return ladronQueLeTocoElCarameloPodrido
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        int[] presos;
        presos = new int[cantidadLadrones];
        presos[inicio] = 0;
        int posicion = 0;

        for (int i = inicio; i < presos.length; i++) {
            if (cantidadCaramelos > 0) {
                presos[i] = presos[i] + 1;
                cantidadCaramelos = cantidadCaramelos - 1;
                posicion = i;
            } else {
                posicion = i - 1;
                break;
            }

        }
        do {

            System.out.println("");
            for (int i = 0; i < presos.length; i++) {
                if (cantidadCaramelos > 0) {
                    presos[i] = presos[i] + 1;
                    cantidadCaramelos = cantidadCaramelos - 1;
                    posicion = i;
                } else {
                    posicion = i - 1;
                    break;
                }

            }

        } while (cantidadCaramelos != 0);

        return posicion;
    }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :(. List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        //Clases a importar
        /*import java.util.ArrayList;
          import java.util.Collections;
          import java.util.List;*/
        List<String> mediasAmigas = new ArrayList();
        List <String>mediasAmigasAux = new ArrayList();
        Collections.sort(pasajeros);
        String pasajero = pasajeros.get(0);
       
        for (int i = 1; i < pasajeros.size(); i++) {

            if (pasajeros.get(i).equalsIgnoreCase(pasajero)) {
                mediasAmigas.add(pasajero);

            } else {
                pasajero = pasajeros.get(i);
            }
        }

        for (String aux : mediasAmigas) {
            if (!mediasAmigasAux.contains(aux)) {
                mediasAmigasAux.add(aux);
            }
        }
        return mediasAmigasAux;
    }
}
