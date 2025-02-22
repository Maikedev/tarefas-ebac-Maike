public class Media {
    public static void main(String[] args){
        MediaDeNotas();
    }

    private static void MediaDeNotas() {
        double nota1 = 8;
        double nota2 = 5.7;
        double nota3 = 9.4;
        double nota4 = 6;

        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.format("%.2f", media);
    }
}
