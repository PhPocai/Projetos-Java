import java.util.ArrayList;
import java.util.Objects;

public class clientes {
    private int id;
    private String nome;
    private String telefone;
    private int idade;

    public clientes(){

    }
    public clientes(int id, String nome, String telefone, int idade) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "clientes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        clientes outro = (clientes) obj;
        return this.id == outro.id;
    }


}
