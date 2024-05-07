package br.unipar.programacaointernet.vendaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private String nomeCliente;
    private String telefone;
    private String aniversario;
}
