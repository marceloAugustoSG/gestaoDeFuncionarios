package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.collection.FuncionarioCollection;
import com.gestaoDeFuncionarios.model.Bonus;
import com.gestaoDeFuncionarios.model.Funcionario;
import com.gestaoDeFuncionarios.view.ManterFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ManterFuncionarioPresenter {
    
    private ManterFuncionarioView view;
    private FuncionarioCollection funcionarios;
    
    public ManterFuncionarioPresenter(FuncionarioCollection funcionarios) {
        this.funcionarios = funcionarios;
        view = new ManterFuncionarioView();
        configurarTelaInicial();
        
        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
        
        view.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvar();
            }
        });
        
    }
    
    private void configurarTelaInicial() {
        view.getBtnEditar().setEnabled(false);
        view.getBtnExcluir().setEnabled(false);
        
    }
    
    private void fechar() {
        view.dispose();
    }
    
    private void salvar() {
        String nome = view.getTxtNome().getText();
        String cargo = (String) view.getCbOpcoesCargo().getSelectedItem();
        int idade = Integer.parseInt(view.getTxtIdade().getText());
        String tipoBonus = (String) view.getCbOpcoesBonus().getSelectedItem();
        double salario = Double.parseDouble(view.getTxtSalario().getText());
        int faltas = Integer.parseInt(view.getTxtFaltas().getText());
        String dataAdmissao = view.getTxtDataAdmissao().getText();
        
        Funcionario funcionario = new Funcionario(nome, idade, salario, cargo);
        funcionarios.add(funcionario);
        
        JOptionPane.showMessageDialog(view, "Funcionario :" + funcionario.getNome() + "\nCargo: " + funcionario.getCargo() + "\nIdade: " + funcionario.getIdade() + " \nsalvo com sucesso!");
        
    }
    
}
