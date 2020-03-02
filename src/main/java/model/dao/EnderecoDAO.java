package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.entity.exercicio01.Endereco;

public class EnderecoDAO {

		public Endereco salvar(Endereco novaEntidade) {
			// Conectar no banco
			Connection conexao = Banco.getConnection();
			
			String sql = " INSERT INTO ENDERECO ( CEP, ESTADO, CIDADE, RUA, BAIRRO, NUMERO)"
					+ " VALUES( " + novaEntidade.getCep() + ", " + novaEntidade.getEstado() + ", "
					+ novaEntidade.getCidade() + ", " + novaEntidade.getRua() + ", "
					+ novaEntidade.getBairro() + ", " + novaEntidade.getNumero()
					+ ") ";
			//Obter um statement
			PreparedStatement statement = Banco.getPreparedStatement(conexao, sql);
			
			try {
				
				//Fazer o INSERT
				statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
				ResultSet resultado = statement.getGeneratedKeys();
				
				//Executar
				if(resultado.next()) {
					//Incluir a chave gerada na novaEntidade (coluna de posição 1)
					novaEntidade.setId(resultado.getInt(1));
				}
			} catch (SQLException e) {
				System.out.println("Erro ao salvar novo endereço. Causa " + e.getMessage());
				
			}
			
			
			
			
		}
}
