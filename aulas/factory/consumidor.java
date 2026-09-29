public class consumidor {
    public static void main(String[] args){
        iFabricaForma retanguloFactory = new FabricaRetangulo();

        iForma retangulo = retanguloFactory.criarForma();

        retangulo.desenhar();


        iFabricaForma circuloFactory = new FabricaCirculo();

        iForma circulo = circuloFactory.criarForma();

        circulo.desenhar();


        iFabricaForma trianguloFactory = new FabricaTriangulo();

        iForma triangulo = trianguloFactory.criarForma();

        triangulo.desenhar();
    }
}
