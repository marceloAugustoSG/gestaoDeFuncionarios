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

/*
distancia (km) | valor (R$)
> 100          | 150
> 50 <= 100    | 90
> 10 <= 50     | 30
<= 10          | 0
*/

public class BonusDistanciaDoTrabalho extends Bonus{
    
    public BonusDistanciaDoTrabalho(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public double aplicaBonus(Funcionario funcionario) {
        double distancia = funcionario.getDistanciaDoTrabalho();
        if(distancia > 100) {
            return 150;
        } else {
            if(distancia > 50 && distancia <= 100) {
                return 90;
            } else {
                return 30;
            }
        }
    }

    @Override
    public boolean accept(Funcionario funcionario) {
        if(funcionario.getDistanciaDoTrabalho() > 10) {
            return true;
        }
        return false;
    }
    
}
