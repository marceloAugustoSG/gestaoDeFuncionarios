package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.DAO.FuncionarioDAO;
import com.gestaoDeFuncionarios.DAO.FuncionarioSQLDAO;
import com.gestaoDeFuncionarios.model.Funcionario;
import com.gestaoDeFuncionarios.view.BuscarFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
public class BuscarFuncionarioPresenter {

    private BuscarFuncionarioView view;
    private FuncionarioSQLDAO funcionarios;
=======
// teste
public class BuscarFuncionarioPresenter {

    private BuscarFuncionarioView view;
    private FuncionarioCollection funcionarios;
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
    private DefaultTableModel tblBFuncionarios;

    public BuscarFuncionarioPresenter(FuncionarioSQLDAO funcionarios) throws SQLException {
        view = new BuscarFuncionarioView();
<<<<<<< HEAD
        this.funcionarios = funcionarios;
        carregarTabela();
=======
        this.funcionarios = new FuncionarioCollection();

        tblBFuncionarios = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Nome", "Idade", "Função", "Salário Base(R$)"}
        );

        view.getTblBuscarFuncionarios().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        tblBFuncionarios.setNumRows(0);
        ListIterator<Funcionario> it = funcionarios.getFuncionarios().listIterator();
        int id = 0;
        while (it.hasNext()) {
            Funcionario funcionario = it.next();
            tblBFuncionarios.addRow(new Object[]{id, funcionario.getNome(), funcionario.getIdade(), funcionario.getCargo(), funcionario.getSalario()});
            id++;
        }
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4

        view.getTblBuscarFuncionarios().setModel(tblBFuncionarios);
        view.getTblBuscarFuncionarios().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        configurarBtns();

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });

        view.getBtnNovo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ManterFuncionarioPresenter(funcionarios);
            }
        });

        view.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeFuncionario = view.getTxtBuscarFuncionario().getText();
                buscarFuncionario(nomeFuncionario);
            }
        });

    }

    private void carregarTabela() throws SQLException {
        tblBFuncionarios = new DefaultTableModel(new Object[][]{}, new String[]{"ID", "Nome", "Idade", "Salario", "Bonus", "Cargo"});

        view.getTblBuscarFuncionarios()
                .setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListIterator<Funcionario> it = funcionarios.getFuncionarios().listIterator();

        while (it.hasNext()) {
            Funcionario funcionario = it.next();
            tblBFuncionarios.addRow(new Object[]{funcionario.getIdFuncionario(), funcionario.getNome(), funcionario.getIdade(), funcionario.getSalario(), funcionario.getTipoBonus(), funcionario.getCargo()});

        }

        view.getTblBuscarFuncionarios()
                .setModel(tblBFuncionarios);

    }

    private void buscarFuncionario(String nome) {
        tblBFuncionarios = new DefaultTableModel(new Object[][]{}, new String[]{"ID", "Nome", "Idade", "Salario", "Bonus", "Cargo"});
        view.getTblBuscarFuncionarios().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListIterator<Funcionario> it = funcionarios.getFuncionarios(nome).listIterator();

        while (it.hasNext()) {
            Funcionario funcionario = it.next();
            tblBFuncionarios.addRow(new Object[]{funcionario.getIdFuncionario(), funcionario.getNome(), funcionario.getIdade(), funcionario.getSalario(), funcionario.getTipoBonus(), funcionario.getCargo()});

        }
        view.getTblBuscarFuncionarios().setModel(tblBFuncionarios);

    }

    private void configurarBtns() {
        view.getBtnVerBonus().setEnabled(false);
        view.getBtnVisualizar().setEnabled(false);

    }

    private void fechar() {
        view.dispose();
    }

}
