/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedrohnf688.lerarquivocsv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.pedrohnf688.modelo.Pessoa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author phnf2
 */
public class LeituraCsv {

      public static void main(String[] args) throws IOException {

        JFileChooser jfc = new JFileChooser("C:\\Users\\phnf2\\Desktop\\");
        jfc.setMultiSelectionEnabled(true);
//        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter ("Arquivo CSV", "csv");  
        jfc.setFileFilter (fileFilter);
        
        int escolha = jfc.showOpenDialog(null);
        
        if(escolha == JFileChooser.APPROVE_OPTION){
            
           try{
              
               Reader reader = Files.newBufferedReader(Paths.get(jfc.getSelectedFile().getAbsolutePath()));

               CsvToBean<Pessoa> csvToBean = new CsvToBeanBuilder(reader).withType(Pessoa.class).build();
          
               List<Pessoa> pessoas = csvToBean.parse();  
        
              for(Pessoa pessoa : pessoas){
                  System.out.println(pessoa);
              }
              
           }catch(FileNotFoundException e){
                System.out.println("Arquivo não encontrado:\n"+e.getMessage());
           }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("IndexOutOfBounds:\n"+e.getMessage());
           }catch(IOException e){
                System.out.println("IO erro:\n"+e.getMessage());
           }
            
        }else{
            System.out.println("Seleção cancelada");
        }
          
      }
    
}
