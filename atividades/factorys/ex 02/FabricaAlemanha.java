public class FabricaAlemanha implements absFabrica{

    private boolean produto_essencial;
    private String vatID;
    private String plz;

    public FabricaAlemanha(boolean produto_essencial, String vatID, String plz) {

        this.produto_essencial = produto_essencial;
        this.vatID = vatID;
        this.plz = plz;
    }
    
    @Override
    public Documento criarDocumento(){
        return new VATInvoice(produto_essencial, vatID);
    }

    @Override
    public EtiquetaEnvio criarEtiqueta(){
        return new EtiquetaAlemanha(plz);
    }

    @Override
    public ProcessamentoPag criarProcessamento(){
        return new ProcessamentoAlemanha();
    }
}
