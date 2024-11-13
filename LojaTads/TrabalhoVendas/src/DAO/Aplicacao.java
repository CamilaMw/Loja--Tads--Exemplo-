package DAO;

public class Aplicacao {
    public static void main(String[] args) {
        try {
            // Aqui nós instanciamos a classe Conexao
            Conexao conexao = new Conexao();
            System.out.println("Conexão com o banco de dados estabelecida com sucesso.");

            // Aqui você pode adicionar mais lógica, como consultas ao banco de dados, etc.

            // Não esqueça de confirmar a transação se for necessário
            conexao.confirmar();

        } catch (Exception e) {
            // Qualquer exceção capturada aqui indica que a conexão não foi bem-sucedida
            System.err.println("Falha ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}