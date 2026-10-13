public class Devoir {
    private String nom;
    private String description;
    private String dateLimite;

    public Devoir(String nom, String description, String dateLimite) {
        this.nom = nom;
        this.description = description;
        this.dateLimite = dateLimite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(String dateLimite) {
        this.dateLimite = dateLimite;
    }
    public static void main(String[] args) {
        Devoir devoir = new Devoir("Maths", "Exercices sur les équations", "2023-10-15");
        System.out.println("Nom du devoir: " + devoir.getNom());
        System.out.println("Description: " + devoir.getDescription());
        System.out.println("Date limite: " + devoir.getDateLimite());
    }
}
