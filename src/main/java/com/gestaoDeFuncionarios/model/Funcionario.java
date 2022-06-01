package com.gestaoDeFuncionarios.model;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private int numFaltas;
    private String dataAdmissao;

    // o bonus ainda nao está sendo usado para salvar o funcionario
    private Bonus bonus;

    public Funcionario(String nome, int idade, double salario, String cargo, int numFaltas, String dataAdmissao) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.numFaltas = numFaltas;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public int getNumFaltas() {
        return this.numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }
    
    public String getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
