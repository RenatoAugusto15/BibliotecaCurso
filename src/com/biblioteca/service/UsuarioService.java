/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.service;

import com.biblioteca.model.dao.UsuarioDao;
import com.bibliotecaRenato.model.UsuarioModel;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class UsuarioService {
    UsuarioDao usuarioDao = new UsuarioDao();
    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel){
        return usuarioDao.salvarUsuarioDAO(pUsuarioModel);
    }
    //
    
    public UsuarioModel getUsuarioDAO(int pIdUsuario) {
       return usuarioDao.getUsuarioDAO(pIdUsuario); 
    }
    
    public UsuarioModel getUsuarioDAO(String pLogin){
        return usuarioDao.getUsuarioDAO(pLogin);
    }
    
    public ArrayList<UsuarioModel> getListaUsuarioDAO(){
        return usuarioDao.getListaUsuarioDAO();
    }
    
    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel){
        return usuarioDao.atualziarUsuarioDAO(pUsuarioModel);
    }
    public boolean excluirUsuarioDAO(int pIdUsuario){
        return usuarioDao.excluirUsuarioDAO(pIdUsuario);
    }
    
    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel){
        return usuarioDao.getValidarUsuarioDAO(pUsuarioModel);
    }
    
    public int getQuantidadeUsuariosCadastrados() {
       return usuarioDao.getQuantidadeUsuariosCadastrados();
    }
}
