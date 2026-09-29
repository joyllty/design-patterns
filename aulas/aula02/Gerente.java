public class Gerente extends Funcionario {

    protected int numeroDeFuncionariosGerenciados;
    
    // decorator nao é necessario, mas sinaliza pro compilador/interpretador
    @Override
    public double getBonificacao(){
        /* 
        super.salario = 5;

        double bonus_base = super.getBonificacao();
        double bonus_adicional = 0.2 * this.numeroDeFuncionariosGerenciados;

        return bonus_base + bonus_adicional;
        */
        return this.salario + (0.2 * this.numeroDeFuncionariosGerenciados);
    }
}