package br.unicesumar.ads2015.curso;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Curso> getCursos() {
        return service.getCursos();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void criarCurso(@RequestBody Curso d) {
        service.salvar(d);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public void editarCurso(@RequestBody Curso d) {
        service.editar(d);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void excluirCurso(@PathVariable Long id) {
        service.excluir(id);
    }
    
}
