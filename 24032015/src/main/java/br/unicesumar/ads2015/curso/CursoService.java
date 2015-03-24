package br.unicesumar.ads2015.curso;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Transactional
public class CursoService {
    @Autowired
    private CursoRepository repository;
    
    public void salvar(Curso d) {
        repository.save(d);
    }
    public List<Curso> getCursos() {
        return repository.findAll();
    }
    public void editar(Curso d) {
        repository.save(d);
    }
    public void excluir(Long id) {
        repository.delete(id);
    }

    
}
