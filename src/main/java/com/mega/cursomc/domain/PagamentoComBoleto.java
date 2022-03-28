package com.mega.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mega.cursomc.domain.Pagamento;
import com.mega.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento {
    private static final long serialVersionUID = 1L;

    @JsonFormat(pattern = "dd/MM/aaaa")
    private Date dataVenciomento;
    @JsonFormat(pattern = "dd/MM/aaaa")
    private Date dataPagamento;

    public PagamentoComBoleto() {

    }

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVenciomento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVenciomento = dataVenciomento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVenciomento() {
        return dataVenciomento;
    }

    public void setDataVenciomento(Date dataVenciomento) {
        this.dataVenciomento = dataVenciomento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

}