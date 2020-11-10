/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoimplementacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author auriv
 */
public class ProcessaBoleto{
    
    public  List<String> linhas;
       
    public  List<String> processar(String path){
        linhas = new ArrayList();
        String linha = "";
        try {
                File myObj = new File(path);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    linha = myReader.nextLine();
                    System.out.println(linha);
                    linhas.add(linha);
                }
        myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        return linhas;
    }
    

 }
    
    

