package br.com.jamezmayke.CadastroDeNinjas.Ninjas.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.jamezmayke.CadastroDeNinjas.Ninjas.NinjaDTO;
import br.com.jamezmayke.CadastroDeNinjas.Ninjas.NinjaMapper;
import br.com.jamezmayke.CadastroDeNinjas.Ninjas.model.NinjaModel;
import br.com.jamezmayke.CadastroDeNinjas.Ninjas.repository.NinjaRepository;

@Service
public class NinjaService {
    
    private final NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listarTodosOsNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
            .map(ninjaMapper::map)
            .collect(Collectors.toList());
    }

    public NinjaDTO listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaExists = ninjaRepository.findById(id);
        return ninjaExists.map(ninjaMapper::map).orElse(null);
    }

    // Método para criar o ninja no banco de dados
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }

    // Método para deletar um Ninja por ID - Tem que ser um método VOID
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar ninja por ID
    public NinjaDTO atualizarNinjaPorId(Long id, NinjaDTO novosDadosNinja) {
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);

        if(ninja.isPresent()) {
            NinjaModel ninjaAtualizado = ninjaMapper.map(novosDadosNinja);
            ninjaAtualizado.setId(id);

            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }

}
