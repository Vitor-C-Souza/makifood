package br.com.makifood.pagamentos.dto;

import br.com.makifood.pagamentos.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class obterPagamentoDto {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;
    private List<ItemDoPedidoDto> itens = new ArrayList<>();

    public obterPagamentoDto(PagamentoDto dto, List<ItemDoPedidoDto> itens){
        this.id = dto.getId();
        this.valor = dto.getValor();
        this.nome = dto.getNome();
        this.numero = dto.getNumero();
        this.expiracao = dto.getExpiracao();
        this.codigo = dto.getCodigo();
        this.status = dto.getStatus();
        this.formaDePagamentoId = dto.getFormaDePagamentoId();
        this.pedidoId = dto.getPedidoId();
        this.itens = itens;
    }
}
