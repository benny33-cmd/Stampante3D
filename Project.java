public class Project {

    private String nome;
    private String descrizione;
    private String immagine;

    public Project(String nome, String descrizione, String immagine) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
    }

    public String getNome() { return nome; }
    public String getDescrizione() { return descrizione; }
    public String getImmagine() { return immagine; }
}
