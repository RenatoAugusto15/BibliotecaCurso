/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.bibliotecaRenato.controller.IUsuario;
import java.sql.SQLException;
import com.bibliotecaRenato.model.UsuarioModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class UsuarioDao extends ConnectionMySQL implements IUsuario {
       
    
    @Override
    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel) {
       try{
          this.conectar();
          return this.executarInsertUpdateSQL("INSERT INTO tbl_usuario " + "(nome_usuario, senha_usuario, login_usuario, nivel_usuario)"+"VALUES('"+pUsuarioModel.getNomeUsuario()+"','"+pUsuarioModel.getLoginUsuario()+"','"+pUsuarioModel.getNivelAcessoUsuario()+"')");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"erro ao salvar o úsuario");
           return false;
       }
       finally {
           this.fecharConexao();
       }
    }

    @Override
    public UsuarioModel getUsuarioDAO(int pIdUsuario) {
        UsuarioModel usuarioModel = new UsuarioModel();
        try{
           this.conectar(); 
           this.executarSQL("SELECT * FROM tbl_usuario WHERE pk_id_usuario = '"+ pIdUsuario + "';");
           while(this.getResultset().next()){
               usuarioModel.setIdUsuario(this.getResultset().getInt(1));
               usuarioModel.setNomeUsuario(this.getResultset().getString(2));
               usuarioModel.setSenhaUsuario(this.getResultset().getString(3));
               usuarioModel.setLoginUsuario(this.getResultset().getString(4));
               usuarioModel.setNivelAcessoUsuario(this.getResultset().getString(5)); 
           }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"erro ao buscar úsuario");
           
        }
        finally {
            this.fecharConexao();
            return usuarioModel;
        }
    }

    @Override
    public UsuarioModel getUsuarioDAO(String pLogin) {
        UsuarioModel usuarioModel = new UsuarioModel();
        try{
           this.conectar();
           this.executarSQL("SELECT * FROM tbl_usuario WHERE login_usuario-'"+ pLogin + "';");
            while(this.getResultset().next()){
               usuarioModel.setIdUsuario(this.getResultset().getInt(1));
               usuarioModel.setNomeUsuario(this.getResultset().getString(2));
               usuarioModel.setSenhaUsuario(this.getResultset().getString(3));
               usuarioModel.setLoginUsuario(this.getResultset().getString(4));
               usuarioModel.setNivelAcessoUsuario(this.getResultset().getString(5)); 
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"erro ao buscar úsuario");
        }
        finally{
            this.fecharConexao();
            return usuarioModel;
        }
    }

    @Override
    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        ArrayList<UsuarioModel> listaUsuarioModel = new ArrayList<>();
        UsuarioModel usuarioModel = new UsuarioModel();
        
        try{
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_usuario;");
            while(this.getResultset().next()) {
               usuarioModel = new UsuarioModel();
               usuarioModel.setIdUsuario(this.getResultset().getInt(1));
               usuarioModel.setNomeUsuario(this.getResultset().getString(2));
               usuarioModel.setSenhaUsuario(this.getResultset().getString(3));
               usuarioModel.setLoginUsuario(this.getResultset().getString(4));
               usuarioModel.setNivelAcessoUsuario(this.getResultset().getString(5));
               listaUsuarioModel.add(usuarioModel);
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"erro ao buscar úsuario");
        }
        finally {
           this.fecharConexao(); 
        }
        return listaUsuarioModel;
    }

    @Override
    public boolean atualziarUsuarioDAO(UsuarioModel pUsuarioModel) {
        
        try{
            
            return this.executarInsertUpdateSQL("UPDATE tbl_usuario SET pk_id_usuario = '"
            +pUsuarioModel.getIdUsuario() + "'," + "nome_usuario = '" + pUsuarioModel.getNomeUsuario() + "',"
            +"login_usuario = '" + pUsuarioModel.getLoginUsuario() +"'," + "senha_usuario ='"
            +pUsuarioModel.getSenhaUsuario()+ "," + "nível_usuario = '"
            +pUsuarioModel.getNivelAcessoUsuario() + "'"
            +"where pk_id_usuario = '" + pUsuarioModel.getIdUsuario() + "'" + ";" );
        }
        
        catch(Exception e) {
             JOptionPane.showMessageDialog(null,"erro ao buscar úsuario");
             return false;
        }
        
        finally{
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try{
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_usuario WHERE pk_id_usuario = '"
            + pIdUsuario + "'" + ";");
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"erro ao buscar úsuario");
            return false;
        }
        finally{
           this.fecharConexao();
        }
    }
    
    @Override
    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel) {
        
        try{
            this.conectar();
             this.executarSQL("SELECT * FROM tbl_usuario WHERE"
            + "login_usuario = '" + pUsuarioModel.getLoginUsuario()
            +"' AND senha_usuario = '" + pUsuarioModel.getSenhaUsuario() +"'" + ";");
            
            if(this.getResultset().next()){
                return true;
            } else {
                return false;
            }
                    
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"erro ao executar validação do úsuario");
            return false;
        }
        finally {
            this.fecharConexao();
        }
    } 

    @Override
    public int getQuantidadeUsuariosCadastrados() {
        int valor = 0;
        try{
          this.conectar();
          this.executarSQL("SELECT COUNT(*) FROM tbl_usuario;");
          while(this.getResultset().next()){
            valor = this.getResultset().getInt(1);
          
        }
           }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao contar usuários: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
           this.fecharConexao(); 
        }
        return valor;
    }
    
}
