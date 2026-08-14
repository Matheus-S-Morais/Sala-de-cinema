import java.time.LocalDateTime;

public class Sessao {

    private Long id;
    private Filme filme;
    private Sala sala;
    private LocalDateTime horario;

    public Sessao() {
    }

    public Sessao(Long id, Filme filme, Sala sala, LocalDateTime horario) {
        this.id = id;
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
}