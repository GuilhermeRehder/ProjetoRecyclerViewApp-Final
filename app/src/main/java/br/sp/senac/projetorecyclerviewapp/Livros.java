package br.sp.senac.projetorecyclerviewapp;

public class Livros {

    //Atributos globais

    private String titulo;
    private String descricao;
    private String ranking;
    private int miniatura;
    
    //construtor vazio
    public Livros() {
    }
    //construtor com parâmetros
    public Livros(String titulo, String descricao, String ranking, int miniatura) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.ranking = ranking;
        this.miniatura = miniatura;
    }
    //métodos de acesso Get e Set
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getRanking() {
        return ranking;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRaking(String ranking) {
        this.ranking = ranking;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
