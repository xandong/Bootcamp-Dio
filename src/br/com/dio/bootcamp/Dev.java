package br.com.dio.bootcamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private int xp;


    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void concluido() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            atualizarXp(conteudo.get().getXp());
            this.conteudosInscritos.remove(conteudo.get());
            System.out.println(this.getNome() + " concluiu :" + conteudo.get() + "\n");
        } else {
            System.err.println("Não inscrito!");
        }
    }
    public void atualizarXp(int xpConteudo) {
        setXp(getXp() + xpConteudo);
    }

    public void inscrito(String nome, Set cursos) {
        System.out.println(nome + " tem: " + getXp() + "xp\nEstá inscrito em:\n" + cursos + "\n");
    }

    public int totalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToInt(Conteudo::calcularXp).sum();
    }

    public int getXp() { return xp; }

    public void setXp(int xp) { this.xp = xp; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}

