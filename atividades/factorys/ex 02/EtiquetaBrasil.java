public class EtiquetaBrasil implements EtiquetaEnvio{
    
    private String transportadora;
    private String CEP;

    public EtiquetaBrasil(String CEP){
        this.CEP = CEP;
    }

    @Override 
    public String gerarEtiqueta(){
        transportadora = "Correios";

        return "Etiqueta de envio" +
               "\nTransportadora: " + transportadora +
               "\nCEP: " + CEP;
    }    
}
