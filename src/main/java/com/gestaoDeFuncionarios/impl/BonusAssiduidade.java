/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestaoDeFuncionarios.impl;

import com.gestaoDeFuncionarios.model.Bonus;
import com.gestaoDeFuncionarios.model.Funcionario;

/**
 *
 * @author Usuário
 */
public class BonusAssiduidade extends Bonus{
    
    public BonusAssiduidade(String tipo) {
        super.setTipo(tipo);
    }
    
    @Override
    public double aplicaBonus(Funcionario funcionario) {
        if(funcionario.getNumFaltas() == 0) {
            return (0.1 * funcionario.getSalarioBase());
        } else {
            if(funcionario.getNumFaltas() >= 1 && funcionario.getNumFaltas() <= 3) {
                return (0.05 * funcionario.getSalarioBase());
            } else {
                return (0.01 * funcionario.getSalarioBase());
            }
        }
    }

    @Override
    public boolean accept(Funcionario funcionario) {
        return true;
    }
}
