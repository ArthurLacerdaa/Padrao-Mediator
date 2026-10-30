package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarCozinha() {
        Cliente cliente = new Cliente();
        assertEquals("O Garçom agradece seu contato.\nA Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Cozinha agradece a mensagem: Comida deliciosa",
                cliente.elogiarCozinha("Comida deliciosa"));
    }

    @Test
    void deveReclamarCozinha() {
        Cliente cliente = new Cliente();
        assertEquals("O Garçom agradece seu contato.\nA Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Cozinha vai procurar melhorar o serviço da reclamação: Comida chegou fria",
                cliente.reclamarCozinha("Comida chegou fria"));
    }

    @Test
    void deveSugerirCozinha() {
        Cliente cliente = new Cliente();
        assertEquals("O Garçom agradece seu contato.\nA Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Cozinha vai analisar a sugestão: Incluir opção vegetariana",
                cliente.sugerirCozinha("Incluir opção vegetariana"));
    }

}
