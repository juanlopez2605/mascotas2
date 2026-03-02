import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Mascota> lstMascota= new ArrayList<>();
        Scanner teclado= new Scanner(System.in);

        int op;

        do {
            System.out.println("1. Crear Mascotas ");
            System.out.println("2. Mostrar Todo ");
            System.out.println("3. Buscar por nombre ");
            System.out.println("4. Salir ");
            op = teclado.nextInt();

            switch (op){
                case 1:
                    System.out.println("Crear la mascota");
                    System.out.println("ingrese la nombre de la mascota ");
                    String nombre = teclado.next();
                    System.out.println("ingrese la especie ");
                    String especie = teclado.next();
                    System.out.println("ingrese el peso ");
                    double peso = teclado.nextDouble();
                    System.out.println("ingrese la edad ");
                    int edad = teclado.nextInt();

                    Mascota m1 = new Mascota(nombre, especie, edad, peso);
                    lstMascota.add(m1);
                    break;

                case 2: for(Mascota m :lstMascota){
                    System.out.println(m);
                }

                case 3:
                    System.out.println("Buscar mascota");
                    System.out.println("Ingrese el nombre a buscar");
                    String nombreBuscado = teclado.next();

                    Mascota encontrada = null;

                    for (Mascota mascota : lstMascota){
                        if (mascota.getNombre().equalsIgnoreCase(nombreBuscado)){
                            encontrada = mascota;
                            break;
                        }
                    }

                    if (encontrada != null){
                        System.out.println("Ingrese la accion que desea hacer: ");
                        System.out.println("1. Vacunar ");
                        System.out.println("2. Alimentar ");
                        System.out.println("3. Cumplir años ");

                        int accion = teclado.nextInt();

                        if (accion == 1){
                            encontrada.vacunar();
                        } else if (accion == 2){
                            System.out.println("Ingrese la cantidad de alimento:");
                            double cantidad = teclado.nextDouble();
                            encontrada.alimentar(cantidad);
                        } else if (accion == 3){
                            encontrada.cumplirAnios();
                        }
                    } else {
                        System.out.println("Mascota no encontrada");
                    }
                    break;
            }
        }while (op !=4);

    }
}
