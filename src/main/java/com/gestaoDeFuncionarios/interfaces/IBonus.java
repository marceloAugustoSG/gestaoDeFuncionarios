/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestaoDeFuncionarios.interfaces;

import com.gestaoDeFuncionarios.model.Funcionario;

/**
 *
 * @author Usuário
 */
public interface IBonus {
    public abstract double aplicaBonus(Funcionario funcionario);
    public abstract boolean accept(Funcionario funcionario);
}
