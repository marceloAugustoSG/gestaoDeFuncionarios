/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestaoDeFuncionarios.model;

import com.gestaoDeFuncionarios.impl.BonusAssiduidade;
import com.gestaoDeFuncionarios.impl.BonusFuncionarioDoMes;
import com.gestaoDeFuncionarios.impl.BonusGeneroso;
import com.gestaoDeFuncionarios.impl.BonusNormal;
import com.gestaoDeFuncionarios.impl.BonusTempoServico;
import com.gestaoDeFuncionarios.interfaces.IBonus;
import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class ProcessadoraBonus {
    private ArrayList<IBonus> processadoresBonus = new ArrayList<>();
    
    public ProcessadoraBonus() {
        this.processadoresBonus.add(new BonusNormal());
        this.processadoresBonus.add(new BonusGeneroso());
        this.processadoresBonus.add(new BonusAssiduidade());
        this.processadoresBonus.add(new BonusFuncionarioDoMes());
        this.processadoresBonus.add(new BonusTempoServico());
    }
    
    /*public void addBonus(IBonus bonus) {
        this.bonus.add(bonus);
    }*/
    
    public double processar(Funcionario funcionario) {
        double valorBonus = 0;
        double bonusTotal = 0;
                
        for(IBonus processador : processadoresBonus) {
            if(processador.accept(funcionario)){
                valorBonus = processador.aplicaBonus(funcionario);
                bonusTotal += valorBonus;
                funcionario.addBonus(new Bonus(processador.toString(), valorBonus));
                //gera log
            }
        }
        
        return bonusTotal;
    }
}
