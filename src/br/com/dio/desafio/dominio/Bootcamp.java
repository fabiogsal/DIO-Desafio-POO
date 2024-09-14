package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFinal = dataInicio.plusDays(45);
    private Set<Dev> devsInscritosSet = new HashSet<>();
    private Set<Conteudo> conteudosSet = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritosSet() {
        return devsInscritosSet;
    }

    public void setDevsInscritosSet(Set<Dev> devsInscritosSet) {
        this.devsInscritosSet = devsInscritosSet;
    }

    public Set<Conteudo> getConteudosSet() {
        return conteudosSet;
    }

    public void setConteudosSet(Set<Conteudo> conteudosSet) {
        this.conteudosSet = conteudosSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicio(), bootcamp.getDataInicio()) && Objects.equals(getDataFinal(), bootcamp.getDataFinal()) && Objects.equals(getDevsInscritosSet(), bootcamp.getDevsInscritosSet()) && Objects.equals(getConteudosSet(), bootcamp.getConteudosSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicio(), getDataFinal(), getDevsInscritosSet(), getConteudosSet());
    }
}
