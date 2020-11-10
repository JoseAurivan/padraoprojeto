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
public class BancoBradesco extends GerarBoleto implements InterfaceBanco {
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
        
        return null;
    }
    
    /**
     *
     * @param linha
     * @return
     */
    @Override
    public Boleto processarBoleto(String linha) {
        BoletoBradesco bol = new BoletoBradesco();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String[] dados = linha.split(";");
        for(int i =0; i< dados.length; i++){
            switch(i){
                case 0:
                    //id
                    bol.setId(Integer.parseInt(dados[i]));
                    break;
                case 1:
                    //cod_boleto
                    bol.setCodBoleto(Integer.parseInt(dados[i]));
                    break;
                case 2:
                    //agencia
                    bol.setAgencia(dados[i]);
                    break;
                case 3:
                    //conta do cliente
                    bol.setContaCliente(dados[i]);
                    break;
                case 4:
                    //data vencimento
                    bol.setDataVencimento(LocalDate.parse(dados[i],dateTimeFormatter));
                    break;
                case 5:
                    //data pagamento
                    bol.setDataPagamento(LocalDate.parse(dados[i],formatter));
                    break;
                case 6:
                    //cpf
                    bol.setCpfCliente(dados[i]);
                    break;
                case 7:
                    //valor
                    bol.setValor(Double.parseDouble(dados[i]));
                    break;
                case 8:
                    //multa
                    bol.setMulta(Double.parseDouble(dados[i]));
                    break;
                    //juros
                case 9:
                    bol.setJuros(Double.parseDouble(dados[i]));
                    break;
                            
            }
        }
        
        return bol;
    }

    @Override
    public String lerBoletos() {
      for(Boleto bol: boletos)
          bol.toString();
      
      return null;
    }
    
}
