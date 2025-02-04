/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecaRenato.controller;

import com.bibliotecaRenato.model.LocatarioModel;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface ILocatario {
    public boolean salvarLocatarioDAO(LocatarioModel pLocatarioModel);
    public LocatarioModel getLocatarioDAO( int pIdLocatario);
    public LocatarioModel getLocatarioDAO(String pLocatarioModel);
    public ArrayList<LocatarioModel> getListaLocatarioDAO();
    public boolean atualizarLocatarioDAO(LocatarioModel pLocatarioModel);
    public boolean excluirLocatarioDAO(int idLocatarioModel);
}
