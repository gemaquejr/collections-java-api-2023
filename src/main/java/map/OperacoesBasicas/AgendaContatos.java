package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gemaque", 123456);
        agendaContatos.adicionarContato("Gemaque", 456);
        agendaContatos.adicionarContato("Gemaque Junior", 111111);
        agendaContatos.adicionarContato("Gemaque Jr", 654987);
        agendaContatos.adicionarContato("Edna Gemaque", 111111);
        agendaContatos.adicionarContato("Gemaque", 444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Edna Gemaque");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Gemaque Jr"));
    }
}
