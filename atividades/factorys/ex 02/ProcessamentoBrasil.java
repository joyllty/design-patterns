public class ProcessamentoBrasil implements ProcessamentoPag{
    
    private String tipo_pagamento;
    private double desconto;
    private int prazo_compensacao;

    public ProcessamentoBrasil(String tipo_pagamento){
        this.tipo_pagamento = tipo_pagamento;
    }

    @Override 
    public String processarPagamento(){
        if (tipo_pagamento.equalsIgnoreCase("pix")) {    
            desconto = 5.0;
            prazo_compensacao = 0;
            return "Pagamento via PIX\nDesconto: " + desconto + "%";
        }

        else if(tipo_pagamento.equalsIgnoreCase("boleto")){
            desconto = 0.0;
            prazo_compensacao = 3;
            return "Pagamento via boleto\nCompensação: " + prazo_compensacao + " dias úteis";

        }
        return "Forma de pagamento inválida.";
    }
}
