/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestaoDeFuncionarios.impl;

import com.gestaoDeFuncionarios.interfaces.IBonus;
import com.gestaoDeFuncionarios.model.Funcionario;

/**
 *
 * @author Usuário
 */
public class BonusAssiduidade implements IBonus{

    @Override
    public double aplicaBonus(Funcionario funcionario) {
        if(funcionario.getNumFaltas() == 0) {
            return (1.1 * funcionario.getSalarioBase());
        } else {
            if(funcionario.getNumFaltas() >= 1 && funcionario.getNumFaltas() <= 3) {
                return (1.05 * funcionario.getSalarioBase());
            } else {
                return (1.01 * funcionario.getSalarioBase());
            }
        }
    }

    @Override
    public boolean accept(Funcionario funcionario) {
        return true;
    }
    
}
