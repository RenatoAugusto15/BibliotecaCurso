/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecaRenato.model;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class EmprestimoModel {
    private int idEmprestimo;
    private int idLocatario;
    private int idLocator;
    private int idLivro;
    private String dataEmprestimo;
    private String dataDevolucao;
    private int quantidadeEmprestimo;
    private String statusEmprestimo; 
    private LocatarioModel locatarioModel;
    private LocalModel locadorModel;
    private LivroModel livroModel;
    private ArrayList<EmprestimoModel> listaEmprestimoModel;
    private int idEmprestimoLivro;

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdLocatario() {
        return idLocatario;
    }

    public void setIdLocatario(int idLocatario) {
        this.idLocatario = idLocatario;
    }

    public int getIdLocator() {
        return idLocator;
    }

    public void setIdLocator(int idLocator) {
        this.idLocator = idLocator;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getQuantidadeEmprestimo() {
        return quantidadeEmprestimo;
    }

    public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
        this.quantidadeEmprestimo = quantidadeEmprestimo;
    }

    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    public LocatarioModel getLocatarioModel() {
        return locatarioModel;
    }

    public void setLocatarioModel(LocatarioModel locatarioModel) {
        this.locatarioModel = locatarioModel;
    }

    public LocalModel getLocadorModel() {
        return locadorModel;
    }

    public void setLocadorModel(LocalModel locadorModel) {
        this.locadorModel = locadorModel;
    }

    public LivroModel getLivroModel() {
        return livroModel;
    }

    public void setLivroModel(LivroModel livroModel) {
        this.livroModel = livroModel;
    }

    public ArrayList<EmprestimoModel> getListaEmprestimoModel() {
        return listaEmprestimoModel;
    }

    public void setListaEmprestimoModel(ArrayList<EmprestimoModel> listaEmprestimoModel) {
        this.listaEmprestimoModel = listaEmprestimoModel;
    }

    public int getIdEmprestimoLivro() {
        return idEmprestimoLivro;
    }

    public void setIdEmprestimoLivro(int idEmprestimoLivro) {
        this.idEmprestimoLivro = idEmprestimoLivro;
    }
    
    
    
}
