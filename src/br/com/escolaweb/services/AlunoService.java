package br.com.escolaweb.services;

import br.com.escolaweb.model.Aluno;

public class AlunoService extends DAO {
    
    public void add(Aluno aluno) {
        String sql1 = "INSERT INTO pessoa (_id, nome, email, data_nassc, senha) values(?, ?, ?, ?, ?)";
        String sql2 = "INSERT INTO aluno (matricula) values(?)";
        Conectar();
        
    }
}
