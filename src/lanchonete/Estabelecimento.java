package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cozinheiro cozinheiro = new Cozinheiro();
        Atendente atendente = new Atendente();

        cliente.escolherLanche();
        cliente.fazerPedido();

        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        atendente.servindoMesa();
        atendente.receberPagamento();

        cliente.pagarConta();


    }
}