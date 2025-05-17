import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int opcao = 0;
        double valorDigitado;

        System.out.println("\nBem-vindo(a) ao Conversor de Moeda!\n");

        while (opcao != 13) {
            String menu = """
                    ***************************************
                    
                    1) Real brasileiro ==> Dólar
                    2) Dólar ==> Real brasileiro
                    3) Real brasileiro ==> Euro
                    4) Euro ==> Real brasileiro
                    5) Peso argentino ==> Dólar
                    6) Dólar ==> Peso argentino
                    7) Peso colombiano ==> Dólar
                    8) Dólar ==> Peso colombiano
                    9) Real brasileiro ==> Iene
                    10) Iene ==> Real brasileiro
                    11) Real brasileiro ==> Yuan chinês
                    12) Yuan chinês ==> Real brasileiro
                    13) Sair
                    
                    Escolha uma opção válida:
                    
                    ***************************************
                    """;

            System.out.println(menu);

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número válido.");
                scanner.nextLine();
                continue;
            }

            if (opcao == 13) {
                System.out.println("Finalizando aplicação. Obrigado por usar o conversor!");
                break;
            }

            if (opcao < 1 || opcao > 12) {
                System.out.println("Opção inválida! Escolha um número entre 1 e 13.");
                continue;
            }

            System.out.println("Digite o valor para a conversão:");
            String valorComoString = scanner.next();
            valorComoString = valorComoString.replace(",", ".");

            try {
                valorDigitado = Double.parseDouble(valorComoString);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número corretamente.");
                continue;
            }

            String moedaDeOrigem = "";
            String moedaDeDestino = "";

            switch (opcao) {
                case 1 -> { moedaDeOrigem = "BRL"; moedaDeDestino = "USD"; }
                case 2 -> { moedaDeOrigem = "USD"; moedaDeDestino = "BRL"; }
                case 3 -> { moedaDeOrigem = "BRL"; moedaDeDestino = "EUR"; }
                case 4 -> { moedaDeOrigem = "EUR"; moedaDeDestino = "BRL"; }
                case 5 -> { moedaDeOrigem = "ARS"; moedaDeDestino = "USD"; }
                case 6 -> { moedaDeOrigem = "USD"; moedaDeDestino = "ARS"; }
                case 7 -> { moedaDeOrigem = "COP"; moedaDeDestino = "USD"; }
                case 8 -> { moedaDeOrigem = "USD"; moedaDeDestino = "COP"; }
                case 9 -> { moedaDeOrigem = "BRL"; moedaDeDestino = "JPY"; }
                case 10 -> { moedaDeOrigem = "JPY"; moedaDeDestino = "BRL"; }
                case 11 -> { moedaDeOrigem = "BRL"; moedaDeDestino = "CNY"; }
                case 12 -> { moedaDeOrigem = "CNY"; moedaDeDestino = "BRL"; }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }

            try {
                double taxaConversao = conversor.conversor(moedaDeOrigem, moedaDeDestino);
                double valorConvertido = valorDigitado * taxaConversao;
                System.out.printf("O valor %.2f %s convertido é %.2f %s.\n", valorDigitado, moedaDeOrigem, valorConvertido, moedaDeDestino);
            } catch (Exception e) {
                System.out.println("Erro ao obter taxa de câmbio. Verifique sua conexão ou API Key.");
            }
        }

        scanner.close();
    }
}
