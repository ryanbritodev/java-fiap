class Filme {

    protected String titulo;
    protected String diretor;
    protected double avaliacao;


    public Filme(String titulo, String diretor){
        this.titulo = titulo;
        this.diretor = diretor;
        this.avaliacao = 0.0;
    }

    protected void ExibirInfo(){
        System.out.println("Nome do Filme: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Avaliação: " + (avaliacao == 0.0 ? "Ainda não foi avaliado" : avaliacao + "/5" + "⭐"));
    }

    public void avaliarFilme(double nota){

        if (nota >= 0 && nota <= 5){
            avaliacao = nota;
            System.out.println("O filme " + titulo + " recebeu uma nota " + nota + " estrelas ⭐");
        } else {
            System.out.println("Ô meu amigo... A nota precisa ser entre 0 e 5 🤡");
        }

    }

}