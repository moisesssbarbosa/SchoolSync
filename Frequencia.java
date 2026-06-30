public class Frequencia {
    int faltas;

    public Frequencia(int faltas) {
        this.faltas = faltas;
    }

    public void mostrarFaltas() {
        System.out.println("O aluno teve: " + faltas + " faltas.");
    }
}
