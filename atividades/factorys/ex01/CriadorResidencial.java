public class CriadorResidencial extends Criador{
    
    private double valorImovel;
    private boolean altoPadrao;
    private boolean documentoImovel;

    public CriadorResidencial (double valorImovel, boolean altoPadrao, boolean documentoImovel){
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.documentoImovel = documentoImovel;
    }
    @Override
    public Produto fabrica(){ 
        return new Residencial(valorImovel, altoPadrao, documentoImovel);
    }

    
}
