package com.example.cadastrodeninjas.Ninjas;

import com.example.cadastrodeninjas.Missoes.MissoesModel;

public class NinjaDTO {
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String rank;
    private String imgUrl;
    private MissoesModel missoes;

    public NinjaDTO() {}

    public NinjaDTO(Long id, String nome, String email, int idade, String rank, String imgUrl, MissoesModel missoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.rank = rank;
        this.imgUrl = imgUrl;
        this.missoes = missoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }
}
