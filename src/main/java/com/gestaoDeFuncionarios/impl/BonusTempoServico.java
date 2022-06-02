/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestaoDeFuncionarios.impl;

import com.gestaoDeFuncionarios.interfaces.IBonus;
import com.gestaoDeFuncionarios.model.Funcionario;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Usuário
 */
public class BonusTempoServico implements IBonus{

    @Override
    public double aplicaBonus(Funcionario funcionario) {
        LocalDate now = LocalDate.now();
        LocalDate earlier = LocalDate.parse(funcionario.getDataAdmissao());
        Period period = Period.between(now, earlier);
        int years = Math.abs(period.getYears());
        
        if(years >= 1 && years <= 5) {
            return (1.02 * funcionario.getSalarioBase());
        } else {
            if(years >= 6 && years <= 10) {
                return (1.03 * funcionario.getSalarioBase());
            } else {
                if(years >= 11 && years <= 15) {
                    return (1.08 * funcionario.getSalarioBase());
                } else {
                    if(years >= 16 && years <= 20) {
                        return (1.1 * funcionario.getSalarioBase());
                    } else {
                        return (1.15 * funcionario.getSalarioBase());
                    }
                }
            }
        }
    }

    @Override
    public boolean accept(Funcionario funcionario) {
        LocalDate now = LocalDate.now();
        LocalDate earlier = LocalDate.parse(funcionario.getDataAdmissao());
        Period period = Period.between(now, earlier);
        int years = Math.abs(period.getYears());
        if(years > 0) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "TempoServico";
    }
}
