package candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("=== Processo Seletivo ===");
        selecaoCadidatos();
    }

    static void selecaoCadidatos() {
        String[] candidatos = { "Danilo", "Sabrina", "Paula", "Rodrigo", "Tiago", "Emerson", "Maria", "Tereza", "Ramon", "Letícia" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        ArrayList<String> cadidatosAprovados = new ArrayList<>();
        

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("\nO(a) candidato(a) " + candidato + " solicitou um salário de R$" + formatarValor(salarioPretendido) + ".");
            if (salarioPretendido <= salarioBase) {
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado para a vaga.");
                cadidatosAprovados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

        imprimirSelecionados(cadidatosAprovados);

    }

    static String formatarValor(double salarioPretendido) {
        DecimalFormat df = new DecimalFormat("#.00");  
        return df.format(salarioPretendido); 
    }

    static void imprimirSelecionados(ArrayList<String> array) {
        System.out.println("\n**** Candidatos selecionados para a vaga *** ");
        for(String candidato : array) {
            System.out.println(candidato);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}