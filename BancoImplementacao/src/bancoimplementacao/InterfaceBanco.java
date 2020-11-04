/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoimplementacao;

import java.util.List;

/**
 *
 * @author auriv
 */
public interface InterfaceBanco {
    public String lerArquivo(String nomeArquivo);
    public Boleto gerarBoleto(String linha);
    public String lerBoletos();
}
