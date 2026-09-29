public class FabricaTriangulo implements iFabricaForma {

    public iForma criarForma(){
        return new Triangulo();
    }

}
