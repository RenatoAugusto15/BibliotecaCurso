/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.service;
import com.bibliotecaRenato.model.EmprestimoModel;
import com.biblioteca.model.dao.EmprestimoDao;
import java.util.ArrayList;

/**
 *
 * @author José Luiz
 */
public class EmprestimoService {

    EmprestimoDao emprestimoDao = new EmprestimoDao();

    public boolean salvarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        return emprestimoDao.salvarEmprestimoDAO(pEmprestimoModel);
    }

    public EmprestimoModel getEmprestimoDAO(int pIdEmprestimo) {
        return emprestimoDao.getEmprestimoDAO(pIdEmprestimo);
    }

    public ArrayList<EmprestimoModel> getListaEmprestimoDAO() {
        return emprestimoDao.getListaEmprestimoDAO();
    }

    public boolean atualizarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        return emprestimoDao.atualizarEmprestimoDAO(pEmprestimoModel);
    }

    public boolean excluirEmprestimoDAO(int pIdEmprestimoModel) {
        return emprestimoDao.excluirEmprestimoDAO(pIdEmprestimoModel);
    }

    public EmprestimoModel getQuantidadeEmprestimo() {
        return emprestimoDao.getQuantidadeEmprestimo();
    }

    public boolean salvarEmprestimosDAO(ArrayList<EmprestimoModel> plistaModelEmprestimos) {
        return emprestimoDao.salvarEmprestimoDAO(plistaModelEmprestimos);
    }

    /**
     * retorna uma lista de emprestimo com JOIN
     *
     * @return
     */
    public ArrayList<EmprestimoModel> getListaEmprestimoListaDAO() {
        return emprestimoDao.getListaEmprestimoDAO();
        
    }
    
    
}
