package br.com.jamezmayke.CadastroDeNinjas.Missoes.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missao")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes() {
        return "Lista de missões";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão Criada!";
    }


    @PutMapping("/alterar")
    public String atualizarMissao() {
        return "Missão atualizada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissaoPorId() {
        return "Missão deletada!";
    }

}
