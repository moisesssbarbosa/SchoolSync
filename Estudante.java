public class Estudante {
    String nome;
    String matricula;
    Boolean mensalidadeDia;

    public Estudante(String nome, String matricula, boolean mensalidadeDia) {
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidadeDia = mensalidadeDia;

        if (mensalidadeDia = false) {
            System.out.println(nome + " esta com a mensalidade atrasada.");
        }
    }
}