package entidade;

public class Mamifero extends Animal implements InterfaceAnimal{
    private String tipoPelagem;

    public Mamifero() {

    }

    public Mamifero(String nome, int idade, double peso, String tipoPelagem) {
        super(nome, idade, peso);
        this.tipoPelagem = tipoPelagem;
    }

    @Override
    public String emitirSom() {
        return "Roinc* Roinc*";
    }
}
