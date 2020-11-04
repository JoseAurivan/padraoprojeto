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
public class BancoImplementacao {

     public static void main(String[] args) {
        BancoDoBrasil bb = new BancoDoBrasil();
        
        bb.lerArquivo("C:/Users/auriv/OneDrive/Documentos/NetBeansProjects/BancoImplementacao/src/bancoimplementacao/banco-brasil-1.txt");
       
    }

    
}
