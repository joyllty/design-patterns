package aulas.abstract_factory;

public abstract class Factory1 extends absFactory{
    
    @Override
    iProductA createProductA(){
        return new ProductA1();
    }

    @Override
    iProductB createProductB(){
        return new ProductB1();
    }
    

}
