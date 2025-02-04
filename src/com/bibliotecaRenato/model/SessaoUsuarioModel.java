/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecaRenato.model;

import javax.swing.JMenuItem;

/**
 *
 * @author Aluno
 */
public class SessaoUsuarioModel {
    public static int codigoUsuario;
    public static String nomeUsuario;
    public static String loginUsuario;
    public static String nivelAcesso;
    public static String instituicao="Cci";
    
    private JMenuItem jmiConsultaLocador;
    private JMenuItem jmiConsultaLocatario;
    private JMenuItem jmiEmprestimo;
    private JMenuItem jmiNovoLivro;
    private JMenuItem jmiNovoLocador;
    private JMenuItem jmiNovoLocatario;

    public static int getCodigoUsuario() {
        return codigoUsuario;
    }

    public static void setCodigoUsuario(int codigoUsuario) {
        SessaoUsuarioModel.codigoUsuario = codigoUsuario;
    }

    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public static void setNomeUsuario(String nomeUsuario) {
        SessaoUsuarioModel.nomeUsuario = nomeUsuario;
    }

    public static String getLoginUsuario() {
        return loginUsuario;
    }

    public static void setLoginUsuario(String loginUsuario) {
        SessaoUsuarioModel.loginUsuario = loginUsuario;
    }

    public static String getNivelAcesso() {
        return nivelAcesso;
    }

    public static void setNivelAcesso(String nivelAcesso) {
        SessaoUsuarioModel.nivelAcesso = nivelAcesso;
    }

    public static String getInstituicao() {
        return instituicao;
    }

    public static void setInstituicao(String instituicao) {
        SessaoUsuarioModel.instituicao = instituicao;
    }

    public JMenuItem getJmiConsultaLocador() {
        return jmiConsultaLocador;
    }

    public void setJmiConsultaLocador(JMenuItem jmiConsultaLocador) {
        this.jmiConsultaLocador = jmiConsultaLocador;
    }

    public JMenuItem getJmiConsultaLocatario() {
        return jmiConsultaLocatario;
    }

    public void setJmiConsultaLocatario(JMenuItem jmiConsultaLocatario) {
        this.jmiConsultaLocatario = jmiConsultaLocatario;
    }

    public JMenuItem getJmiEmprestimo() {
        return jmiEmprestimo;
    }

    public void setJmiEmprestimo(JMenuItem jmiEmprestimo) {
        this.jmiEmprestimo = jmiEmprestimo;
    }

    public JMenuItem getJmiNovoLivro() {
        return jmiNovoLivro;
    }

    public void setJmiNovoLivro(JMenuItem jmiNovoLivro) {
        this.jmiNovoLivro = jmiNovoLivro;
    }

    public JMenuItem getJmiNovoLocador() {
        return jmiNovoLocador;
    }

    public void setJmiNovoLocador(JMenuItem jmiNovoLocador) {
        this.jmiNovoLocador = jmiNovoLocador;
    }

    public JMenuItem getJmiNovoLocatario() {
        return jmiNovoLocatario;
    }

    public void setJmiNovoLocatario(JMenuItem jmiNovoLocatario) {
        this.jmiNovoLocatario = jmiNovoLocatario;
    }
}
