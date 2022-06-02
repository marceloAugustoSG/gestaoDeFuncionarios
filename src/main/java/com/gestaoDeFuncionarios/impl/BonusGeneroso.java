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
public class BonusGeneroso implements IBonus{

    @Override
    public double aplicaBonus(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean accept(Funcionario funcionario) {
        if(funcionario.getTipoBonus() == "Generoso") {
           return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Generoso";
    }
}
