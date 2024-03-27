import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
    double soma = 0;

    for (int i = 1; i <= 12; i++) {
    System.out.println("Digite a " + i + "º temperatura (entre 4 e 10): ");
    double temperatura = scanner.nextDouble();

    if (temperatura < 4 || temperatura > 10) {
    System.out.println("Erro: Digite entre 4 e 10!!!");
    break;
    } else {
    soma += temperatura;
    }
    }
    if (soma != 0) {
    double media = soma / 12;
    System.out.println("A média de hoje das temperaturas é: " + media + "º C");
    break;
    }
    }
    scanner.close();
    }
}