public class CriadorVida extends Criador {
    
    private int idadeSegurado;
    private double capitalSegurado;
    private boolean fumante;
    private boolean atestadoMedico;

    public CriadorVida(int idadeSegurado, double capitalSegurado, boolean fumante, boolean atestadoMedico){
        this.idadeSegurado = idadeSegurado;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.atestadoMedico = atestadoMedico;
    }


    @Override 
    public Produto fabrica(){
        return new Vida(idadeSegurado, capitalSegurado, fumante, atestadoMedico);
    }
}
