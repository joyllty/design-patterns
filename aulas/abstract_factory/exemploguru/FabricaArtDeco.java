package exemploguru;

public class FabricaArtDeco implements absFactory{

    @Override 
    public Cadeira criarCadeira(){
        return new ArtDecoChair();
    }

    @Override 
    public Mesa criarMesa(){
        return new ArtDecoTable();
    }

    @Override
    public Sofa criarSofa(){
        return new ArtDecoSofa();
    }

}
