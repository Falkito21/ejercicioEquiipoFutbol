package Ejercicio10;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, 
            String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public String toString() {
        return "Entrenador: \nEstrategia= " + estrategia;
    }
    @Override
    public void partidoFutbol()
    {
        System.out.println("Estoy dirigiendo el partido");
    }
    @Override
    public void entrenamiento()
    {
        System.out.println("Estoy viendo y mejorando el desarrollo "
                + "de los jugadore");
    }
    public void planificarEstrategia()
    {
        System.out.println("Vamos a jugar asi, asa .... y asi");
    }
    
    
    
}
