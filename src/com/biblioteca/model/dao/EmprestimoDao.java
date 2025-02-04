/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.bibliotecaRenato.controller.IEmprestimo;
import com.bibliotecaRenato.model.EmprestimoModel;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class EmprestimoDao extends ConnectionMySQL implements IEmprestimo {

    @Override
    public boolean salvarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO tbl_emprestimo (fk_locador,fk_locatario,fk_livro,"
                    + "data_emprestimo,devolucao_emprestimo, quantidade,status_emprestimo" + ") VALUES (" + "'"
                    + pEmprestimoModel.getIdLocator() + "'," + "'" + pEmprestimoModel.getIdLocatario() + "'," + "'"
                    + pEmprestimoModel.getIdLivro() + "'," + "'" + pEmprestimoModel.getDataEmprestimo() + "'," + "'"
                    + pEmprestimoModel.getDataDevolucao() + "','"
                    + pEmprestimoModel.getQuantidadeEmprestimo() + "','"
                    + pEmprestimoModel.getStatusEmprestimo() + "');");
              //return true;
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean salvarEmprestimoDAO(ArrayList<EmprestimoModel> plistaModelEmprestimos) {
         try {
            this.conectar();
            int cont = plistaModelEmprestimos.size();
            for (int i = 0; i < cont; i++) {
                this.executarInsertUpdateSQL("INSERT INTO tbl_emprestimo (" + "fk_locador," + "fk_locatario," + "fk_livro,"
                        + "data_emprestimo," + "devolucao_emprestimo," + "quantidade," + "status_emprestimo" + ") VALUES (" + "'"
                        + plistaModelEmprestimos.get(i).getIdLocator() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getIdLocatario() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getIdLivro() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getDataEmprestimo() + "'," + "'"
                        + plistaModelEmprestimos.get(i).getDataDevolucao() + "'," + ""
                        + plistaModelEmprestimos.get(i).getQuantidadeEmprestimo() + "," + "'"
                        + plistaModelEmprestimos.get(i).getStatusEmprestimo() + "'" + ");");
            }
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public EmprestimoModel getEmprestimoDAO(int pIdEmprestimo) {
         EmprestimoModel emprestimoModel = new EmprestimoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_emprestimo WHERE pk_id_emprestimo = '" + pIdEmprestimo + "';");
            while(this.getResultset().next()) {
                emprestimoModel.setIdEmprestimo(this.getResultset().getInt(1));
                emprestimoModel.setIdLocator(this.getResultset().getInt(2));
                emprestimoModel.setIdLocatario(this.getResultset().getInt(3));
                emprestimoModel.setIdLivro(this.getResultset().getInt(4));
                emprestimoModel.setDataEmprestimo(this.getResultset().getString(5));
                emprestimoModel.setDataDevolucao(this.getResultset().getString(6));
                emprestimoModel.setQuantidadeEmprestimo(this.getResultset().getInt(7));
                emprestimoModel.setStatusEmprestimo(this.getResultset().getString(8));
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return emprestimoModel;
    }

    @Override
    public ArrayList<EmprestimoModel> getListaEmprestimoDAO() {
        ArrayList<EmprestimoModel> listaEmprestimoModel = new ArrayList<>();
        EmprestimoModel emprestimoModel = new EmprestimoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_emprestimo;");
            while (this.getResultset().next()) {
                emprestimoModel.setIdEmprestimo(this.getResultset().getInt(1));
                emprestimoModel.setIdLocator(this.getResultset().getInt(2));
                emprestimoModel.setIdLocatario(this.getResultset().getInt(3));
                emprestimoModel.setIdLivro(this.getResultset().getInt(4));
                emprestimoModel.setDataEmprestimo(this.getResultset().getString(5));
                emprestimoModel.setDataDevolucao(this.getResultset().getString(6));
                emprestimoModel.setStatusEmprestimo(this.getResultset().getString(7));
                listaEmprestimoModel.add(emprestimoModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaEmprestimoModel;
    }

    @Override
    public boolean atualizarEmprestimoDAO(EmprestimoModel pEmprestimoModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL(
                    "UPDATE tbl_emprestimo SET "
                    + "fk_locador ='" + pEmprestimoModel.getIdLocator()
                    + "'," + "fk_locatario = '" + pEmprestimoModel.getIdLocatario() + "',"
                    + "fk_livro ='" + pEmprestimoModel.getIdLivro() + "',"
                    + "data_emprestimo = '" + pEmprestimoModel.getDataEmprestimo() + "',"
                    + "devolucao_emprestimo = '" + pEmprestimoModel.getDataDevolucao() + "',"
                    + "status_emprestimo = '" + pEmprestimoModel.getStatusEmprestimo() + "'" + " WHERE "
                    + "pk_id_emprestimo = '" + pEmprestimoModel.getIdEmprestimo() + "'" + ";");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirEmprestimoDAO(int pIdEmprestimoModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_emprestimo  WHERE pk_id_emprestimo = '" + pIdEmprestimoModel + "'" + ";");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public EmprestimoModel getQuantidadeEmprestimo() {
         EmprestimoModel emprestimoModel = new EmprestimoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT COUNT(*) FROM tbl_emprestimo;");
            while(this.getResultset().next()) {
                emprestimoModel.setQuantidadeEmprestimo(this.getResultset().getInt(1));
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return emprestimoModel;
    }
    
}

