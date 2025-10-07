import java.util.Scanner;

public class PaivaLtda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contador = 0;
        double temperatura;

        System.out.println("Informe 12 temperaturas entre 4°C e 10°C:");

        while (contador < 12) {
            System.out.print("Temperatura " + (contador + 1) + ": ");
            temperatura = scanner.nextDouble();

            if (temperatura >= 4 && temperatura <= 10) {
                soma += temperatura;
                contador++;
            } else {
                System.out.println("Temperatura inválida! Digite um valor entre 4 e 10 graus Celsius.");
            }
        }

        double media = soma / 12;
        System.out.printf("\nMédia das temperaturas do dia: %.2f°C\n", media);

        scanner.close();
    }
}
