package br.com.jamezmayke.CadastroDeNinjas.Ninjas.model;

import br.com.jamezmayke.CadastroDeNinjas.Missoes.model.MissoesModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.ToString;

@Entity
@Table(name = "tb_cadastro")
@ToString(exclude = "missoes")
public class NinjaModel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;
    
    private int idade;

    private String rank;

    // @ManyToOne Um ninja tem uma única missão
    // Leitura: Muitos ninjas podem ter uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign key
    private MissoesModel missoes;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel(String nome, String email, int idade, MissoesModel missoes) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }

    public NinjaModel(String nome, String email, int idade, String imgUrl, MissoesModel missoes) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.imgUrl = imgUrl;
        this.missoes = missoes;
    }

    public NinjaModel(String nome, String email, int idade, String rank, String imgUrl, MissoesModel missoes) {
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

    public void setId(Long id) {
        this.id = id;
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
