package br.com.jamezmayke.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boasvindas")
public class Controller {

    @GetMapping("/")
    public String exibirMensagem() {
        return "Bem-vindo à nossa API de Cadastro de Ninjas!";
    }
}
