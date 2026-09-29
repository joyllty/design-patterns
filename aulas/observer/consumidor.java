
public class consumidor {

    public static void main(String[] args) {

        // Construir o observado
        observado observado = new observado();

        // Construir o primeiro observador
        observador observer1 = new observador(observado);

        // Alterar o estado do observado
        observado.setState(10);


        observador observer2 = new observador(observado);
        observado.setState(10);
    }
}