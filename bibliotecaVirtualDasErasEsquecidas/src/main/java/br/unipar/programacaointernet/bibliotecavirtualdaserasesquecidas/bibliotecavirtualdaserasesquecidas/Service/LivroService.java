package br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.Service;

import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.model.Livro;
import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.repository.LivroRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class LivroService {
    @Inject
    private LivroRepository livroRepository;

    public List<Livro> listar() {
        return livroRepository.listarTodos();
    }
    public void cadastrar(Livro livro) throws Exception {
        livroRepository.cadastrar(livro);
    }
}
