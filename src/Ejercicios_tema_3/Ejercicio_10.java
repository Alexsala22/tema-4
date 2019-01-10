package Ejercicios_tema_3;
import java.util.InputMismatchException;
import java.util.Scanner;
/***
 * PROGRAMA DE MENU DE AREAS
 *** 
 * AUTOR: Alejandro Martínez Loro
 *** 
 * FECHA: 16/10/2018
 *** 
 * CURSO: DM1B
 * 
 ***/
public class Ejercicio_10 {
    public static int areaRectangulo() {
        int base, altura,area = 0;
        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca la base del rectángulo");
        base=usuario.nextInt();
        System.out.println("Introduzca la altura del rectángulo");
        altura=usuario.nextInt();
        while (base<=0||altura<=0) {
            System.out.println("Introduzca la base del rectángulo con signo positivo");
            base=usuario.nextInt();
            System.out.println("Introduzca la altura del rectángulo con signo positivo");
            altura=usuario.nextInt();
        }
        area=base*altura;
        System.out.println("El área es : "+area);
        return area;
    }
    public static int areaTriangulo() {
        int base, altura,area;
        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca la base del triángulo");
        base=usuario.nextInt();
        System.out.println("Introduzca la altura del triángulo");
        altura=usuario.nextInt();
        while (base<=0||altura<=0) {
            System.out.println("Introduzca la base del triángulo con signo positivo");
            base=usuario.nextInt();
            System.out.println("Introduzca la altura del triángulo con signo positivo");
            altura=usuario.nextInt();
        }
        area=(base*altura)/2;
        System.out.println("El área es : "+area);
        return area;
    }
    public static double areaCirculo() {
        int radio;
        double area;
        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca el radio del círculo");
        radio=usuario.nextInt();
        while (radio<=0) {
            System.out.println("Introduzca el radio del círculo con signo positivo");
            radio=usuario.nextInt();
        }
        area=Math.PI*(radio*radio);
        System.out.println("El área es : "+area);
        return area;
    }
    public static void menu() {
        Scanner usuario = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        while (!salir) {
            System.out.println("________________________");
            System.out.println("1. Área del rectángulo");
            System.out.println("2. Área del triángulo ");
            System.out.println("3. Área del círculo   ");
            System.out.println("4. Salir              ");
            System.out.println(" ");
            System.out.println("Escribe la opción");
            opcion=usuario.nextInt();
            try {
                switch(opcion) {
                case 1:
                    System.out.println("Área rectángulo");
                    areaRectangulo();
                    break;
                case 2:
                    System.out.println("Área triángulo");
                    areaTriangulo();
                    break;
                case 3:
                    System.out.println("Área círculo");
                    areaCirculo();
                    break;
                case 4:
                    System.out.println("Salir");
                    salir=true;
                    break;
                default:
                    System.out.println("Introduzca un número entre 1 y 4");
                                }
                }
                catch (InputMismatchException e) {
                    System.out.println("Introduzca un número por favor");
                    usuario.nextInt();
                }
            }
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Programa para calcular áreas");
        menu();
    }

}

