public class TestaFilme {
    public static void main(String[] args) {

        FilmeTerror panico = new FilmeTerror("Pânico 😱", "Wes Craven", 1996, "Thriller");
        FilmeComedia genteGrande = new FilmeComedia("Gente Grande 👨🏻", "Dennis Dugan", "Besteirol", true);

        System.out.println("🎬 Filmes ANTES da avaliação:");
        panico.ExibirInfo();
        genteGrande.ExibirInfo();

        System.out.println("\n😎 Avaliando os Filmes:");
        panico.avaliarFilme(4.5);
        genteGrande.avaliarFilme(5.0);

        System.out.println("\n 😄 Após avaliação:");
        panico.ExibirInfo();
        panico.fraseIconica();

        System.out.println("==================");

        genteGrande.ExibirInfo();
        genteGrande.contarPiada();

    }
}
