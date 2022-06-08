package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.collection.FuncionarioCollection;
import com.gestaoDeFuncionarios.model.Funcionario;
import com.gestaoDeFuncionarios.view.BuscarFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListIterator;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

// teste
public class BuscarFuncionarioPresenter {

    private BuscarFuncionarioView view;
    private FuncionarioCollection funcionarios;
    private DefaultTableModel tblBFuncionarios;

    public BuscarFuncionarioPresenter(FuncionarioCollection funcionarios) {
        view = new BuscarFuncionarioView();
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

        view.getTblBuscarFuncionarios().setModel(tblBFuncionarios);

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

    }

    private void configurarBtns() {
        view.getBtnVerBonus().setEnabled(false);
        view.getBtnVisualizar().setEnabled(false);

    }

    private void fechar() {
        view.dispose();
    }

}
