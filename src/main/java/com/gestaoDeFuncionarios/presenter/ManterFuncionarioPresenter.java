package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.view.ManterFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManterFuncionarioPresenter {

    private ManterFuncionarioView view;

    public ManterFuncionarioPresenter() {
        view = new ManterFuncionarioView();
        configurarTelaInicial();

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
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

}
