public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String senha;

    // obriga a escrever nas classes filhas, com suas respectivas heurísticas
    public abstract double getBonificacao();

    public boolean autentica(String senha){
        return this.senha.equals(senha);
    }
}