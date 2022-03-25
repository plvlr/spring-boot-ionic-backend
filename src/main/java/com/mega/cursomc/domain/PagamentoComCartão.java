package com.mega.cursomc.domain;

import com.mega.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartão extends Pagamento{
    private static final long serialVersionUID = 1L;

    private Integer numeroDePacelas;

    public PagamentoComCartão() {

    }

    public PagamentoComCartão(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDePacelas) {
        super(id, estado, pedido);
        this.numeroDePacelas = numeroDePacelas;
    }

    public Integer getNumeroDePacelas() {
        return numeroDePacelas;
    }

    public void setNumeroDePacelas(Integer numeroDePacelas) {
        this.numeroDePacelas = numeroDePacelas;
    }
}
