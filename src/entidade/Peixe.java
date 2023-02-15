package entidade;

public class Peixe extends Animal implements InterfaceAnimal{
    private String tipoEscama;

    public Peixe() {
    }

    public Peixe(String nome, int idade, double peso, String tipoEscama) {
        super(nome, idade, peso);
        this.tipoEscama = tipoEscama;
    }

    @Override
    public String emitirSom() {
        return "Glub* Glub*";
    }
}
