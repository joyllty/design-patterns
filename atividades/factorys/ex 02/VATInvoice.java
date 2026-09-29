public class VATInvoice implements Documento{

    private boolean produto_essencial;
    private double umsatzsteuer;
    private String vatID;

     public VATInvoice(boolean produto_essencial, String vatID) {
        this.produto_essencial = produto_essencial;
        this.vatID = vatID;
    }

    @Override 
    public String gerarDocumento(){
        if (produto_essencial) {
            umsatzsteuer = 7.0;
        } else {
            umsatzsteuer = 19.0;
        }

        return "VAT Invoice\nUmsatzsteuer: " + umsatzsteuer + "%\nVAT-ID: " + vatID;
    }
}
