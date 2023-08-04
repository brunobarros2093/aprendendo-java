public class CondicionaisIf {
    // Toda classe nossa possui um método main
    // para que possamos executa-la!
    public static void main(String[] args) {
        int idade = 17;
        // if = se
        // else = senão
        // else if = senão se
        if (idade >= 18) { // se true - logica booleana
            System.out.println("Pode comprar bebida");
        } else if (idade <= 17) {
            System.out.println("Não pode comprar bebida!");
        } else {
            System.out.println("Pode tudo pq não validei nada");
        }
        // > = maior
        // < = menor
        // <= = menor e igual
        // >= maior e igual
    }
}
