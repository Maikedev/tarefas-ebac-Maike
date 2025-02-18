public class Main {
    public static void main(String[] args){
        System.out.println("Ao todo na van, temos 20 acentos para os passageiros.");
        Van van = new Van();
        van.setPessoas(17); //Troque o número
        System.out.printf("Porém hoje só irão %d. ",van.getPessoas());
        System.out.println(van.quantidadeAcentos());
    }
}
