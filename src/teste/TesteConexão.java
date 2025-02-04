/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

//import com.biblioteca.connection.ConnectionMySQL;
import com.biblioteca.view.FrmLogin;
//import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TesteConexão {
    
    public static void main(String[] args) {
        // Aqui vai o código que você deseja executar ao rodar o programa
       // ConnectionMySQL connectionMySQL = new ConnectionMySQL();
       // connectionMySQL.conectar();
        
        //if(connectionMySQL.isStatus()){
           //JOptionPane.showMessageDialog(null,"CONEXÃO EFETUADA COM SUCESSO!",
                   //"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        //}
        new FrmLogin().setVisible(true);
    }
}

