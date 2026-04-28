package br.com.jamezmayke.CadastroDeNinjas.Ninjas.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamezmayke.CadastroDeNinjas.Ninjas.NinjaDTO;
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
    public ResponseEntity<String> create(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body("Ninja criado com sucesso: " + novoNinja.getNome() + " ID: " + novoNinja.getId());
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public ResponseEntity<List<NinjaDTO>> mostrarTodosOsNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarTodosOsNinjas();
        return ResponseEntity.status(HttpStatus.OK).body(ninjas);
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjaPorId(@PathVariable Long id) {
        NinjaDTO ninjaDto = ninjaService.listarNinjaPorId(id);

        if (ninjaDto != null) {
            return ResponseEntity
            .status(HttpStatus.OK)
            .body(ninjaDto);
        } else {
            return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Dados do ninja com ID " + id + " não encontrados");
        }
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO dadosNinjaAtualizado) {
        NinjaDTO ninjaDto = ninjaService.atualizarNinjaPorId(id, dadosNinjaAtualizado);

        if(ninjaDto != null) {
            return ResponseEntity
                .status(HttpStatus.OK)
                .body(ninjaDto);
        } else {
            return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Dados do ninja com ID " + id + " não encontrados");
        }
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id) {
        if (ninjaService.listarNinjaPorId(id) != null) {
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity
                .ok("Ninja com ID " + id + " deletado com sucesso!");
        } else {
            return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("O ninja com ID " + id + " Não foi encontrado!");
        }

    }
}
