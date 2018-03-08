/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.bruno.escola;

import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author bruno.149417
 */
public  class Professor extends Pessoa {
    
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    private int cargaHoraria;
    private float valorHora;
    private float salario;

    public Professor(int cargaHoraria, float valorHora, String nome, String cpf, String rg, Date dataNascimento) {
        super(nome, cpf, rg, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = this.calcularSalario();
        
    }

   

    public float calcularSalario(){
        return cargaHoraria * valorHora;
    
     
    }
    
    
    
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }
    
    
    
    
    
    
    
}
