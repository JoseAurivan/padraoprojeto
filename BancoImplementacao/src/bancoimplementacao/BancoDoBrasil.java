/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoimplementacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author auriv
 */
public class BancoDoBrasil extends GerarBoleto implements InterfaceBanco{
    public List<Boleto> boletos;
    

    @Override
    public String lerArquivo(String nomeArquivo) {
        boletos = new ArrayList();
        ProcessaBoleto process = new ProcessaBoleto();
        List<String> linhas = process.processar(nomeArquivo);
        for(String linha: linhas){
            Boleto bol = processarBoleto(linha);
            boletos.add(bol);
        }
        
        return lerBoletos();
    }
    

    @Override
    public Boleto processarBoleto(String linha) {
        BoletoBancoBrasil bol = new BoletoBancoBrasil();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String[] dados = linha.split(";");
        for(int i =0; i< dados.length; i++){
            switch(i){
                case 0:
                    bol.setId(Integer.parseInt(dados[i]));
                    break;
                case 1:
                    bol.setCodBoleto(Integer.parseInt(dados[i]));
                    break;
                case 2:
                    bol.setDataVencimento(LocalDate.parse(dados[i],dateTimeFormatter));
                    break;
                case 3:
                    bol.setDataPagamento(LocalDate.parse(dados[i],dateTimeFormatter));
                    break;
                case 4:
                    bol.setCpfCliente(dados[i]);
                    break;
                case 5:
                    bol.setValor(Double.parseDouble(dados[i]));
                    break;
                case 6:
                    bol.setMulta(Double.parseDouble(dados[i]));
                    break;
                case 7:
                    bol.setJuros(Double.parseDouble(dados[i]));
                    break;
                            
            }
        }
        
        return bol;
    }

    @Override
    public String lerBoletos() {
        String result = "";
        for(Boleto bol: boletos){
            result += bol.toString();
        }
        
        return result;
    }

}
