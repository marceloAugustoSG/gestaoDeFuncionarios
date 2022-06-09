package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.DAO.FuncionarioSQLDAO;
import com.gestaoDeFuncionarios.view.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalPresenter {

    private PrincipalView view;
<<<<<<< HEAD
    private FuncionarioSQLDAO funcionarios;

    public PrincipalPresenter() {
        view = new PrincipalView();
        this.funcionarios = new FuncionarioSQLDAO();
=======
    private FuncionarioCollection funcionarios;

    public PrincipalPresenter() {
        view = new PrincipalView();
        this.funcionarios = new FuncionarioCollection();
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4

        view.getmOpCadastrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ManterFuncionarioPresenter(funcionarios);
            }
        });

        view.getmOpBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD

                try {
                    new BuscarFuncionarioPresenter(funcionarios);
                } catch (SQLException ex) {
                    Logger.getLogger(PrincipalPresenter.class.getName()).log(Level.SEVERE, null, ex);
                }

=======
                new BuscarFuncionarioPresenter(funcionarios);
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
            }
        });

        view.getmOpCalcularSalario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CalcularSalarioPresenter();
            }
        });

        view.getmOpSair().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });

        view.getmOpTrocarMecanismoLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

    }

    private void fechar() {
        System.exit(0);
    }
}
