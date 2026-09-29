import java.time.LocalDate;

// o Produto declara a interface que é comum a todos os objetos que podem ser produzidos pelo criador e suas subclasses
public abstract class Produto {

    protected String numeroApolice;
    protected int proximoNumero = 1;

    protected String segurado;
    protected double premioMensal;
    protected LocalDate dataEmissao;

    public Produto(String prefixo){
        this.numeroApolice = prefixo + proximoNumero;
        proximoNumero++;
        this.dataEmissao = LocalDate.now();
    }

    // abstrato para as subclasses serem obrigadas a implementarem suas versões
    public abstract void calculoPremio();
    public abstract boolean validarCobertura();
    public abstract String listarDocumentos();
    
    // resumo para toda contratação bem-sucedida
    public String gerarResumo(){
        return ">> Número da apólice: " + numeroApolice +
                "\n>> Segurado: " + segurado +
                "\n>> Data de emissão: " + dataEmissao +
                "\n>> Prêmio mensal: R$ " + premioMensal +
                "\n>> Documentos exigidos: " + listarDocumentos();
    }
}