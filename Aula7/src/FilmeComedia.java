public class FilmeComedia extends Filme {
    private String tipoHumor;
    private boolean engracado;

    public FilmeComedia(String titulo, String diretor, String tipoHumor, boolean engracado){
        super(titulo, diretor);
        this.tipoHumor = tipoHumor;
        this.engracado = engracado;
    }

    @Override
    protected void ExibirInfo(){

        super.ExibirInfo();
        if (engracado) {
            System.out.println("O filme " + titulo + " é engraçado 😁");
        } else {
            System.out.println("O filme " + titulo + " não é engraçado 😢");
        }
        System.out.println("Tipo do Humor: " + tipoHumor);

    }

    public void contarPiada(){
        System.out.println("Piada do Filme: " + titulo + ": Por que o Tomate foi ao banco? 🍅 Para tirar o extrato 🤣");
    }

}
