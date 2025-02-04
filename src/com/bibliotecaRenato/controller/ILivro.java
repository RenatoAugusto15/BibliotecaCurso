/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bibliotecaRenato.controller;

import com.bibliotecaRenato.model.LivroModel;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface ILivro {
    public boolean salvarOLivroDAO(LivroModel pLivroModel);
    public LivroModel getLivroDAO(int pIdLivro);
    public LivroModel getLivroDAO(String pLivroModel);
    public ArrayList<LivroModel> getListaLivroDAO();
    public boolean atualizarLivroDAO(LivroModel pLivroModel);
    public boolean excluirLivroDAO(int idLivroModel);
    public boolean alterarEstoqueLivrosDAO(ArrayList<LivroModel> pListaLivroModel);
    public LivroModel getQuantidadeLivrosCadastrados();
    
    
    
}
