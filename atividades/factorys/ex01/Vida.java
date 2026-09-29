// Produto concreto -> pode ser produzido pelo criador
public class Vida extends Produto{

    private int idadeSegurado;
    private double capitalSegurado;
    private boolean fumante;
    private boolean atestadoMedico;

    public Vida (int idadeSegurado, double capitalSegurado, boolean fumante, boolean atestadoMedico){
        super("VID-");

        this.idadeSegurado = idadeSegurado;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.atestadoMedico = atestadoMedico;
    }

    @Override
    public void calculoPremio(){
        premioMensal = (idadeSegurado * 12) + (capitalSegurado * 0.002);

        if (fumante){
            premioMensal = premioMensal * 1.50;
        }
    }

    @Override
    public boolean validarCobertura(){
        if(capitalSegurado > 500000){
            return atestadoMedico;
        }

        return true;
    }

    @Override
    public String listarDocumentos(){
        return "Documento de identidade, CPF e, quando aplicável, atestado médico";
    }
}
