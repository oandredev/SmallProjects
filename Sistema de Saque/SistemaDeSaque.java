import java.util.Scanner;

public class SistemaDeSaque {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double saldo = 5000d, saque = 0d, sobra = 0d;

        int notasDe5 = 0, notasDe10 = 0, notasDe20 = 0, notasDe50 = 0, notasDe100 = 0;

        System.out.println("Insira o valor de saque: \n");

        saque = userInput.nextDouble();

        if (saque >= 5 && saldo > saque) {
            sobra = saque;
            if (sobra >= 100) {
                notasDe100 = (int) (sobra / 100d);
                sobra = sobra % 100;
            }
            if (sobra >= 50) {
                notasDe50 = (int) (sobra / 50d);
                sobra = sobra % 50;
            }
            if (sobra >= 20) {
                notasDe20 = (int) (sobra / 20d);
                sobra = sobra % 20;
            }
            if (sobra >= 10) {
                notasDe10 = (int) (sobra / 10d);
                sobra = sobra % 10;
            }
            if (sobra >= 5) {
                notasDe5 = (int) (sobra / 5d);
                sobra = sobra % 5;
            }
            double saquePossivel = saque - sobra;

            if (sobra != 0) {
                System.out.printf("\n Devido as notas disponiveis só será possivel sacar a quantia de R$ %.2f \n",
                        saquePossivel);
                System.out.println("Prosseguir?\n(S) Sim\n(N) Não\n");

                String action = "";

                action = userInput.next();

                if (action.equalsIgnoreCase("S")) {

                    saldo -= saquePossivel;
                    System.out.println("\nSaque Autorizado. \n");

                    System.out.printf(
                            "\nSaque realizado: \nR$ %.2f\n"
                                    + "\nNotas: \n"
                                    + "> NOTAS DE 100: %d \n"
                                    + "> NOTAS DE  50: %d \n"
                                    + "> NOTAS DE  20: %d \n"
                                    + "> NOTAS DE  10: %d \n"
                                    + "> NOTAS DE   5: %d \n"
                                    + "\n Novo Saldo da Conta: R$ %.2f",
                            saquePossivel, notasDe100, notasDe50, notasDe20, notasDe10, notasDe5, saldo);
                }
            } else {
                saldo -= saquePossivel;
                System.out.println("\nSaque Autorizado. \n");

                System.out.printf(
                        "Saque realizado: \nR$ %.2f\n"
                                + "\nNotas: \n"
                                + "> NOTAS DE 100: %d \n"
                                + "> NOTAS DE  50: %d \n"
                                + "> NOTAS DE  20: %d \n"
                                + "> NOTAS DE  10: %d \n"
                                + "> NOTAS DE   5: %d \n"
                                + "\n Novo Saldo da Conta: R$ %.2f\n",
                        saquePossivel, notasDe100, notasDe50, notasDe20, notasDe10, notasDe5, saldo);
            }
        } else {
            if (saldo > saque) {
                System.out.println("\n Erro: Saque minimo é de R$ 5,00. \n");
            } else {
                System.out.println("\n Saque cancelado. Saldo Indisponível\n");
            }
        }
        userInput.close();
    }
}