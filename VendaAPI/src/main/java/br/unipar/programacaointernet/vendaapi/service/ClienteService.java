package br.unipar.programacaointernet.vendaapi.service;

import br.unipar.programacaointernet.vendaapi.dto.ClienteDTO;
import br.unipar.programacaointernet.vendaapi.dto.ValorTotalClienteDTO;
import br.unipar.programacaointernet.vendaapi.mapper.ClienteMapper;
import br.unipar.programacaointernet.vendaapi.mapper.ProdutoMapper;
import br.unipar.programacaointernet.vendaapi.model.Cliente;
import br.unipar.programacaointernet.vendaapi.model.Venda;
import br.unipar.programacaointernet.vendaapi.repository.ClienteRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class ClienteService {

    @Inject
    private ClienteRepository clienteRepository;


    public List<Cliente> listar() {
        return clienteRepository.listar();
    }
    
    public Cliente buscarPorID(Integer id) {
        return clienteRepository.buscarPorID(id);
    }
    
    public void cadastrar(Cliente cliente) throws Exception {
        clienteRepository.cadastrar(cliente);
    }

    public void editar(Cliente cliente) throws Exception {
        clienteRepository.editar(cliente);
    }

    public void excluir(Cliente cliente) throws Exception {
        clienteRepository.excluir(cliente);
    }

    public List<ClienteDTO> listaClienteDTO() {
        List<Cliente>  clienteList = clienteRepository.listar();
        return ClienteMapper.toDTO(clienteList);

    }
}
