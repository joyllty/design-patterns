
public class observado extends absObservado {
    // propriedade de interesse (é o estado)
    // Estado do objeto observado
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int novo_state) {
        this.state = novo_state;

        // acionar os metodos update dos observadores
        this.notificarTodos();
    }

    private void notificarTodos() {
        for (absObservador observador : this.listaObservadores) {
            observador.update();
        }
    }

    @Override
    public void inscrever(absObservador observador) {
        this.listaObservadores.add(observador);
    }

    @Override
    public void remover(absObservador observador) {
        this.listaObservadores.remove(observador);
    }
}