/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ConnectionMySQL {
    
    private Connection con = null;
    private Statement statement;
    private ResultSet resultset;
    
    private boolean Status = false;
    private String servidor = "127.0.0.1:3306"; //Ou localhost
    private String banco =  "livraria_renato";
    
    private String usuario ="cci";
    private String senha = "@3325cci3333";
    /*@return getCon()
    *retorna a conexão com sucesso ou não
    */
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://"  + servidor + "/" + banco +"?autoReconnect=true&userSSL=false";
            this.setCon(DriverManager.getConnection(url, usuario, senha));
            this.Status = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao conectar ao banco de dados" +
                    "erro" + JOptionPane.ERROR_MESSAGE);    
        }
        return this.getCon();
    }
    public boolean executarSQL(String pSql){
        try {
            this.setStatement(getCon().createStatement());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Conectar ao banco de dados",
                    "erro",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return  true;
    }
    
    public boolean executarInsertUpdateSQL(String pSql) { /*criar o método que servirá para atualizar e deletar algum registro*/
        try {
            this.setStatement(getCon().createStatement());
            getStatement().executeUpdate(pSql);
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Erro ao Conectar ao banco de dados",
                    "erro",JOptionPane.ERROR_MESSAGE);
            return false;
        }
            return true;
    }
    
    public boolean fecharConexao(){
        try {
            if(this.getResultset() != null && (this.statement != null)){
                this.getResultset().close();
                this.statement.close(); 
            }
            this.getCon().close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao Conectar ao banco de dados",
                    "erro",JOptionPane.ERROR_MESSAGE);
            return false;
        }
            return true;   
    }
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    
}
