import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante e1 = new Estudante("Moises", "1", true);
        Boletim b1 = new Boletim( 10.00, 10.00);
        Frequencia f1 = new Frequencia(0);
    
        Estudante e2 = new Estudante("Lucas", "2", true);
        Boletim b2 = new Boletim( 5.00, 5.00);
        Frequencia f2 = new Frequencia(0);

        Estudante e3 = new Estudante("Jacó", "3", false);
        Boletim b3 = new Boletim( 10.00, 10.00);
        Frequencia f3 = new Frequencia(0);

        System.out.println("\nAluno: " + e1.nome);
        b1.mostrarMedia();
        f1.mostrarFaltas();

        System.out.println("\nAluno: " + e2.nome);
        b2.mostrarMedia();
        f2.mostrarFaltas();

        System.out.println("\nAluno: " + e3.nome);
        b3.mostrarMedia();
        f3.mostrarFaltas();
    }
}
