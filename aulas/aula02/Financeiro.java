public class Financeiro {
    private double total_bonus = 0.0;

    /* 
    public void computa_bonus(Gerente gerente){
        this.total_bonus += gerente.getBonificacao();
    }

    // sobrecarga
    // não ideal
    public void computa_bonus(Operador operador){
        this.total_bonus += operador.getBonificacao();
    }
    */

    // polimorfismo - generalização do método, pela assinatura de funcionário

    public void computa_bonus(Funcionario funcionario){
        this.total_bonus += funcionario.getBonificacao();
    }

    public double get_total_bonus(){
        return this.total_bonus;
    }


}