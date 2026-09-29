public class EtiquetaEUA implements EtiquetaEnvio{

    private String zipCode;
    private String transportadora;

    public EtiquetaEUA(String zipCode) {
        this.zipCode = zipCode;
    }
    
    @Override 
    public String gerarEtiqueta(){
        transportadora = "USPS";

        return "Etiqueta de envio\nTransportadora: " + transportadora + "\nZIP+4: " + zipCode;
    }
}
