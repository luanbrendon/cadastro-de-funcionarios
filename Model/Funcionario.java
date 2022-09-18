
package Model;

import DAO.FuncionarioDAO;
import java.util.*;

public class Funcionario extends Pessoa{
    
    private String cpf;
    private String telefone;
    private String senha;
    private String codigo;
    private String rg;
    private String endereco;

    public Funcionario() {
    }

    public Funcionario(String cpf, String telefone, String senha, String codigo, String rg, String endereco) {
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
        this.codigo = codigo;
        this.rg = rg;
        this.endereco = endereco;
    }
    
    public Funcionario(String cpf, String telefone, String senha, int id, String nome, String datadenascimento, String codigo, String rg, String endereco) {
        super(id, nome, datadenascimento);
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
        this.codigo = codigo;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n CPF: " +this.getCpf()
                + "\n Telefone: " + this.getTelefone()
                + "\n Senha: " + this.getSenha()
                + "\n Data de nascimento: " + this.getDatadenascimento()
                + "\n Codigo: " + this.getCodigo()
                + "\n RG: " + this.getRg()
                + "\n Endereco: " + this.getEndereco()
                + "\n -----------";
        
    }
    
    public ArrayList getMinhaLista() {
        return FuncionarioDAO.MinhaLista;
    }
    
    public boolean InsertFuncionarioBD(String cpf, String telefone, String senha, String nome, String datadenascimento, String codigo, String rg, String endereco) {
        int id = this.maiorID() + 1;
        Funcionario objeto = new Funcionario(cpf, telefone, senha, id, nome, datadenascimento, codigo, rg, endereco);
        FuncionarioDAO.MinhaLista.add(objeto);
        return true;

    }
    
    
    public int maiorID(){
        return FuncionarioDAO.maiorID();
    }  
    
    public boolean DeleteFuncionarioBD(int id) {
        int indice = this.procuraIndice(id);
        FuncionarioDAO.MinhaLista.remove(indice);
        return true;
    }

    public boolean UpdateFuncionarioBD(String cpf, String telefone, String senha, int id, String nome, String datadenascimento, String codigo, String rg, String endereco) {
        Funcionario objeto = new Funcionario(cpf, telefone, senha, id, nome, datadenascimento, codigo, rg, endereco);
        int indice = this.procuraIndice(id);
        FuncionarioDAO.MinhaLista.set(indice, objeto);
        return true;
    }

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FuncionarioDAO.MinhaLista.size(); i++) {
            if (FuncionarioDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

    public Funcionario carregaFuncionario(int id) {
        int indice = this.procuraIndice(id);
        return FuncionarioDAO.MinhaLista.get(indice);
    }
    
}
