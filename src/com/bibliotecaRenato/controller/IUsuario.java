/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecaRenato.controller;

import com.bibliotecaRenato.model.UsuarioModel;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface IUsuario {
    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel); // O primeiro método será para cadastrar um usuário
    public UsuarioModel  getUsuarioDAO(int pIdUsuario);//buscar usuário pela Id
    public UsuarioModel getUsuarioDAO(String pLogin);//Buscar pelo nome
    
    public ArrayList<UsuarioModel> getListaUsuarioDAO();
    public boolean atualziarUsuarioDAO(UsuarioModel pUsuarioModel);
    public boolean excluirUsuarioDAO(int pIdUsuario);
    //metódos criados para facilitar a geralçao futura
    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel);
    public int getQuantidadeUsuariosCadastrados();
    
    
    
    
}
