package dev.akira.tarefas_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {
	private TarefaController tarefaController;
	
	@GetMapping
	public String teste() {
		return "Olá mundo!";
	}
	
	
}
