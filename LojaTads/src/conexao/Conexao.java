
package conexao;
import java.sql.*;
import javax.swing.JOptionPane;
/* @author camila*/
        
public class Conexao {
  Connection conexao;
    public Connection getConexao(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");//org,postgresql.Driver
        conexao=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_loja","root","");
        JOptionPane.showMessageDialog(null,"Coneão realizada com sucesso!!!");
    }
        catch(ClassNotFoundException drive){
           
    JOptionPane.showMessageDialog(null,"Driver não encontrado"+drive);
    
}catch(SQLException fonte){
    
    JOptionPane.showMessageDialog(null,"fonte do BD não encontrado:"+fonte);
}
        return conexao;
}
}