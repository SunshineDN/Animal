package entidade;

public class Ave extends Animal implements InterfaceAnimal{
    private String tipoPenas;

    public Ave() {

    }

    public Ave(String nome, int idade, double peso, String tipoPenas) {
        super(nome, idade, peso);
        this.tipoPenas = tipoPenas;
    }


    @Override
    public String emitirSom() {
        return "Fiu* Fiu*";
    }
}
