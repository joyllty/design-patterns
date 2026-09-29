public class SalesInvoice implements Documento{
    
    private double sales_tax;
    private String estado_destino;
    private String id_EIN;
    
    public SalesInvoice(String estado_destino, String id_EIN){
        this.estado_destino = estado_destino;
        this.id_EIN = id_EIN;
    }


    @Override 
    public String gerarDocumento(){

        if (estado_destino.equalsIgnoreCase("California")) {
            sales_tax = 7.25;
        }
        else if (estado_destino.equalsIgnoreCase("Texas")){
            sales_tax = 6.25;
        }
        else if (estado_destino.equalsIgnoreCase("Oregon")) {
            sales_tax = 0.0;
        }

        return "Sales Invoice\nEstado: " + estado_destino + "\nSales Tax: " + sales_tax + "%" + "\nEIN: " + id_EIN;
    }
}
