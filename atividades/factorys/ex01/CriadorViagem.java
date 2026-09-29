public class CriadorViagem extends Criador {
    
    private int diasViagem;
    private boolean destinoInternacional;
    private double assistenciaMedica;
    private boolean passaporte;

    public CriadorViagem (int diasViagem, boolean destinoInternacional, double assistenciaMedica, boolean passaporte){
        this.diasViagem = diasViagem;
        this.destinoInternacional = destinoInternacional;
        this.assistenciaMedica = assistenciaMedica;
        this.passaporte = passaporte;
    }

    @Override 
    public Produto fabrica(){
        return new Viagem(diasViagem, destinoInternacional, assistenciaMedica, passaporte);
    }
}
