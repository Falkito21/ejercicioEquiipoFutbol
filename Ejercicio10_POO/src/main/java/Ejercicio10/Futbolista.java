package Ejercicio10;

public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Futbolista:\nDorsal= " + dorsal 
                + "Posicion= " + posicion;
    }
    @Override
    public void partidoFutbol()
    {
        System.out.println("Estamos jugando un partido");
    }
    @Override
    public void entrenamiento()
    {
        System.out.println("Estamos entrenando a full");
    }
    public void darEntrevista()
    {
        System.out.println("Ehhhh..... Jugamos bien");
    }
    
    
}
