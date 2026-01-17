package br.com.dio.desafio.dominio;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final java.util.Set<Conteudo> conteudos = new java.util.LinkedHashSet<>();
    private final java.util.Set<Dev> devsInscritos = new java.util.LinkedHashSet<>();

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

    public java.util.Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public java.util.Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}
