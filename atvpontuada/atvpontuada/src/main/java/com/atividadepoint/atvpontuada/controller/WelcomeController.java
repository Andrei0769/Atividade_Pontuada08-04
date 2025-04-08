package com.atividadepoint.atvpontuada.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public ResponseEntity<String> boasVindas() {
        return ResponseEntity.ok("🚀Bem-vindo à API de Funcionários!");
    }

    @GetMapping("/dev")
    public ResponseEntity<String> nomeDev() {
        return ResponseEntity.ok("Desenvolvidor: Andrei Luiz👨‍💻😊");
    }
}