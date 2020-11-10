/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoimplementacao;

import java.time.LocalDateTime;

/**
 *
 * @author auriv
 */
public class BoletoBradesco extends Boleto {
    public String contaCliente;
    public LocalDateTime horaPagamento;

    public String getContaCliente() {
        return contaCliente;
    }

    public void setContaCliente(String contaCliente) {
        this.contaCliente = contaCliente;
    }

    public LocalDateTime getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(LocalDateTime horaPagamento) {
        this.horaPagamento = horaPagamento;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
