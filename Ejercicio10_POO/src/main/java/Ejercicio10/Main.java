package Ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner e = new Scanner(System.in);
    static Persona ft1 = new Futbolista(10, "Delantero", 
            "Leonel", "Messi", 35);
    static Persona ft2 = new Futbolista(5, "Centro Campista", 
            "Ever", "Banega", 33);
    static Persona dt = new Entrenador("Ofenciva", 
            "Silvio", "Rodrigues", 45);
    static Persona dc = new Doctor("Licenciado Curador",
            25, "Pepe", "Antie", 55);
    
    public static void main(String[] args)
    {
        persona.add(ft1);
        persona.add(ft2);
        persona.add(dt);
        persona.add(dc);
        menu();
    }
    
    static int opcion;
    public static void menu()
    {
        do {
            System.out.println("\t::MENU::");
            System.out.println("1.Viajar");
            System.out.println("2.Jugar Partido");
            System.out.println("3.Entrenar");
            System.out.println("4.Planificar Estrategia");
            System.out.println("5.Dar Entrevista");
            System.out.println("6.Curar Lesion");
            System.out.println("7.Salir");
            opcion = e.nextInt();
            seleccion();
        } while (opcion != 7);
    }
    public static void seleccion()
    {
        switch (opcion) {
            case 1:
                viajar();
                break;
            case 2:
                jugarPartido();
                break;
            case 3:
                entrenar();
                break;
            case 4:
                planificarEntrenamiento();
                break;
            case 5:
                darEntrevista();
                break;
            case 6:
                curar();
                break;
            case 7:
                break;
            default:
                System.out.println("\nOPCION ERRONEA\n");
                break;
        }
    }
    public static void viajar()
    {
        for(Persona equipo: persona)
        {
            System.out.println("Nombre: "+equipo.getNombre()
                    +"\nApellido: "+ equipo.getApellido());
            equipo.viajar();
        }
    }
    public static void jugarPartido()
    {
        for(Persona equipo: persona)
        {
            System.out.println("Nombre: "+equipo.getNombre()
                    +"\nApellido: "+ equipo.getApellido());
            equipo.partidoFutbol();
        }
    }
    public static void entrenar()
    {
        for(Persona equipo: persona)
        {
            System.out.println("Nombre: "+equipo.getNombre()
                    +"\nApellido: "+ equipo.getApellido());
            equipo.entrenamiento();
        }
    }
    public static void planificarEntrenamiento()
    {
        System.out.println("Nombre: "+dt.getNombre()
                +"\nApellido: "+dt.getApellido());
        ((Entrenador)dt).planificarEstrategia();
    }
    public static void darEntrevista()
    {
        System.out.println("Nombre: "+ft1.getNombre()
                +"\nApellido: "+ft2.getApellido());
        ((Futbolista)ft1).darEntrevista();
        System.out.println("Nombre: "+ft1.getNombre()
                +"\nApellido: "+ft2.getApellido());
        ((Futbolista)ft2).darEntrevista();
    }
    public static void curar()
    { 
        System.out.println("Nombre: "+dc.getNombre()
                +"\nApellido: "+dc.getApellido()
                +"\n"+dc.toString());
        ((Doctor)dc).curar();
    }
}