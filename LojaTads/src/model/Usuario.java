package model;

//@author Camila

import javax.swing.JOptionPane;

public class Usuario {
    
    public int id;
    public String nome;
    public String email;
    public String senha;
    
    public void cadastrarUsuario(int i, String n, String e, String s){
    id = i;
    nome = n;
    email = e;
    senha = s;
}
    
    public int num1;
    public int num2;
    
    public int somar(){
        return num1 + num2;
    }
    
    public int subtrair(){
        return num1 - num2; 
    }
    
    public int multiplicacao(){
        return num1 * num2;
    }
    
    public int divisao(){
        try{
        return num1 / num2;
        }catch(ArithmeticException erro){
            
            JOptionPane.showMessageDialog(null, "Nao existe divisao por zero " + erro, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return num1/num2;
    }
    
    public int fatorial(int num1){
        if(num1 == 0){
            return 1;
        } else {
            return  num1 * fatorial(num1-1);
        } 
    }
    
}



