/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.model.dao;

import com.biblioteca.connection.ConnectionMySQL;
import com.bibliotecaRenato.controller.ILocador;
import com.bibliotecaRenato.model.LocalModel;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class LocadorDao extends ConnectionMySQL implements ILocador {

    @Override
    public boolean salvarLocadorDAO(LocalModel pLocadorModel) {
       try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO tbl_locador (nome_locador, rua_locador, numero_locador, bairro_locador, cidade_locador, uf_locador, cep_locador, telefone_locador, email_locador) "
                    + "VALUES ("
                    + "'" + pLocadorModel.getNomeLocador() + "',"
                    + "'" + pLocadorModel.getLogradouroLocador() + "',"
                    + "'" + pLocadorModel.getNumeroLocador() + "',"
                    + "'" + pLocadorModel.getBairroLocador() + "',"
                    + "'" + pLocadorModel.getCidadeLocador() + "',"
                    + "'" + pLocadorModel.getEstadoLocador() + "',"
                    + "'" + pLocadorModel.getCepLocador() + "',"
                    + "'" + pLocadorModel.getTelefoneLocador() + "',"
                    + "'" + pLocadorModel.getEmailLocador() + "'"
                    + ");");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public LocalModel getLocadorDAO(int pIdLocador) {
        LocalModel locadorModel = new LocalModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locador WHERE pk_id_locador = '" + pIdLocador + "';");

            while (this.getResultset().next()) {
                locadorModel.setIdLocador(this.getResultset().getInt(1));
                locadorModel.setNomeLocador(this.getResultset().getString(2));
                locadorModel.setLogradouroLocador(this.getResultset().getString(3));
                locadorModel.setNumeroLocador(this.getResultset().getString(4));
                locadorModel.setBairroLocador(this.getResultset().getString(5));
                locadorModel.setCidadeLocador(this.getResultset().getString(6));
                locadorModel.setEstadoLocador(this.getResultset().getString(7));
                locadorModel.setCepLocador(this.getResultset().getString(8));
                locadorModel.setTelefoneLocador(this.getResultset().getString(9));
                locadorModel.setEmailLocador(this.getResultset().getString(10));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return locadorModel;
    }
    

    @Override
    public LocalModel getLocadorDAO(String pLocadorModel) {
      LocalModel locadorModel = new LocalModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locador WHERE nome_locador = '" + pLocadorModel + "'" + ";");

            while(this.getResultset().next()) {
                locadorModel.setIdLocador(this.getResultset().getInt(1));
                locadorModel.setNomeLocador(this.getResultset().getString(2));
                locadorModel.setLogradouroLocador(this.getResultset().getString(3));
                locadorModel.setNumeroLocador(this.getResultset().getString(4));
                locadorModel.setBairroLocador(this.getResultset().getString(5));
                locadorModel.setCidadeLocador(this.getResultset().getString(6));
                locadorModel.setEstadoLocador(this.getResultset().getString(7));
                locadorModel.setCepLocador(this.getResultset().getString(8));
                locadorModel.setTelefoneLocador(this.getResultset().getString(9));
                locadorModel.setEmailLocador(this.getResultset().getString(10));
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return locadorModel;  
    }

    @Override
    public ArrayList<LocalModel> getListaLocadorDAO() {
      ArrayList<LocalModel> listaLocadorModel = new ArrayList<>();
        LocalModel locadorModel = new LocalModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_locador;");

            while(this.getResultset().next()) {
                locadorModel = new LocalModel();
                locadorModel.setIdLocador(this.getResultset().getInt(1));
                locadorModel.setNomeLocador(this.getResultset().getString(2));
                locadorModel.setLogradouroLocador(this.getResultset().getString(3));
                locadorModel.setNumeroLocador(this.getResultset().getString(4));
                locadorModel.setBairroLocador(this.getResultset().getString(5));
                locadorModel.setCidadeLocador(this.getResultset().getString(6));
                locadorModel.setEstadoLocador(this.getResultset().getString(7));
                locadorModel.setCepLocador(this.getResultset().getString(8));
                locadorModel.setTelefoneLocador(this.getResultset().getString(9));
                locadorModel.setEmailLocador(this.getResultset().getString(10));
                listaLocadorModel.add(locadorModel);
            }
        } catch (SQLException e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.fecharConexao();
        }
        return listaLocadorModel;
    
    }

    @Override
    public boolean atualizarLocadorDAO(LocalModel pLocadorModel) {
       try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE tbl_locador SET "
                    + "pk_id_locador = '" + pLocadorModel.getIdLocador() + "',"
                    + "nome_locador = '" + pLocadorModel.getNomeLocador() + "',"
                    + "rua_locador = '" + pLocadorModel.getLogradouroLocador() + "',"
                    + "numero_locador = '" + pLocadorModel.getNumeroLocador() + "',"
                    + "bairro_locador = '" + pLocadorModel.getBairroLocador() + "',"
                    + "cidade_locador = '" + pLocadorModel.getCidadeLocador() + "',"
                    + "uf_locador = '" + pLocadorModel.getEstadoLocador() + "',"
                    + "cep_locador = '" + pLocadorModel.getCepLocador() + "',"
                    + "telefone_locador = '" + pLocadorModel.getTelefoneLocador() + "',"
                    + "email_locador ='" + pLocadorModel.getEmailLocador() + "'"
                    + " WHERE " + "pk_id_locador = '" + pLocadorModel.getIdLocador() + "'" + ";");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    @Override
    public boolean excluirLocadorModelDAO(int idLocadorModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM tbl_locador WHERE pk_id_locador = '" + idLocadorModel + "'" + ";");
        } catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!",
                    "Atenção", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    
}
