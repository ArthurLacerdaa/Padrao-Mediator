package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarCozinha(String mensagem) {
        return Garcom.getInstancia().receberElogioCozinha(mensagem);
    }

    public String reclamarCozinha(String mensagem) {
        return Garcom.getInstancia().receberReclamacaoCozinha(mensagem);
    }

    public String sugerirCozinha(String mensagem) {
        return Garcom.getInstancia().receberSugestaoCozinha(mensagem);
    }


}
