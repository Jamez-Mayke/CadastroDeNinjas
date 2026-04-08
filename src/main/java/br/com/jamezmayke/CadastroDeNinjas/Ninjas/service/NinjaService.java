package br.com.jamezmayke.CadastroDeNinjas.Ninjas.service;

import java.util.List;

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

}
