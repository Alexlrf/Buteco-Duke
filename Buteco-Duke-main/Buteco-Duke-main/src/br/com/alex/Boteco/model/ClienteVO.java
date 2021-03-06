
package br.com.alex.Boteco.model;

import java.time.LocalDate;
import java.util.Date;

public class ClienteVO {
    
    private int idCliente;
    private String nome;
    private String cpf;
    private String senha;
    private Date nascimento;
    private String sexo;
    private String celular;
    private String telefone;
    private String email;

    public ClienteVO(int idCliente, String nome, String cpf, String senha, Date nascimento, String sexo, String celular, String telefone, String email) {
        
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.senha= senha;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
    }

    public ClienteVO() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
            
}
