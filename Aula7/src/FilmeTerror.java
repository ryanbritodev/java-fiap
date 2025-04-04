public class FilmeTerror extends Filme {

    private int anoLancamento;
    private String categoria;

    public FilmeTerror(String titulo, String diretor, int anoLancamento, String categoria){

        super(titulo, diretor);
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
        this.avaliacao = 0.0;

    }

    @Override
    protected void ExibirInfo(){

        super.ExibirInfo();
        System.out.println("O filme " + titulo + " foi lançado em " + anoLancamento + ", e é do tipo " + categoria + "😱");

    }

    public void fraseIconica(){
        System.out.println("Frase Icônica: Eu sei o que vocês fizeram no verão passado!");
    }

}
