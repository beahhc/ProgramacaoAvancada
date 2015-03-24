package br.unicesumar.ads2015.turma;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    @Autowired
    private TurmaService turmaService;
    
//    public void criarTurma(@RequestParam String nome, @RequestParam String codigo, @RequestParam Long cursoId) {
//        
//    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Map<String, Object>> getTurmas() {
        return turmaService.getTurmas();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void executar(@RequestBody CriarTurmaCommand comando) {
        turmaService.executar(comando);
    }
    
}
