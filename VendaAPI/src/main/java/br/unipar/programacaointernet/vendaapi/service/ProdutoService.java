package br.unipar.programacaointernet.vendaapi.service;

import br.unipar.programacaointernet.vendaapi.dto.ValorTotalClienteDTO;
import br.unipar.programacaointernet.vendaapi.mapper.ProdutoMapper;
import br.unipar.programacaointernet.vendaapi.model.Produto;
import br.unipar.programacaointernet.vendaapi.model.Venda;
import br.unipar.programacaointernet.vendaapi.repository.ProdutoRepository;
import br.unipar.programacaointernet.vendaapi.repository.VendaRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class ProdutoService {

    @Inject
    private ProdutoRepository produtoRepository;

    @Inject
    private VendaRepository vendaRepository;

    public List<Produto> listar() {
        return produtoRepository.listar();
    }
    
    public Produto buscarPorID(Integer id) {
        return produtoRepository.buscarPorID(id);
    }
    
    public void cadastrar(Produto produto) throws Exception {
        produtoRepository.cadastrar(produto);
    }

    public void editar(Produto produto) throws Exception {
        produtoRepository.editar(produto);
    }

    public void excluir(Produto produto) throws Exception {
        produtoRepository.excluir(produto);
    }

    public List<ValorTotalClienteDTO> listarProdrutoDescricao() {
        List<Venda> listaVenda = vendaRepository.listar();
        return ProdutoMapper.toDTO(listaVenda);


    }
}
