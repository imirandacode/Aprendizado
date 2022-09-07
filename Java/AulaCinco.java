package Java;

public class AulaCinco {
    public static void main(String[] args) {
        int nota = -1;
        String graduacao = "";

        //se nota maior ou igual a 70, então aprovado

        //Graduações com Letras, A B C D
        // A = 80 B = 70 C = 60 D = 0

        if (nota >=80 && nota <=100) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70){
            graduacao = "B";
        }  else if (nota < 70 && nota >= 60){
            graduacao = "C";
        } else if (nota < 60 && nota >= 0){
            graduacao = "D";
        } else {
            System.out.println("Nota Inválida");
            graduacao = "";
        }   
        
        switch (graduacao) {
            case "A":
                System.out.println("Graduação A");
                System.out.println("Aluno Aprovado");
                break;
            case "B":
                System.out.println("Graduação B");
                System.out.println("Aluno Aprovado");
                break;
            case "C":
                System.out.println("Graduação C");
                System.out.println("Aluno Reprovado");
                break;
            case "D":
                System.out.println("Graduação D");
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Graduação Inválida");
                break;
        }
    }
}
