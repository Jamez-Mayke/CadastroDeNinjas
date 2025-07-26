package com.example.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Ninja Criado!";
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar ninja por ID";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja Deletado!";
    }
}
