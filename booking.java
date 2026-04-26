public class Booking {

    private String progetto;
    private String orario;
    private String nome;

    public Booking(String progetto, String orario, String nome) {
        this.progetto = progetto;
        this.orario = orario;
        this.nome = nome;
    }

    public String getProgetto() { return progetto; }
    public String getOrario() { return orario; }
    public String getNome() { return nome; }
}
