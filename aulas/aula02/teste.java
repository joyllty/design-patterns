public class teste {

    public static void main(String[] args) {
        Financeiro fin = new Financeiro();

        Gerente coord1 = new Gerente();
        coord1.nome = "Bruna";
        coord1.salario = 10000;
        coord1.numeroDeFuncionariosGerenciados = 10;
        System.out.println(coord1.getBonificacao());

        Gerente coord2 = new Gerente();
        coord2.nome = "Escobar";
        coord2.salario = 8000;
        coord2.numeroDeFuncionariosGerenciados = 5;

        Operador porteiro = new Operador();

        porteiro.nome = "Arthur";
        porteiro.salario = 1500;

        fin.computa_bonus(coord1);
        fin.computa_bonus(coord2);
        fin.computa_bonus(porteiro);

        // principio da substituição de Liskov
        // substitui a assinatura da classe abstrata pela implementação da classe concreta
        // não consigo construir a partir de uma classe abstrata
        Funcionario func = new Gerente();
        func.nome = "Silvio Santos";
        func.salario = 20000;

        System.out.println(func.getBonificacao());
        
        System.out.println(fin.get_total_bonus());

    }
}