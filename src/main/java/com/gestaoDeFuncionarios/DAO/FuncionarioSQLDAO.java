package com.gestaoDeFuncionarios.DAO;

import com.gestaoDeFuncionarios.Factory.Conexao;
import com.gestaoDeFuncionarios.model.Funcionario;
import com.gestaoDeFuncionarios.presenter.IObserver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioSQLDAO extends FuncionarioDAO {
<<<<<<< HEAD

    private Conexao conexao = new Conexao();

    @Override
    public boolean create(Funcionario funcionario) {

=======
    
    private Conexao conexao = new Conexao(); 
    
    @Override
    public boolean create(Funcionario funcionario) {
        
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
        conexao.conectar();
        String sql = "INSERT INTO Funcionario("
                + "nome,idade,salario,bonus,cargo)"
                + ""
                + "VALUES(?,?,?,?,?)";
        PreparedStatement stmt = conexao.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            stmt.setString(1, funcionario.getNome());
            stmt.setInt(2, funcionario.getIdade());
            stmt.setDouble(3, funcionario.getSalario());
            stmt.setString(4, funcionario.getTipoBonus());
            stmt.setString(5, funcionario.getCargo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.desconectar();
        System.out.println("chegou aqui");
        return true;

    }
<<<<<<< HEAD

    public List<Funcionario> getFuncionarios() {

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        Funcionario funcionario;
        conexao.conectar();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Funcionario";
        try {
            stmt = conexao.criarPreparedStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt(1));
                funcionario.setNome(rs.getString(2));
                funcionario.setIdade(rs.getInt(3));
                funcionario.setSalario(rs.getDouble(4));
                funcionario.setTipoBonus(rs.getString(5));
                funcionario.setCargo(rs.getString(6));
                listaFuncionarios.add(funcionario);

            }

        } catch (Exception e) {
            System.err.println(e);
        }
        conexao.desconectar();
        return listaFuncionarios;

    }

=======
    
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
    @Override
    public List<Funcionario> getFuncionarios(String nome) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        Funcionario funcionario = new Funcionario();
        conexao.conectar();
        ResultSet rs = null;
        PreparedStatement stmt = null;

<<<<<<< HEAD
        String sql = "SELECT * FROM Funcionario where nome = '" + nome + "'";
=======
        String sql = "SELECT nome,idade,salario,bonus,cargo FROM Funcionario where nome = '" + nome + "'";
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
        try {

            stmt = conexao.criarPreparedStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                funcionario = new Funcionario();
<<<<<<< HEAD
                funcionario.setIdFuncionario(rs.getInt(1));
=======
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
                funcionario.setNome(rs.getString(2));
                funcionario.setIdade(rs.getInt(3));
                funcionario.setSalario(rs.getDouble(4));
                funcionario.setTipoBonus(rs.getString(5));
                funcionario.setCargo(rs.getString(6));
                listaFuncionarios.add(funcionario);

            }
        } catch (Exception e) {
            System.err.println(e);

        }
        conexao.desconectar();
        return listaFuncionarios;

    }

    @Override
    public boolean delete(int idFuncionario) {
        conexao.conectar();
        PreparedStatement stmt;
        String sql = "DELETE FROM Funcionario WHERE idFuncionario ='" + idFuncionario + "'";
        stmt = conexao.criarPreparedStatement(sql);

        try {
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        conexao.desconectar();
        return true;
    }

    @Override
    public void notificar() {
<<<<<<< HEAD

    }

    @Override
    public void add(IObserver observer
    ) {
=======
        
    }

    @Override
    public void add(IObserver observer) {
>>>>>>> 3ccbddcbb56103baada19c6db76a314d3d9171e4
        super.observers.add(observer);
    }

}
