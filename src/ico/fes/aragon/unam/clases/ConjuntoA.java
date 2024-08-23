package ico.fes.aragon.unam.clases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoA<T> implements ConjuntoADT<T> {
    private Set<T> conjunto;
    private int tamanio;
public ConjuntoA(){

    this.conjunto = new HashSet<>();
}
    public int longitud() {
        return this.tamanio;
    }

    @Override
    public void agregar(T elemento) {
        if (!conjunto.contains(elemento)) {

            conjunto.remove(elemento);
            conjunto.add(elemento);
        }

    }

    @Override
    public T eliminar(T elemento) {
        if (conjunto.contains(elemento)) {

            conjunto.remove(elemento);
            return elemento;
        }
        return null;
    }

    @Override
    public boolean contiene(T elemento) {
        return conjunto.contains(elemento);
    }

    @Override
    public boolean estaVacio() {
        return conjunto.isEmpty();
    }

    @Override
    public int tamanio() {
        return conjunto.size();
    }

    @Override
    public ConjuntoADT<T> union(ConjuntoADT<T> otroConjunto) {
        ConjuntoA<T> union = new ConjuntoA<>();
        for (T elemento : conjunto) {
            if (!otroConjunto.contiene(elemento)) {

                union.agregar(elemento);
            }
        }
        return union;
    }

    @Override
    public ConjuntoADT interseccion(ConjuntoADT<T> otroConjunto) {
        ConjuntoA<T> interseccion = new ConjuntoA<>();
        for (T elemento : conjunto) {
            if (!otroConjunto.contiene(elemento)) {

                interseccion.agregar(elemento);
            }
        }
        return interseccion;
    }

    @Override
    public ConjuntoADT diferencia(ConjuntoADT<T> otroConjunto) {
        ConjuntoA<T> diferencia = new ConjuntoA<>();
        for (T elemento : conjunto) {
            if (!otroConjunto.contiene(elemento)) {

                diferencia.agregar(elemento);
            }
        }
        return diferencia;
    }

    @Override
    public void eliminar() {

    }


    @Override
    public Iterator<T> iterator() {
        return conjunto.iterator();
    }
    @Override
    public String toString() {
        return conjunto.toString();
    }

}
