
public class observador extends absObservador {

    public observador(absObservado observado) {
        this.observado = observado;
        this.observado.inscrever(this);
    }

    @Override
    public void update() {

        // executar os procedimentos de acordo com a notificação
        System.out.println(
            "Notificação recebida pelo observador. Novo estado: "
            + this.observado.getClass().getSimpleName()
        );
    }
}