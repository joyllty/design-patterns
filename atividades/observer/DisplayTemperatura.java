package atividades.observer;


public class DisplayTemperatura extends AbsObservador {

    public DisplayTemperatura(EstacaoMeteorologica estacao) {

        this.observado = estacao;

        this.observado.inscrever(this);
    }

    @Override
    public void update() {

        EstacaoMeteorologica estacao =
                (EstacaoMeteorologica) this.observado;

        System.out.println(
                "Display: Temperatura atual = "
                + estacao.getTemperatura()
                + "°C"
        );
    }
}