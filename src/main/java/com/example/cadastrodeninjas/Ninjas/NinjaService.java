package com.example.cadastrodeninjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar Ninja por ID
    public NinjaModel listNinjaById(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }

}
