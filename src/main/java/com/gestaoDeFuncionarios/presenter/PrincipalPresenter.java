package com.gestaoDeFuncionarios.presenter;

import com.gestaoDeFuncionarios.view.ManterFuncionarioView;
import com.gestaoDeFuncionarios.view.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrincipalPresenter {
    
    private PrincipalView view;
    
    public PrincipalPresenter() {
        view = new PrincipalView();
        
        view.getmOpCadastrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ManterFuncionarioPresenter();
            }
        });
        
        view.getmOpBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BuscarFuncionarioPresenter();
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
