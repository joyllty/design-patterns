public class ProcessamentoAlemanha implements ProcessamentoPag{

    private String tipo_pagamento;

    public ProcessamentoAlemanha() {
        this.tipo_pagamento = "SEPA Direct Debit";
    }

    @Override
    public String processarPagamento() {
        return "Pagamento via " + tipo_pagamento;
    }
    
}
