package br.com.jamezmayke.CadastroDeNinjas.Ninjas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamezmayke.CadastroDeNinjas.Ninjas.model.NinjaModel;
import br.com.jamezmayke.CadastroDeNinjas.Ninjas.service.NinjaService;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String exibirMensagem() {
        return "Bem-vindo à nossa API de Cadastro de Ninjas!";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel create(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.listarTodosOsNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarPorID")
    public String alterarNinjaPorId() {
        return "Alterar ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarNinjaPorID")
    public String deletarNinjaPorId() {
        return "Ninja Deletado!";
    }
}
