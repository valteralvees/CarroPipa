package carropipa;
import java.util.Scanner;
public class CarroPipa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a capacidade, em litros do reservatório:");
        int litrosReservatorio = teclado.nextInt();
        System.out.println("Digite qual será o nível de regulagem - 1, 2 ou 3: ");
        final int NIVEL = teclado.nextInt();
        if (NIVEL == 1) {
            int minutos = (int) ((int) litrosReservatorio / 12.5);
            System.out.println("Serão necessários " + minutos + " minutos para encher o reservatório");
        } if (NIVEL == 2) {
            int minutos = (int) ((int) litrosReservatorio / 25);
            System.out.println("Serão necessários " + minutos + " minutos para encher o reservatório");
        } if (NIVEL == 3) {
            int minutos = (int) ((int) litrosReservatorio / 50);
            System.out.println("Serão necessários " + minutos + " minutos para encher o reservatório");
        }
    }
}
