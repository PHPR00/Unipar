package br.unipar.programacaointernet.vendaapi.dto;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValorTotalClienteDTO {

    private String nomeCliente;
    private BigDecimal valorTotal;


}
