package Java;

public class AulaQuatro {
    public static void main(String[] args) {

        System.out.println("Este é um algoritimo para saber se vamos a praia.");
        boolean fimDeSemana = true;
        String mensagem = fimDeSemana ? "É fim de semana." : "Não é fim de semana.";
        System.out.println(mensagem);
        boolean fazendoSol = false;
        mensagem = fazendoSol ? "Está Fazendo Sol." : "Não está Fazendo Sol.";
        System.out.println(mensagem);
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        mensagem = vamosAPraia ? "Deu bom, VAMOS para a Praia!" : "Deu ruim, NÃO vamos para a Praia!";
        System.out.println(mensagem); 

    }
}
