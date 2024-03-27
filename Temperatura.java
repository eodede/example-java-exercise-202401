import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
    
    System.out.println("Digite a 1º (entre 4 e 10) temperatura: ");
    Double temp1 = scanner.nextDouble();
    
    System.out.println("Digite a 2º (entre 4 e 10) temperatura: ");
    Double temp2 = scanner.nextDouble();

    System.out.println("Digite a 3º (entre 4 e 10) temperatura: ");
    Double temp3 = scanner.nextDouble();

    System.out.println("Digite a 4º (entre 4 e 10) temperatura: ");
    Double temp4 = scanner.nextDouble();

    System.out.println("Digite a 5º (entre 4 e 10) temperatura: ");
    Double temp5 = scanner.nextDouble();

    System.out.println("Digite a 6º (entre 4 e 10) temperatura: ");
    Double temp6 = scanner.nextDouble();

    System.out.println("Digite a 7º (entre 4 e 10) temperatura: ");
    Double temp7 = scanner.nextDouble();

    System.out.println("Digite a 8º (entre 4 e 10) temperatura: ");
    Double temp8 = scanner.nextDouble();

    System.out.println("Digite a 9º (entre 4 e 10) temperatura: ");
    Double temp9 = scanner.nextDouble();

    System.out.println("Digite a 10º (entre 4 e 10) temperatura: ");
    Double temp10 = scanner.nextDouble();

    System.out.println("Digite a 11º (entre 4 e 10) temperatura: ");
    Double temp11 = scanner.nextDouble();

    System.out.println("Digite a 12º (entre 4 e 10) temperatura: ");
    Double temp12 = scanner.nextDouble();

    Double media = (temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7 + temp8 + temp9 + temp10 + temp11 + temp12) / 12;

    if (temp1 <= 3 || temp1 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp2 <= 3 || temp2 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp3 <= 3 || temp3 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp4 <= 3 || temp4 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp5 <= 3 || temp5 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp6 <= 3 || temp6 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp7 <= 3 || temp7 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp8 <= 3 || temp8 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp9 <= 3 || temp9 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp10 <= 3 || temp10 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp11 <= 3 || temp11 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else if (temp12 <= 3 || temp12 >= 11){
    System.out.println("Erro: Digite entre 4 e 10!!!");
    }
    else 
    System.out.println("A média de hoje das temperaturas é: " + media + "º C");
    break;
    }
    scanner.close();
    }  
}


