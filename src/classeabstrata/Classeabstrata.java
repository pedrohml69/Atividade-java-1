/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classeabstrata;

/**
 *
 * @author pedro
 */
abstract class Animal {
    protected String nome; 

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }
}

class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: au au au au au au au au");
    }
}

public class Classeabstrata {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Thor");

        System.out.println("Nome do animal: " + meuCachorro.getNome());
        meuCachorro.emitirSom();
    }
}

