public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o ScreenMatch");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        // Text blocks aspas duplas 3x e da pra pular linha
        String sinopse = """ 
                texto 1
                texto 2
                texto 3
                """ ;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}