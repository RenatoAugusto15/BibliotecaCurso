/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecaRenato.controller;

import com.bibliotecaRenato.model.EmprestimoModel;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface IEmprestimo {
    public boolean salvarEmprestimoDAO(EmprestimoModel pEmprestimoModel);
    public boolean salvarEmprestimoDAO(ArrayList<EmprestimoModel> plistaModelEmprestimos);
    public EmprestimoModel getEmprestimoDAO(int pIdEmprestimo);
    public ArrayList<EmprestimoModel> getListaEmprestimoDAO();
    public boolean atualizarEmprestimoDAO(EmprestimoModel pEmprestimoModel);
    public boolean excluirEmprestimoDAO(int pIdEmprestimoModel);
    public EmprestimoModel getQuantidadeEmprestimo();
 
}
