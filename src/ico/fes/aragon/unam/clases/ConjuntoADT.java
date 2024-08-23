package ico.fes.aragon.unam.clases;

public interface ConjuntoADT<T> extends Iterable<T> {
   public void agregar(T elemento);

    T eliminar(T valor);

   public boolean contiene(T elemento);

   public boolean estaVacio();

   public int tamanio();

   public ConjuntoADT<T>union(ConjuntoADT<T> otroConjunto);
   public ConjuntoADT<T>interseccion(ConjuntoADT<T> otroConjunto);
   public ConjuntoADT<T>diferencia(ConjuntoADT<T> otroConjunto);

    void eliminar();


    /*String[] Frutas= new String[5];
    Frutas[0]= "Durazno";
    Frutas[1]= "Mango";
    Frutas[2]= "Manzana";
    Frutas[3]= "Uva";
    Frutas[4]= "Fresa";
    ArrayList fruitList = new ArrayList();
        System.out.println(1);
        fruitList.add("Durazno");
        fruitList.add("Mango");
        fruitList.add("Manzana");
        fruitList.add("Uva");
        fruitList.add("Fresa");*/
    
}

     