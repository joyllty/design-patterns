
public abstract class absObservador {

    // o observador nao pode existir se nao houver o observado
    
    protected absObservado observado;

    public abstract void update();
}