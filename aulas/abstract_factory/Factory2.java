package aulas.abstract_factory;

public class Factory2 extends absFactory{
    
    @Override
    iProductA createProductA(){
        return new ProductA2();
    }

    @Override
    iProductB createProductB(){
        return new ProductB2();
    }
}
