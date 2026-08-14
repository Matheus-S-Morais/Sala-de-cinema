public class Ingresso {

    private Long id;
    private TipoIngresso tipo;
    private Cliente cliente;
    private Sessao sessao;
    private Funcionario funcionario;

    public Ingresso() {
    }

    public Ingresso(Long id, TipoIngresso tipo, Cliente cliente, Sessao sessao, Funcionario funcionario) {
        this.id = id;
        this.tipo = tipo;
        this.cliente = cliente;
        this.sessao = sessao;
        this.funcionario = funcionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}