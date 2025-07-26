package com.example.cadastrodeninjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes() {
        return "Lista de missões";
    }

    @GetMapping("/listarId")
    public String listarMissaoPorId() {
        return "Lista missão por ID.";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão Criada!";
    }

    @PutMapping("/atualizarId")
    public String atualizarMissao() {
        return "Missão atualizada";
    }

    @DeleteMapping("/deletarId")
    public String deletarMissaoPorId() {
        return "Missão deletada!";
    }
}
