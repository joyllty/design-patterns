// declara o método fábrica que retorna novos objetos Produto.

public abstract class Criador {
    
    // adicionar um método fabrica vazio dentro da classe criadora.
    // o tipo do retorno desse método precisa ser a interface do produto
    // sendo abstrato, força as subclasses a implementarem suas próprias versões do método 
    public abstract Produto fabrica();

    // final porque as subclasses não podem sobrescrever esse método
    public final void processarContratacao(){
        // processa a contratação usando apenas a abstração do produto retornado pelo método fábrica
        Produto apolice = fabrica();
        apolice.calculoPremio();

        if (!apolice.validarCobertura()){
            System.out.println("Contratação rejeitada");
            return;
        }

        apolice.validarCobertura();
        System.out.println(apolice.gerarResumo());
    }

}
