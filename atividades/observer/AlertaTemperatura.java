package atividades.observer;


public class AlertaTemperatura extends AbsObservador {

    public AlertaTemperatura(EstacaoMeteorologica estacao) {

        this.observado = estacao;

        this.observado.inscrever(this);
    }

    @Override
    public void update() {

        EstacaoMeteorologica estacao =
                (EstacaoMeteorologica) this.observado;

        if (estacao.getTemperatura() > 30) {

            System.out.println(
                    "ALERTA: Temperatura muito alta!"
            );

        } else {

            System.out.println(
                    "Alerta: Temperatura normal."
            );
        }
    }
}