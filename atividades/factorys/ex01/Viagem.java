// Produto concreto -> pode ser produzido pelo criador
public class Viagem extends Produto{    
    
    private int diasViagem;
    private boolean destinoInternacional;
    private double assistenciaMedica;
    private boolean passaporte;

    public Viagem (int diasViagem, boolean destinoInternacional, double assistenciaMedica, boolean passaporte){
        super("VIA-");

        this.diasViagem = diasViagem;
        this.destinoInternacional = destinoInternacional;
        this.assistenciaMedica = assistenciaMedica;
        this.passaporte = passaporte;
    }

    @Override
    public void calculoPremio(){
        premioMensal = (diasViagem * 15);

        if (destinoInternacional){
            premioMensal += 100;
        }
    }

    @Override
    public boolean validarCobertura(){
        if(destinoInternacional){
            return assistenciaMedica >= 30000 & passaporte;
        }

        return true;
    }

    @Override
    public String listarDocumentos(){
        return "Itinerário de viagem e, quando aplicável, passaporte";
    }
    
}
