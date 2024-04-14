package br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.Service;

import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.model.Estante;
import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.repository.EstanteRepository;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class EstanteService {
    @Inject
    private EstanteRepository estanteRepository;

    public List<Estante> listar() {
        return estanteRepository.listarTodasEstantes();
    }
    public void cadastrar(Estante estante) throws Exception {
        estanteRepository.cadastrar(estante);
    }
}
