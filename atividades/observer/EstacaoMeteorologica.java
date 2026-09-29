package atividades.observer;

public class EstacaoMeteorologica extends AbsObservado {

    private double temperatura;

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double novaTemperatura) {

        this.temperatura = novaTemperatura;

        notificarTodos();
    }

    private void notificarTodos() {

        for (AbsObservador observador : listaObservadores) {
            observador.update();
        }
    }

    @Override
    public void inscrever(AbsObservador observador) {

        listaObservadores.add(observador);
    }

    @Override
    public void remover(AbsObservador observador) {

        listaObservadores.remove(observador);
    }
}