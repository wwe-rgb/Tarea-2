package ico.fes.aragon.unam.main;

import ico.fes.aragon.unam.clases.ConjuntoA;
import ico.fes.aragon.unam.clases.ConjuntoADT;
import ico.fes.aragon.unam.clases.Perro;

public class PerroMain {
    private static Perro[] conjuntoPerro;

    public static void main(String[] args) {
        ConjuntoADT<Perro> conjuntoPerros = new ConjuntoA<>();
        ConjuntoADT<Perro> conjuntoPerros2 = new ConjuntoA<>();

        conjuntoPerros.agregar(new Perro("Puddle",5,"Blanco"));
        conjuntoPerros.agregar(new Perro("Chihuahua",4,"Negro"));
        conjuntoPerros2.agregar(new Perro("Xolo",3,"Blanco"));
        conjuntoPerros2.agregar(new Perro("Pitbull",3,"Blanco"));
        System.out.println("ConjuntoPerros:"+conjuntoPerros);
        System.out.println("ConjuntoPerros2:"+conjuntoPerros2);


        ConjuntoADT<Perro> interseccion =conjuntoPerros.interseccion(conjuntoPerros2);
        ConjuntoADT<Perro> union =conjuntoPerros.union(conjuntoPerros2);
        ConjuntoADT<Perro> diferencia =conjuntoPerros.diferencia(conjuntoPerros2);


        System.out.println("La union es:"+union);
        System.out.println("La interseccion es:"+interseccion);
        System.out.println("La diferencia es:"+diferencia);

    }

}
