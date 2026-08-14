import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String nome;
    private List<Sala> salas;
    private List<Filme> filmes;

    public Cinema() {
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public Cinema(String nome, List<Sala> salas, List<Filme> filmes) {
        this.nome = nome;
        this.salas = salas;
        this.filmes = filmes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}