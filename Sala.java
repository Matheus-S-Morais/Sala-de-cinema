public class Sala {

    private Long id;
    private int capacidade;

    public Sala() {
    }

    public Sala(Long id, int capacidade) {
        this.id = id;
        this.capacidade = capacidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}