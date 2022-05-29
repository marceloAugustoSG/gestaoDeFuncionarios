package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.view.CalcularSalarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularSalarioPresenter {

    private CalcularSalarioView view;

    public CalcularSalarioPresenter() {
        view = new CalcularSalarioView();

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
    }

    private void fechar() {
        view.dispose();
    }

}
