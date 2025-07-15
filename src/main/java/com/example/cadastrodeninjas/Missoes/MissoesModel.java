package com.example.cadastrodeninjas.Missoes;

import com.example.cadastrodeninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "missoes") // Uma missao pode ter varios ninjas
    private List<NinjaModel> ninjas;

}
