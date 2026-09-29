public class Main {

    public static void main(String[] args) {

        absFabrica fabrica1 = new FabricaBrasil(false, "12345678901234567890123456789012345678901234",
            "Pix", "80000-000");

        Checkout checkout1 = new Checkout(fabrica1);

        checkout1.finalizarPedido();


        absFabrica fabrica2 = new FabricaEUA("555778923", "California", "555001", true);

        Checkout checkout2 = new Checkout(fabrica2);

        checkout2.finalizarPedido();


        absFabrica fabrica3 = new FabricaAlemanha(true, "111456009", "3003");

        Checkout checkout3 = new Checkout(fabrica3);

        checkout3.finalizarPedido();
    }
}