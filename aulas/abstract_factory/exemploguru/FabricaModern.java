package exemploguru;

public class FabricaModern implements absFactory{

    @Override 
    public Cadeira criarCadeira(){
        return new ModernChair();
    }

    @Override 
    public Mesa criarMesa(){
        return new ModernTable();
    }

    @Override 
    public Sofa criarSofa(){
        return new ModernSofa();
    }

}
