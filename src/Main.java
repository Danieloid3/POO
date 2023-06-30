import Entidad.Circunferencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        Circunferencia circulo1 = new Circunferencia(scan.nextDouble());
        System.out.println("El radio del circulo es: " + circulo1.getRadio());
        System.out.println("El área del circulo es: " + circulo1.area());
        System.out.println("El perímetro del circulo es: " + circulo1.perimetro());


    }
}