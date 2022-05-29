package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.view.BuscarFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarFuncionarioPresenter {

    private BuscarFuncionarioView view;

    public BuscarFuncionarioPresenter() {
        view = new BuscarFuncionarioView();
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
                new ManterFuncionarioPresenter();
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
