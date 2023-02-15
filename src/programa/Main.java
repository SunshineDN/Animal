package programa;

import entidade.*;

public class Main {
    public static void main(String[] args) {
        Animal peixe = new Peixe();
        Animal ave = new Ave();
        Animal mamifero = new Mamifero();

        System.out.println(peixe.emitirSom());
        System.out.println(ave.emitirSom());
        System.out.println(mamifero.emitirSom());
    }
}
