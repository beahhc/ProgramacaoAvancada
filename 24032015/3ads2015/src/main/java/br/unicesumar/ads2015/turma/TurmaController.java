package br.unicesumar.ads2015.turma;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    
    public void criarTurma(@RequestParam String nome, @RequestParam String codigo, @RequestParam Long cursoId) {
        
    }
    public void executar(@RequestParam CriarTurmaCommand comando) {
        
    }
    
}
