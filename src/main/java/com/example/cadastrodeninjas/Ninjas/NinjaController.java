package com.example.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é  minha primeira mensagem nessa rota.";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado!";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas() {
        return "Ninja Criado!";
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/listarId")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar ninja por ID";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId() {
        return "Alterar ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId() {
        return "Ninja Deletado!";
    }
}
