package padroescomportamentais.mediator;

public class Garcom {

    private static Garcom instancia = new Garcom();

    private Garcom() {}

    public static Garcom getInstancia() {
        return instancia;
    }

    public String receberElogioCozinha(String mensagem) {
        return "O Garçom agradece seu contato.\n"+
                "A Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Cozinha.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoCozinha(String mensagem) {
        return "O Garçom agradece seu contato.\n"+
                "A Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Cozinha.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoCozinha(String mensagem) {
        return "O Garçom agradece seu contato.\n"+
                "A Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Cozinha.getInstancia().receberSugestao(mensagem);
    }

}
