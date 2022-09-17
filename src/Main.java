import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char fecharSistema = 0;
        do {
            System.out.println("Olá, bem vindo ao Sistema simples de calculo de RH.");
            System.out.println("Opções:");
            System.out.println("1: Calcular salario sem beneficios");
            System.out.println("2: Calcular salario com todos os beneficios");
            System.out.println("3: Calcular salario somento com Vale Refeição:");
            System.out.println("4: Calcular salario somento com Vale Transporte:");
            System.out.println("4: Calcular salario somento com Vale Transporte:");
            int escolha = sc.nextInt();
            System.out.println("Informe o salário:");
            int salario_bruto = sc.nextInt();

            switch (escolha) {
                case 1:
                    double salario = Calculator.calculaDescontos(false, false, salario_bruto);
                    System.out.printf("Salario liquido: %.4f%n", salario);
                    System.out.println("Deseja continuar? (S/n)");
                    fecharSistema = sc.next().charAt(0);
                    break;
                case 2:
                    double salario2 = Calculator.calculaDescontos(true, true, salario_bruto);
                    System.out.printf("Salario liquido: %.4f%n", salario2);
                    System.out.println("Deseja continuar? (S/n)");
                    fecharSistema = sc.next().charAt(0);
                    break;
                case 3:
                    double salario3 = Calculator.calculaDescontos(false, true, salario_bruto);
                    System.out.printf("Salario liquido: %.4f%n", salario3);
                    System.out.println("Deseja continuar? (S/n)");
                    fecharSistema = sc.next().charAt(0);
                    break;
                case 4:
                    double salario4 = Calculator.calculaDescontos(true, false, salario_bruto);
                    System.out.printf("Salario liquido: %.4f%n", salario4);
                    System.out.println("Deseja continuar? (S/n)");
                    fecharSistema = sc.next().charAt(0);
                    break;
                default:
                    fecharSistema = "S".charAt(0);
                    break;
            }

        }
        while (fecharSistema != 'n');
        
        sc.close();
    }
}