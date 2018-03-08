/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.bruno;

import br.edu.bruno.escola.Disciplina;
import static br.edu.bruno.escola.Pessoa.calculaIdade;
import br.edu.bruno.escola.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.149417
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
        
        public static void main(String[] args) throws ParseException{
   {
      /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Date dataNascimento = sdf.parse("15/11/1979"); 
      int idade = calculaIdade(dataNascimento);
       System.out.println("A idade do Aluno é: ");
      System.out.println(idade);*/
       
      
       
       
       
       
     
       
       
       String nome = JOptionPane.showInputDialog("Qual o nome da disciplina?");
       String departamento = JOptionPane.showInputDialog("Qual o departamento da disciplina?");
       char status = JOptionPane.showInputDialog("Qual o status da disciplina?").charAt(0);
       
       
       
       
       
       int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Qual a carga horaria do professor?"));
       float valorHora = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da hora?"));
       nome = JOptionPane.showInputDialog("Qual o nome do professor?");
       String cpf = JOptionPane.showInputDialog("Qual o CPF do professor?");
       String rg = JOptionPane.showInputDialog("Qual o RG do professor?");
       
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Date d = sdf.parse(JOptionPane.showInputDialog("Qual a data de nascimento do professor?"));
       Professor p1 = new Professor(cargaHoraria, valorHora, nome, cpf, rg, d);
      
       
       
   }
        
    }
    
}
