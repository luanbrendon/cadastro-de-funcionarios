package Model;

public abstract class Pessoa {

    // Atributos
    private int id;
    private String nome;
    private String datadenascimento;

    // M�todo Construtor de Objeto Vazio
    public Pessoa() {
    }

    // M�todo Construtor de Objeto, inserindo dados
    public Pessoa(int id, String nome, String datadenascimento ) {
        this.id = id;
        this.nome = nome;
        this.datadenascimento = datadenascimento;
    }

    // M�todos GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

}