public class FabricaEUA implements absFabrica{

    private String zipCode;
    private String id_EIN;
    private boolean avs_verificado;    
    private String estado_destino;

    public FabricaEUA(String id_EIN, String estado_destino, String zipCode, boolean avs_verificado){
        this.id_EIN = id_EIN;
        this.estado_destino = estado_destino;
        this.zipCode = zipCode;
        this.avs_verificado = avs_verificado;
    }


    @Override
    public Documento criarDocumento(){
        return new SalesInvoice(estado_destino, id_EIN);
    }

    @Override
    public EtiquetaEnvio criarEtiqueta(){
        return new EtiquetaEUA(zipCode);
    }

    @Override
    public ProcessamentoPag criarProcessamento(){
        return new ProcessamentoEUA(avs_verificado);
    }
    
}
