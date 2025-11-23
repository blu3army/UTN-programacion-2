import caso1.Auto;
import caso1.Vehiculo;
import caso2.Circulo;
import caso2.Figura;
import caso2.Rectangulo;
import caso3.Empleado;
import caso3.EmpleadoPlanta;
import caso3.EmpleadoTemporal;
import caso4.Animal;
import caso4.Gato;
import caso4.Perro;
import caso4.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        System.out.println("\nCaso 1\n");

        Vehiculo vehiculo = new Vehiculo("Ford", "Focus");
        vehiculo.mostrarInfo();
        Auto auto = new Auto("Jeep", "Commander", "5");
        auto.mostrarInfo();

        System.out.println("\nCaso 2\n");

        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(2.5);
        figuras[1] = new Rectangulo(4, 5);
        figuras[2] = new Circulo(1.2);

        for (Figura f : figuras) {
            System.out.println(String.format("%s - Area: %.2f", f.getNombre(), f.calcularArea()));
        }


        System.out.println("\nCaso 3\n");

        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 3000));
        empleados.add(new EmpleadoTemporal("Luis", 15, 120));
        empleados.add(new EmpleadoPlanta("Maria", 3200));
        empleados.add(new EmpleadoTemporal("Carlos", 20, 100));

        for (Empleado e: empleados){
            System.out.println("Empleado " + e.getNombre() + " Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta){
                System.out.println("Es un empleado de planta");
            }
            else {
                System.out.println("Es un empleado temporal");
            }

        }

        System.out.println("\nCaso 4\n");

        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }
}
