public class FabricaBrasil implements absFabrica{

    private boolean opInterestadual;
    private String chave_acesso;
    private String tipo_pagamento;
    private String CEP;

    public FabricaBrasil(boolean opInterestadual, String chave_acesso, String tipo_pagamento, String CEP){
        this.opInterestadual = opInterestadual;
        this.chave_acesso = chave_acesso;
        this.tipo_pagamento = tipo_pagamento;
        this.CEP = CEP;
    }

    @Override
    public Documento criarDocumento(){
        return new NotaFiscal(opInterestadual, chave_acesso);
    }

    @Override
    public EtiquetaEnvio criarEtiqueta(){
        return new EtiquetaBrasil(CEP);
    }

    @Override
    public ProcessamentoPag criarProcessamento(){
        return new ProcessamentoBrasil(tipo_pagamento);
    }   
}
