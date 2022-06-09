package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.DAO.FuncionarioDAO;
import com.gestaoDeFuncionarios.DAO.FuncionarioSQLDAO;
<<<<<<< HEAD

=======
import com.gestaoDeFuncionarios.collection.FuncionarioCollection;
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
import com.gestaoDeFuncionarios.impl.BonusNormal;
import com.gestaoDeFuncionarios.model.Bonus;
import com.gestaoDeFuncionarios.model.Funcionario;
import com.gestaoDeFuncionarios.view.ManterFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ManterFuncionarioPresenter {

    private ManterFuncionarioView view;
<<<<<<< HEAD
    private FuncionarioSQLDAO funcionarios;

    public ManterFuncionarioPresenter(FuncionarioSQLDAO funcionarios) {
=======
    private FuncionarioCollection funcionarios;
    FuncionarioDAO funcionarioSQLDAO = new FuncionarioSQLDAO();

    public ManterFuncionarioPresenter(FuncionarioCollection funcionarios) {
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
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
        Funcionario funcionario;
<<<<<<< HEAD

=======
        
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
        String nome = view.getTxtNome().getText();
        int idade = Integer.parseInt(view.getTxtIdade().getText());
        double salarioBase = Double.parseDouble(view.getTxtSalario().getText());
        String tipoBonus = (String) view.getCbOpcoesBonus().getSelectedItem();
        String cargo = (String) view.getCbOpcoesCargo().getSelectedItem();

<<<<<<< HEAD
        //int faltas = Integer.parseInt(view.getTxtFaltas().getText());
        //String dataAdmissao = view.getTxtDataAdmissao().getText();
        // boolean funcionarioDoMes = view.getCheckedFuncionarioMes().isSelected();
        funcionario = new Funcionario(nome, idade, salarioBase, tipoBonus, cargo);
        //Funcionario funcionario = new Funcionario(nome, idade, salarioBase, cargo, faltas, dataAdmissao, funcionarioDoMes, tipoBonus);

        funcionarios.create(funcionario);
=======
        // int faltas = Integer.parseInt(view.getTxtFaltas().getText());
        // String dataAdmissao = view.getTxtDataAdmissao().getText();
        // boolean funcionarioDoMes = view.getCheckedFuncionarioMes().isSelected();
        // double distanciaDoTrabalho = Double.parseDouble(view.getTxtDistanciaDoTrabalho().getText());
        funcionario = new Funcionario(nome, idade, salarioBase, tipoBonus, cargo);
        // Funcionario funcionario = new Funcionario(nome, idade, salarioBase, cargo, faltas, dataAdmissao, funcionarioDoMes, tipoBonus, distanciaDoTrabalho);

        funcionarioSQLDAO.create(funcionario);
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
        JOptionPane.showMessageDialog(view, "Funcionario :" + funcionario.getNome() + "\nCargo: " + funcionario.getCargo() + "\nIdade: " + funcionario.getIdade() + " \nsalvo com sucesso!");

    }

}
