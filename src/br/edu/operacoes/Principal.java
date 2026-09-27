package br.edu.operacoes;

public class Principal {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica divisao = new Divisao();

        // Teste da Soma
        try {
            double resultadoSoma = soma.calcular(10.5, 5.5);
            System.out.println("Resultado da Soma: " + resultadoSoma);
        } catch (Exception e) {
            System.err.println("Erro na soma: " + e.getMessage());
        }

        // Teste da Divisão Válida
        try {
            double resultadoDivisao = divisao.calcular(20.0, 4.0);
            System.out.println("Resultado da Divisão: " + resultadoDivisao);
        } catch (DivisaoPorZeroException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }

        // Teste da Divisão por Zero (Provocando a Exceção)
        try {
            System.out.println("Tentando dividir 10 por 0...");
            double resultadoInvalido = divisao.calcular(10.0, 0);
            System.out.println("Resultado: " + resultadoInvalido);
        } catch (DivisaoPorZeroException e) {
            System.err.println("Exceção capturada com sucesso: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}