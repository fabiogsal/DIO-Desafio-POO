package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritoSet = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidosSet = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritoSet.addAll(bootcamp.getConteudosSet());
        bootcamp.getDevsInscritosSet().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = conteudosInscritoSet.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidosSet.add(conteudo.get());
            this.conteudosInscritoSet.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }
    public double calcularXp(){
        return this.conteudosConcluidosSet.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritoSet() {
        return conteudosInscritoSet;
    }

    public void setConteudosInscritoSet(Set<Conteudo> conteudosInscritoSet) {
        this.conteudosInscritoSet = conteudosInscritoSet;
    }

    public Set<Conteudo> getConteudosConcluidosSet() {
        return conteudosConcluidosSet;
    }

    public void setConteudosConcluidosSet(Set<Conteudo> conteudosConcluidosSet) {
        this.conteudosConcluidosSet = conteudosConcluidosSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritoSet(), dev.getConteudosInscritoSet()) && Objects.equals(getConteudosConcluidosSet(), dev.getConteudosConcluidosSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritoSet(), getConteudosConcluidosSet());
    }
}
