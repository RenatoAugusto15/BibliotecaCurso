/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecaRenato.model;

import java.util.List;

/**
 *
 * @author Aluno
 */
public class EmprestimoLocatarioModel {
      private int idLocatario;
    private List<EmprestimoModel> emprestimos;  // Lista de empréstimos realizados pelo locatário

    public int getIdLocatario() {
        return idLocatario;
    }

    public void setIdLocatario(int idLocatario) {
        this.idLocatario = idLocatario;
    }

    public List<EmprestimoModel> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<EmprestimoModel> emprestimos) {
        this.emprestimos = emprestimos;
    }
    

}
