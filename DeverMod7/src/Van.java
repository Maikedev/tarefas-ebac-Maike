public class Van {
    private int acentos;

    private int pessoas;

    public int getAcentos() {
        return acentos;
    }

    public void setAcentos(int acentos) {
        this.acentos = acentos;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    /**
     * @see <a https://youtu.be/dQw4w9WgXcQ?si=BN6tV_fbw2DUgwHl>VEJA</a>
     */
    public void quantidadePessoas(){
        setPessoas(pessoas);
    }

    public int quantidadeAcentos(){
        int qtd = getPessoas();
        if(qtd < 20){
            int qtd2 = 20 - qtd;
            System.out.printf("Temos %d acentos vagos na van.", qtd2);
        }
        else{
            System.out.println("Todos os lugares da van estão ocupados");
        }
        return 0;
    }
}
