public class Checkout {

    private Documento documento;
    private ProcessamentoPag pagamento;
    private EtiquetaEnvio etiqueta;

    public Checkout(absFabrica fabrica) {
        this.documento = fabrica.criarDocumento();
        this.pagamento = fabrica.criarProcessamento();
        this.etiqueta = fabrica.criarEtiqueta();
    }

    public void finalizarPedido() {
        String resultado_pagamento = pagamento.processarPagamento();

        System.out.println("===== RELATÓRIO DO PEDIDO =====");

        System.out.println("\n----- Documento Fiscal -----");
        System.out.println(documento.gerarDocumento());

        System.out.println("\n----- Pagamento -----");
        System.out.println(resultado_pagamento);

        if (resultado_pagamento.startsWith("Pagamento recusado")) {
            System.out.println("\nPedido não finalizado.");
            return;
        }

        System.out.println("\n----- Etiqueta de Envio -----");
        System.out.println(etiqueta.gerarEtiqueta());

        System.out.println("\nPedido finalizado com sucesso!");
    }
}