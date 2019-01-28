package com.sistema.apirest.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImportaCsv {
	
	
	String arquivo = "C:\\Java\2018-1_CA.csv";
	
	
	public static List<String> lerArquivo(File arquivo) {
        List<String> linhas = new ArrayList<>();
        try {
            FileReader leitura = new FileReader(arquivo);
            BufferedReader ler = new BufferedReader(leitura);
            while (ler.ready()) {
                linhas.add(ler.readLine());
            }
            ler.close();
            leitura.close();
            return linhas;
        } catch (IOException ex1) {
            System.out.println("Erro lendo arquivo. " + ex1.getLocalizedMessage());
        }
        return null;
    }
	
	
	public void salvar(List<String> linhas) throws SQLException {
        String sql = "insert into tb_historico(id, bandeira, compra, dtcoleta,estado,medida,"
        		+ "municipio,produto,regiao,revenda,venda) "
        		+ "values (?,?,?,?,?,?,?,?,?,?,?)";  
        Connection conn = DriverManager.getConnection("jdbc:h2:~/db-h2/testdb,sa,");
        conn.setAutoCommit(false);
        PreparedStatement psmt = conn.prepareStatement(sql);
        int contador = 0;
        for (String linha : linhas) {
            String[] colunas = linha.split("\t");
            psmt.setString(1, colunas[0]);
            psmt.setString(2, colunas[1]);
            psmt.setString(3, colunas[2]);
            psmt.setString(4, colunas[3]);
            psmt.setString(5, colunas[4]);
            psmt.setString(6, colunas[5]);
            psmt.setString(7, colunas[6]);
            psmt.setString(8, colunas[7]);
            psmt.setString(9, colunas[8]);
            psmt.setString(10, colunas[9]);
            psmt.setString(11, colunas[10]);
            psmt.addBatch();
            contador++;
            if(contador == 1000) {
                psmt.executeBatch();
                conn.commit();                
                contador = 0;
            }
        }
        psmt.executeBatch();
        conn.commit();
        conn.close();
 
	}
}
