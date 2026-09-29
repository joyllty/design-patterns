public class NotaFiscal implements Documento{
    
    private double CFOP;
    private boolean opInterestadual;
    private double ICMS;
    private String chave_acesso;

    public NotaFiscal(boolean opInterestadual, String chave_acesso) {
        this.opInterestadual = opInterestadual;
        this.chave_acesso = chave_acesso;
    }

    @Override 
    public String gerarDocumento(){
        if (opInterestadual){
            CFOP = 6.102;
            ICMS = 12.0;
        } else {
            CFOP = 5.102;
            ICMS = 18.0;
        }
        
        String mensagem = String.format(
            "Nota Fiscal Eletrônica\nCFOP: %s\nICMS: %.1f%%\nChave de acesso: %s",
            CFOP, ICMS, chave_acesso
        );
        return mensagem;
    }

}
