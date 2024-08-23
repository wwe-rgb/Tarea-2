package ico.fes.aragon.unam.clases;

import java.util.Objects;

public class Perro  {
    private String raza;
    private int edad;
    private String color;

    public Perro() {
    }

    public Perro(String raza, int edad, String color) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public int hashCode(){
        return Objects.hash(raza,edad,color);
    }


    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this ==obj);
        return true;
    }
}
