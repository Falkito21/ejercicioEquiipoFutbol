package Ejercicio10;

public class Doctor extends Persona{
    private String titulacion;
    private int aniosExperiencia;

    public Doctor(String titulacion, int aniosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Doctor: \ntitulacion= " 
                + titulacion 
                + "\nAniosExperiencia= " 
                + aniosExperiencia;
    }
    @Override
    public void partidoFutbol()
    {
        System.out.println("Estoy listo por si alguien se lesion");
    }
    @Override
    public void entrenamiento()
    {
        System.out.println("Estoy viendo que nadie tenga una lesion");
    }
    public void curar()
    {
        System.out.println("Estoy curando a un jugador");
    }
    
    
}
