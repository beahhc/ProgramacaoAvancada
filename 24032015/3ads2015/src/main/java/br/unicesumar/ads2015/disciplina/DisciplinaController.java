package br.unicesumar.ads2015.disciplina;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {    
    @Autowired
    private DisciplinaService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Disciplina> getDisciplinas() {
        return service.getDisciplinas();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void criarDisciplina(@RequestBody Disciplina d) {
        service.salvar(d);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public void editarDisciplina(@RequestBody Disciplina d) {
        service.editar(d);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void excluirDisciplina(@PathVariable Long id) {
        service.excluir(id);
    }
    
}
