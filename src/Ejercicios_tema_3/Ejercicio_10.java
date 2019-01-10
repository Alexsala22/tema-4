package Ejercicios_tema_3;
import java.util.InputMismatchException;
import java.util.Scanner;
/***
 * PROGRAMA DE MENU DE AREAS
 *** 
 * AUTOR: Alejandro Mart�nez Loro
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
        System.out.println("Introduzca la base del rect�ngulo");
        base=usuario.nextInt();
        System.out.println("Introduzca la altura del rect�ngulo");
        altura=usuario.nextInt();
        while (base<=0||altura<=0) {
            System.out.println("Introduzca la base del rect�ngulo con signo positivo");
            base=usuario.nextInt();
            System.out.println("Introduzca la altura del rect�ngulo con signo positivo");
            altura=usuario.nextInt();
        }
        area=base*altura;
        System.out.println("El �rea es : "+area);
        return area;
    }
    public static int areaTriangulo() {
        int base, altura,area;
        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca la base del tri�ngulo");
        base=usuario.nextInt();
        System.out.println("Introduzca la altura del tri�ngulo");
        altura=usuario.nextInt();
        while (base<=0||altura<=0) {
            System.out.println("Introduzca la base del tri�ngulo con signo positivo");
            base=usuario.nextInt();
            System.out.println("Introduzca la altura del tri�ngulo con signo positivo");
            altura=usuario.nextInt();
        }
        area=(base*altura)/2;
        System.out.println("El �rea es : "+area);
        return area;
    }
    public static double areaCirculo() {
        int radio;
        double area;
        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca el radio del c�rculo");
        radio=usuario.nextInt();
        while (radio<=0) {
            System.out.println("Introduzca el radio del c�rculo con signo positivo");
            radio=usuario.nextInt();
        }
        area=Math.PI*(radio*radio);
        System.out.println("El �rea es : "+area);
        return area;
    }
    public static void menu() {
        Scanner usuario = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        while (!salir) {
            System.out.println("________________________");
            System.out.println("1. �rea del rect�ngulo");
            System.out.println("2. �rea del tri�ngulo ");
            System.out.println("3. �rea del c�rculo   ");
            System.out.println("4. Salir              ");
            System.out.println(" ");
            System.out.println("Escribe la opci�n");
            opcion=usuario.nextInt();
            try {
                switch(opcion) {
                case 1:
                    System.out.println("�rea rect�ngulo");
                    areaRectangulo();
                    break;
                case 2:
                    System.out.println("�rea tri�ngulo");
                    areaTriangulo();
                    break;
                case 3:
                    System.out.println("�rea c�rculo");
                    areaCirculo();
                    break;
                case 4:
                    System.out.println("Salir");
                    salir=true;
                    break;
                default:
                    System.out.println("Introduzca un n�mero entre 1 y 4");
                                }
                }
                catch (InputMismatchException e) {
                    System.out.println("Introduzca un n�mero por favor");
                    usuario.nextInt();
                }
            }
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Programa para calcular �reas");
        menu();
    }

}

