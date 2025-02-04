/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.bibliotecaRenato.controller.ILocatario;
import com.bibliotecaRenato.model.LocatarioModel;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class LocatarioDao extends ConnectionMySQL implements ILocatario {

    @Override
    public boolean salvarLocatarioDAO(LocatarioModel pLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocatarioModel getLocatarioDAO(int pIdLocatario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocatarioModel getLocatarioDAO(String pLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<LocatarioModel> getListaLocatarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizarLocatarioDAO(LocatarioModel pLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirLocatarioDAO(int idLocatarioModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
