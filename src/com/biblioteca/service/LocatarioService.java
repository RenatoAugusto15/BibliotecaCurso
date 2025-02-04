/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.service;
import com.bibliotecaRenato.model.LocatarioModel;
import com.biblioteca.model.dao.LocatarioDao;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class LocatarioService {
     LocatarioDao locatarioDao = new LocatarioDao();

    public boolean salvarLocatarioDAO(LocatarioModel pLocatarioModel) {
        return locatarioDao.salvarLocatarioDAO(pLocatarioModel);
    }

    public LocatarioModel getLocatarioDAO(int pIdLocatario) {
        return locatarioDao.getLocatarioDAO(pIdLocatario);
    }

    public LocatarioModel getLocatarioDAO(String pLocatarioModel) {
        return locatarioDao.getLocatarioDAO(pLocatarioModel);
    }

    public ArrayList<LocatarioModel> getListaLocatarioDAO() {
        return locatarioDao.getListaLocatarioDAO();
    }

    public boolean atualizarLocatarioDAO(LocatarioModel pLocatarioModel) {
        return locatarioDao.atualizarLocatarioDAO(pLocatarioModel);
    }

    public boolean excluirLocatarioDAO(int idLocatarioModel) {
        return locatarioDao.excluirLocatarioDAO(idLocatarioModel);
    }
}
