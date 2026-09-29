public class ProcessamentoEUA implements ProcessamentoPag {
    
    private boolean avs_verificado;    

    public ProcessamentoEUA(boolean avs_verificado){
        this.avs_verificado = avs_verificado;
    }


    @Override 
    public String processarPagamento(){
        if (!avs_verificado) {
            return "Pagamento recusado: verificação AVS não realizada.";
    }
        return "Pagamento: Cartão de Crédito\nAVS: Verificado";
    }

}
