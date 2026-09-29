public class Cliente {

    public static void main(String[] args) {

        Criador criadorAuto = new CriadorAutomovel(
                85000.00,
                24,
                1,
                60000.00
        );

        Criador criadorResidencial = new CriadorResidencial(
                500000.00,
                true,
                true
        );

        Criador criadorVida = new CriadorVida(
                30,
                300000.00,
                false,
                false
        );

        Criador criadorViagem = new CriadorViagem(
                10,
                true,
                50000.00,
                true
        );

        criadorAuto.processarContratacao();

        System.out.println("--------------------");

        criadorResidencial.processarContratacao();

        System.out.println("--------------------");

        criadorVida.processarContratacao();

        System.out.println("--------------------");

        criadorViagem.processarContratacao();
    }
}