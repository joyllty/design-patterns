// Produto concreto -> pode ser produzido pelo criador
public class Residencial extends Produto{
    
    private double valorImovel;
    private boolean altoPadrao;
    private boolean documentoImovel;

    public Residencial (double valorImovel, boolean altoPadrao, boolean documentoImovel){
        super("RES-");

        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.documentoImovel = documentoImovel;
    }

    @Override
    public void calculoPremio(){
        premioMensal = (valorImovel * 0.015) / 12;

        if (altoPadrao){
            premioMensal = (premioMensal * 1.25);
        }
    }

    @Override
    public boolean validarCobertura(){
        return documentoImovel;
    }

    @Override
    public String listarDocumentos(){
        return "Escritura ou contrato de locação e comprovante de residência";
    }
}
