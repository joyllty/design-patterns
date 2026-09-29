package exemploguru;

public class FabricaVictorian implements absFactory{
    
    @Override 
    public Cadeira criarCadeira(){
        return new VictorianChair();
    }

    @Override 
    public Mesa criarMesa(){
        return new VictorianTable();
    }

    @Override 
    public Sofa criarSofa(){
        return new VictorianSofa();
    }

}
