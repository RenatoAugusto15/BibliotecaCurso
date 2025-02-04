/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecaRenato.controller;

import com.bibliotecaRenato.model.LocalModel;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface ILocador {
    public boolean salvarLocadorDAO(LocalModel pLocadorModel);
    public LocalModel getLocadorDAO(int pIdLocador);
    public LocalModel getLocadorDAO(String pLocadorModel);
    public ArrayList<LocalModel> getListaLocadorDAO();
    public boolean atualziarLocadorDAO(LocalModel pLocadorModel);
    public boolean excluirLocadorModelDAO(int idLocadorModel);
}
