/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.bruno;

import br.edu.bruno.escola.Aluno;
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
       int escMenu=0;
        
       ArrayList<Disciplina>materias = new ArrayList<>();
        ArrayList<Aluno>alunolist = new ArrayList<>();
       ArrayList<Professor>listProfessor = new ArrayList<>();
       
       
       do{
           escMenu=Integer.parseInt(JOptionPane.showInputDialog("escolha uma das opiçoes \n"
            +"1. Cadastro Disciplinas\n"
            +"2.Cadastro de alunos \n"
            +"3.cadastro professores\n"
           +"4. sair /n"));
       switch(escMenu){
           case 1 :{
               do{
                   String nome = JOptionPane.showInputDialog("qual nome ");
                   String departamento= JOptionPane.showInputDialog("Qual o departamento");
                   char Status = JOptionPane.showInputDialog("Status").charAt(0);
                   materias.add(new Disciplina(nome,departamento,Status));
               }while((JOptionPane.showConfirmDialog(null,"deseja continuar?"))==0);
               break;
               }
           case 2 :{
               String nomeAluno=JOptionPane.showInputDialog("Informe o nome do aluno ");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula: "));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data de matricula"));
        String rgAluno=JOptionPane.showInputDialog("Informe o RG do aluno");
        String cpfAluno=JOptionPane.showInputDialog("Informe o CPF do aluno");
        Date dataNascimentoAluno=sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento"));
        alunolist.add(new Aluno(matricula, dataMatricula, nomeAluno, rgAluno, cpfAluno, dataNascimentoAluno));
        
        if(JOptionPane.showConfirmDialog(null, "Oaluno ja se cadastrou em alguma disciplina?")==0);{
        String materiasExistentes="";
        for(Disciplina materia:materias){
            materiasExistentes += materias.indexOf(materia)+""+materia.getNome()+"\n";
        }
         do{   
            int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a materia-- \n"+ materiasExistentes));
            alunolist.get(alunolist.size()-1).getDisciplina().add(materias.get(esc));
            
    }while((JOptionPane.showConfirmDialog(null,"deseja continuar?"))==0);
           }
           break;
           }
       
           
           
           case 3 : {
               
           
           String nomeProfessor= JOptionPane.showInputDialog("Informe o nome do professor:");
        int cargaHoraria =Integer.parseInt(JOptionPane.showInputDialog("Informe a acarga horaria:"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora:"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String rg = JOptionPane.showInputDialog("Informe o RG do professor:");
        String cpf= JOptionPane.showInputDialog("Informe o CPF do professor:");
        Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento:"));
           listProfessor.add(new Professor (cargaHoraria, valorHora, cpf, rg, cpf, dataNascimento));
           
           
           
           if(JOptionPane.showConfirmDialog(null, "O professor ja se cadastrou em alguma disciplina?")==0);
        String materiaExistentes="";
        for(Disciplina materia:materias){
            materiaExistentes += materias.indexOf(materia)+""+materia.getNome()+"\n";
        
         do{   
            int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a materia-- \n"+ materiaExistentes));
            listProfessor.get(listProfessor.size()-1).getDisciplina().add(materias.get(esc));
               
            }while((JOptionPane.showConfirmDialog(null,"deseja continuar?"))==0);
        }
           break;
           }
       }
       
      
       }while(escMenu!=4);
        
    }
    
}
