public class EtiquetaAlemanha implements EtiquetaEnvio{
    
    private String plz;
    private String transportadora;

    public EtiquetaAlemanha(String plz) {
        this.plz = plz;
    }

    @Override
    public String gerarEtiqueta() {

        transportadora = "Deutsche Post";

        return "Etiqueta de envio\nTransportadora: " + transportadora + "\nPLZ: " + plz;
    }
}
