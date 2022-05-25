package Ejercicio10;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "Persona: \nNombre=" + nombre 
                + "\nApellido=" + apellido 
                + "\nEdad=" + edad;
    }
    public void viajar()
    {
        System.out.println("Estamos viajando");
    }
    public abstract void partidoFutbol();
    public abstract void entrenamiento();
}
