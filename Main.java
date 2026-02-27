import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // PARA QUE EL USUARIO ESCRIBA
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la mascota: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese la especie: ");
        String especie = teclado.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese el peso: ");
        double peso = teclado.nextDouble();

        // Crear objeto con datos ingresados
        Mascota mascota = new Mascota(nombre, especie, edad, peso);

        int opcion;

        do {
            System.out.println("\n--- MENU CLINICA VETERINARIA ---");
            System.out.println("1. Mostrar informacion");
            System.out.println("2. Alimentar mascota");
            System.out.println("3. Vacunar mascota");
            System.out.println("4. Hacer cumplir años");
            System.out.println("5. Mostrar informacion final");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();  // 🔹 cambiado

            switch (opcion) {
                case 1:
                    mascota.mostrarInfo();
                    break;

                case 2:
                    System.out.print("Ingrese cantidad de alimento: ");
                    double cantidad = teclado.nextDouble(); // 🔹 cambiado
                    mascota.alimentar(cantidad);
                    break;

                case 3:
                    mascota.vacunar();
                    break;

                case 4:
                    mascota.cumplirAnios();
                    break;

                case 5:
                    mascota.mostrarInfo();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        teclado.close(); // 🔹 cambiado
    }
}