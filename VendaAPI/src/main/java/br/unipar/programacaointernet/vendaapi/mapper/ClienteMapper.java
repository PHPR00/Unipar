package br.unipar.programacaointernet.vendaapi.mapper;

import br.unipar.programacaointernet.vendaapi.dto.ClienteDTO;
import br.unipar.programacaointernet.vendaapi.model.Cliente;
import br.unipar.programacaointernet.vendaapi.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class ClienteMapper {

    public static List<ClienteDTO> toDTO(List<Cliente> clienteList) {

        List<ClienteDTO> dtoList = new ArrayList<>();
        for (Cliente cliente : clienteList) {
            ClienteDTO dto = new ClienteDTO();
            dto.setNomeCliente(cliente.getNome());
            dto.setTelefone(cliente.getTelefone());
            dto.setAniversario(cliente.getAniversario());

            dtoList.add(dto);
        }
        return dtoList;
    }
}
