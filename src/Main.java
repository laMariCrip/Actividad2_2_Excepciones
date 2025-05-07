/*Crea una excepción personalizada llamada NumeroNegativoException que extienda de Exception.
Después, haz una clase con un metodo dividir(int a, int b) que lance esa excepción si el segundo número (b) es negativo.
Haz un programa que use ese metodo y capture la excepción.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dividir division = new Dividir();
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        try {
            System.out.println("El resultado es " + division.dividir(a,b));

        } catch (NumeroNegativoException e) {
            System.out.println("El numero no es valido");

        }finally {
            sc.close();
        }
    } // end main
}// end class