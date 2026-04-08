package br.com.jamezmayke.CadastroDeNinjas.Ninjas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jamezmayke.CadastroDeNinjas.Ninjas.model.NinjaModel;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long>{
    
}
