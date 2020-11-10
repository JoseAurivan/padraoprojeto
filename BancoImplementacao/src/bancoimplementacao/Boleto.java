/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoimplementacao;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author auriv
 */
abstract class Boleto {
    private int id;
    private int codBoleto;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private String cpfCliente;
    private double valor;
    private double multa;
    private double juros;
    private String agencia;
    private String contaBancaria;    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getCodBoleto() {
        return codBoleto;
    }

    public void setCodBoleto(int codBoleto) {
        this.codBoleto = codBoleto;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", codBoleto=" + codBoleto + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + ", cpfCliente=" + cpfCliente + ", valor=" + valor + ", multa=" + multa + ", juros=" + juros + ", agencia=" + agencia + ", contaBancaria=" + contaBancaria + '}';
    }
    
    
}
