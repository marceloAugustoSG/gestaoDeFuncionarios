/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestaoDeFuncionarios.impl;

import com.gestaoDeFuncionarios.interfaces.ICalculadoraBonus;
import com.gestaoDeFuncionarios.model.Funcionario;

/**
 *
 * @author Usuário
 */
public class BonusAssiduidade implements ICalculadoraBonus{

    @Override
    public double calculaBonus(Funcionario funcionario) {
        if(funcionario.getNumFaltas() == 0) {
            return 1.1;
        } else {
            if(funcionario.getNumFaltas() >= 1 && funcionario.getNumFaltas() <= 3) {
                return 1.05;
            } else {
                if(funcionario.getNumFaltas() >= 4 && funcionario.getNumFaltas() <= 5) {
                    return 1.01;
                } else {
                    return 1.01;
                }
            }
        }
    }
    
}
