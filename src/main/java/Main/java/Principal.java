package Main.java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

    public static void main(String[] args) {

        // objetos instanciados
        Basilisco basilisco = new Basilisco("Reptil", "Basilisco", "Lugares humedos y espaciosos", 0);
        Fenix fenix = new Fenix("Volador", "Fawks", "Llanuras altas", 2);
        SwoopingEvil swoopingEvil = new SwoopingEvil("Volador", "Newt Jr", "bosques", null);

        // constantes
        final String KILLER = "Gran capacidad para matar";
        final String HEALTH = "Tiene capacidad para curarse a s� mismo y a otros";
        final String APPEAR = "Puede aparecerse a s� mismo y a otros";
        final String NOTKILLER = "No representa un peligro para la comunidad";
        final String NOTAPPEAR = "No puede aparecerse";
        final String NOTHEALTH = "No tiene capacidad curativa";

        // variable controlador
        Integer ingreso = -1;

        // variable de entrada de datos.
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(
                    "\t\tInforme sobre animales fantasticos\nPresione:\n\t1) Basilisco.\n\t2) Fenix.\n\t3) Swooping Evil.\n\t0) Terminar.");

            while (ingreso < 0 || ingreso > 3) {
                try {
                    System.out.println("Ingrese opcion");
                    ingreso = input.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("\t\tERROR. SOLO PUEDE INGRESAR NUMEROS!");
                    ingreso = -1;
                }

                input.nextLine();
            } 

            switch (ingreso) {
                case 1:
                    System.out.println(basilisco.toString());

                    if (basilisco.appear())
                        System.out.println(APPEAR);
                    else
                        System.out.println(NOTAPPEAR);

                    if (basilisco.kill())
                        System.out.println(KILLER);
                    else
                        System.out.println(NOTKILLER);

                    if (basilisco.health())
                        System.out.println(HEALTH);
                    else
                        System.out.println(NOTHEALTH);

                    System.out.println(basilisco.sound());

                    System.out.println(basilisco.velocity());
                    System.out.println("\n");
                    System.out.println("\n");

                    // (basilisco.appear()) ? System.out.println(APPEAR) : System.out.println("No
                    // puede aparecerse");
                    ingreso = -1;
                    break;
                case 2:
                    System.out.println(fenix.toString());

                    if (fenix.appear())
                        System.out.println(APPEAR);
                    else
                        System.out.println(NOTAPPEAR);

                    if (fenix.kill())
                        System.out.println(KILLER);
                    else
                        System.out.println(NOTKILLER);

                    if (fenix.health())
                        System.out.println(HEALTH);
                    else
                        System.out.println(NOTHEALTH);

                    System.out.println(fenix.sound());

                    System.out.println(fenix.velocity());
                    System.out.println("\n");
                    System.out.println("\n");

                    ingreso = -1; 
                    break;

                case 3:
                    System.out.println(swoopingEvil.toString());

                    if (swoopingEvil.appear())
                        System.out.println(APPEAR);
                    else
                        System.out.println(NOTAPPEAR);

                    if (swoopingEvil.kill())
                        System.out.println(KILLER);
                    else
                        System.out.println(NOTKILLER);

                    if (swoopingEvil.health())
                        System.out.println(HEALTH);
                    else
                        System.out.println(NOTHEALTH);

                    System.out.println(swoopingEvil.sound());

                    System.out.println(swoopingEvil.velocity());
                    System.out.println("\n");
                    System.out.println("\n");

                    ingreso = -1;
                    break;

                case 0:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Prueba de nuevo\n");
                    ingreso = -1;
                    break;
            }

        } while (ingreso != 0);

        // cerramos el input
        input.close();
    } 
}
