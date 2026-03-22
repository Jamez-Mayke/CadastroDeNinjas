package br.com.jamezmayke.CadastroDeNinjas.Missoes;

import java.util.List;

import br.com.jamezmayke.CadastroDeNinjas.Ninjas.model.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // Agora, temos que fazer a relação dessa tabela de missoes com o nosso ninja
    // para associarmos ele a uma missão.
    // Uma missão pode ter vários ninjas.
    // Leitura: Uma missão pode ter muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;



}
