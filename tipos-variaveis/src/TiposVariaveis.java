public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // Casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2); //Apenas para a variável ser utilizada
        //Para determinamos uma constante em JAVA adicionamos a palavra reservada "final" e por converção o nome da constante tem que ser em caixa alta
        final double PI = 3.14;
        System.out.println(PI);
    }
}
