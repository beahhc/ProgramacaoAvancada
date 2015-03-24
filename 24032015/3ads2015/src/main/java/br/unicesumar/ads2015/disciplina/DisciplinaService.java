package br.unicesumar.ads2015.disciplina;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    public void salvar(Disciplina d) {
        repository.save(d);
    }
    public List<Disciplina> getDisciplinas() {
        return repository.findAll();
    }
    public void editar(Disciplina d) {
        repository.save(d);
    }
    public void excluir(Long id) {
        repository.delete(id);
    }
}
