package br.com.jamezmayke.CadastroDeNinjas.Ninjas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public String create() {
        return "Ninja criado!";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.listarTodosOsNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar ninja por ID";
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
