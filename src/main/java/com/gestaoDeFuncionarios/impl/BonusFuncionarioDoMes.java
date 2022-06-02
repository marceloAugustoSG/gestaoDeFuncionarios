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
public class BonusFuncionarioDoMes implements IBonus {

    @Override
    public double aplicaBonus(Funcionario funcionario) {
        return (1.2 * funcionario.getSalarioBase()); //bonusFuncionarioDoMes = 20%
    }

    @Override
    public boolean accept(Funcionario funcionario) {
        if(funcionario.isFuncionarioDoMes()) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "FuncionarioDoMes";
    }
}
