public class CriadorAutomovel extends Criador {
    
    private double FIPE;
    private int idade;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public CriadorAutomovel (double FIPE, int idade, int tempoHabilitacao, double coberturaTerceiros){
        this.FIPE = FIPE;
        this.idade = idade;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override 
    public Produto fabrica(){
        return new Automovel(FIPE, idade, tempoHabilitacao, coberturaTerceiros);
    }
}
