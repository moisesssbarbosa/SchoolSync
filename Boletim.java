public class Boletim {
    Double nota1;
    Double nota2;

    public Boletim(Double nota1, Double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void mostrarMedia() {
        System.out.println("Média do aluno: " + (nota1 + nota2) / 2);
            
        if (((nota1 + nota2) / 2) > 6) {
            System.out.println("APROVADO.");
        } else {
            System.out.println("reprovado.");
        }
    }
}
