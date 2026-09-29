
import java.util.ArrayList;
import java.util.List;

public abstract class absObservado {

    protected List<absObservador> listaObservadores =
            new ArrayList<absObservador>();

    public abstract void inscrever(absObservador observador);

    public abstract void remover(absObservador observador);
}