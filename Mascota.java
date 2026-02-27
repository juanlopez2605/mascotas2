public class Mascota {

    // ATRIBUTOS
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    // CONSTRUCTOR CON PARAMETROS
    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = false; // siempre empieza en falso
    }

    // 1. Vacunar
    public void vacunar() {
        vacunado = true;
        System.out.println("La mascota ha sido vacunada.");
    }

    // 2. Alimentar
    public void alimentar(double cantidad) {
        if (cantidad > 0) {
            peso += cantidad;
            System.out.println("La mascota fue alimentada.");
        } else {
            System.out.println("No se permiten cantidades negativas.");
        }
    }

    // 3. Cumplir años
    public void cumplirAnios() {
        edad++;
        System.out.println("La mascota ha cumplido un año más.");
    }

    // 4. Mostrar información
    public void mostrarInfo() {
        System.out.println("\n----- Información de la Mascota -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Vacunado: " + vacunado);
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
}