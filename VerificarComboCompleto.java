import java.util.Scanner;

public class VerificarComboCompleto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitando ao usuário a lista de serviços contratados
            String input = scanner.nextLine();

            // Convertendo a entrada em uma lista de strings
            String[] servicosContratados = input.split(",");

            // Verificando se o cliente contratou um combo completo
            String resultado = verificarComboCompleto(servicosContratados);

            // Exibindo o resultado
            System.out.println(resultado);
            // Fechando o scanner
            scanner.close();
        }

    }

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Iterando sobre os serviços contratados
        for (String servico : servicosContratados) {
            // Remover espaços extras e converter para minúsculas
            servico = servico.trim().toLowerCase();

            // Atualizar as variáveis booleanas com base nos serviços contratados
            if (servico.equals("movel")) {
                movelContratado = true;
            } else if (servico.equals("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.equals("tv")) {
                tvContratada = true;
            }
        }

        // Verificar se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

}
