package atividades.observer;

public class Main {

    public static void main(String[] args) {

        // Criar o observado
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        // Criar os observadores
        DisplayTemperatura display = new DisplayTemperatura(estacao);

        AlertaTemperatura alerta = new AlertaTemperatura(estacao);

        // Primeira alteração
        System.out.println("Temperatura alterada para 25°C:");

        estacao.setTemperatura(25);

        System.out.println();

        // Segunda alteração
        System.out.println("Temperatura alterada para 35°C:");

        estacao.setTemperatura(35);

        System.out.println();

        // Remover o display
        estacao.remover(display);

        // Terceira alteração
        System.out.println(
                "Display removido. Temperatura alterada para 40°C:"
        );

        estacao.setTemperatura(40);
    }
}