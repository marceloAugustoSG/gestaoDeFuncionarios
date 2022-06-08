package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.collection.FuncionarioCollection;
import com.gestaoDeFuncionarios.view.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPresenter {

    private PrincipalView view;
    private FuncionarioCollection funcionarios;

    public PrincipalPresenter() {
        view = new PrincipalView();
        this.funcionarios = new FuncionarioCollection();

        view.getmOpCadastrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ManterFuncionarioPresenter(funcionarios);
            }
        });

        view.getmOpBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BuscarFuncionarioPresenter(funcionarios);
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
