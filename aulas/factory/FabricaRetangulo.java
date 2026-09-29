public class FabricaRetangulo implements iFabricaForma{

    public iForma criarForma(){
        return new Retangulo();
    }

    
}
