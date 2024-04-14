package br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.Service;


import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.model.Usuario;
import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.repository.UsuarioRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class UsuarioService {
    @Inject
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listar() {
        return usuarioRepository.listarTodosUsuario();
    }
    public void cadastrar(Usuario usuario) throws Exception {
        usuarioRepository.cadastrar(usuario);
    }
}
