package br.unipar.programacaointernet.vendaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteTotalVendaDTO {

    private String nomeCliente;
    private Long quantidate;
}
