package br.com.jamezmayke.CadastroDeNinjas.Ninjas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.jamezmayke.CadastroDeNinjas.Ninjas.model.NinjaModel;
import br.com.jamezmayke.CadastroDeNinjas.Ninjas.repository.NinjaRepository;

@Service
public class NinjaService {
    
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarTodosOsNinjas() {
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaExists = ninjaRepository.findById(id);
        return ninjaExists.orElse(null);
    }

    // Método para criar o ninja no banco de dados
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

}
