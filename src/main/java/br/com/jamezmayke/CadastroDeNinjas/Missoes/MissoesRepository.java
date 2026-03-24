package br.com.jamezmayke.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jamezmayke.CadastroDeNinjas.Missoes.model.MissoesModel;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
    
}
