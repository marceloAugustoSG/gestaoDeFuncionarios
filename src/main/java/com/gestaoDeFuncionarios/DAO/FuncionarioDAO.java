/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoDeFuncionarios.DAO;

import com.gestaoDeFuncionarios.model.Funcionario;
import com.gestaoDeFuncionarios.presenter.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public abstract class FuncionarioDAO {
    
    public ArrayList<IObserver> observers;
    
    public abstract boolean create(Funcionario funcionario);
    public abstract List<Funcionario> getFuncionarios(String nome);
    public abstract boolean delete(int idFuncionario);
    public abstract void notificar();
    public abstract void add(IObserver observer);
    
}
