public class Operador extends Funcionario {

    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
    }
    
}
