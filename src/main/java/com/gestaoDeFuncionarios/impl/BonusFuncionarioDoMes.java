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
public class BonusFuncionarioDoMes extends Bonus {

    public BonusFuncionarioDoMes(String tipo) {
        super.setTipo(tipo);
    }
    
    @Override
    public double aplicaBonus(Funcionario funcionario) {
        return (0.2 * funcionario.getSalarioBase()); //bonusFuncionarioDoMes = 20%
    }

    @Override
    public boolean accept(Funcionario funcionario) {
        if(funcionario.isFuncionarioDoMes()) {
            return true;
        }
        return false;
    }
    
}
