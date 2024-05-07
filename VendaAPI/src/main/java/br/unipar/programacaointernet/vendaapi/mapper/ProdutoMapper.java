package br.unipar.programacaointernet.vendaapi.mapper;

import br.unipar.programacaointernet.vendaapi.dto.ValorTotalClienteDTO;
import br.unipar.programacaointernet.vendaapi.model.Cliente;
import br.unipar.programacaointernet.vendaapi.model.Produto;
import br.unipar.programacaointernet.vendaapi.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMapper {

    public static List<ValorTotalClienteDTO> toDTO(List<Venda> vendaList) {

        List<ValorTotalClienteDTO> dtoList = new ArrayList<>();
        for (Venda venda : vendaList) {
            ValorTotalClienteDTO dto = new ValorTotalClienteDTO();
            dto.setNomeCliente(venda.getCliente().getNome());
            dto.setValorTotal(venda.getTotal());

            dtoList.add(dto);
        }
        return dtoList;
    }


}
