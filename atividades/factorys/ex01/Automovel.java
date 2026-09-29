// Produto concreto -> pode ser produzido pelo criador
public class Automovel extends Produto {

    private double FIPE;
    private int idade;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public Automovel (double FIPE, int idade, int tempoHabilitacao, double coberturaTerceiros){
        super("AUTO-");

        this.FIPE = FIPE;
        this.idade = idade;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    public void calculoPremio(){
        premioMensal = (FIPE * 0.08) / 12;

        if (idade < 25){
            premioMensal = (premioMensal * 1.30);
        }
        if (tempoHabilitacao < 2){
            premioMensal = (premioMensal * 1.20);
        }
    }

    @Override
    public boolean validarCobertura(){
        return coberturaTerceiros >= 50.000;
    }

    @Override
    public String listarDocumentos(){
        return "CNH, CRLV e comprovante de residência";
    }
}