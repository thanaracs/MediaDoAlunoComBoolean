package aula3ponto8.MediaDoAlunoComBoolean;
/* programa para detectar com boolean se o aluno passou ou nao, verificando se a media eh maior que 6*/
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe sua nota: ");
        double nota = ler.nextDouble();

        boolean passa = nota >= 6.0;
        if (passa){
            System.out.println("VOCE PASSOU! ");
        } else {
            System.out.println("Que pena, tente novamente! ");
        }

    }
}
