package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.log.FuncionarioLogTXT;

//import com.gestaoDeFuncionarios.collection.FuncionarioCollection;
//import com.gestaoDeFuncionarios.model.Funcionario;
//import com.gestaoDeFuncionarios.model.ProcessadoraBonus;

public class main {

    public static void main(String[] args) {
        new PrincipalPresenter();
        /*
        Funcionario funcionario = new Funcionario("Fulano", 200000.0, "Programador");
        
        FuncionarioLogTXT logTXT = new FuncionarioLogTXT();
        logTXT.geraLog(funcionario);
        
        Funcionario funcionario2 = new Funcionario("Fulano2", 200000.0, "Programador");
        logTXT.geraLog(funcionario2);
        
        FuncionarioCollection funcionarios = new FuncionarioCollection();
        funcionarios.add(new Funcionario("Fulano", 10, 1500, "Programador", 0, "2000-05-20", true, "Generoso"));
        ProcessadoraBonus processa = new ProcessadoraBonus();
        for(Funcionario funcionario : funcionarios.getFuncionarios()) {
            funcionario.setSalario(processa.processar(funcionario)); 
        }
        System.out.println(funcionarios.getFuncionarios().toString());*/
    }

}
