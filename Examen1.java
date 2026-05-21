import java.util.Scanner;

public class Examen1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia_caliente = 0;
        int dia_frio=0;
        
        double[] temperaturas = new double[7];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Registre Temepratura " + (i + 1) + ":");
            temperaturas[i] = sc.nextDouble();
        }

        System.out.println("temperaturas ingresadas");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("temperatura" + (i + 1) + ":" + temperaturas[i]);
        }

        double suma = 0;
        for (double temperatura : temperaturas ) {
            suma += temperatura;
        }
        double promedio = suma / temperaturas.length;

        double mayor = temperaturas[0];
        double menor = temperaturas[0];
        for (double temperatura : temperaturas) {
            if (temperatura > mayor) mayor = temperatura;
            if (temperatura < menor) menor = temperatura;

        }

        System.out.printf("Promedio:    %.2f%n", promedio);
        System.out.printf("Nota mayor:  %.1f%n", mayor);
        System.out.printf("Nota menor:  %.1f%n", menor);

        for (double temperatura : temperaturas) {
            if (temperatura >= 30) {
                dia_caliente++;
            }
            if (temperatura <= 27) {
                dia_frio++;
            }
        }

        System.out.println("Cantidad de dias calurosos: " + dia_caliente);
        System.out.println("Cantidad de dias frios: " + dia_frio);

        


        sc.close();
    }
    
}
