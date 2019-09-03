package br.edu.ifsul.objetivo1.control;

import br.edu.ifsul.objetivo1.model.Cliente;

public class ClienteController {

    public static void main(String[] args) {
        // Instanciado com o construtor padrão da classe
        Cliente c1 = new Cliente();

        // Instanciado com o construtor parametrizado
        Cliente c2 = new Cliente(2, "159.632.120-62", "Maria", "Silva", "Rua da Luz", "49094-321", "(53) 99199-0888", "maria@hotmail.com");

        // Impresso utilizando toString()
        System.out.println(c1);
        System.out.println(c2);

        c1.setNome("Joao");
        System.out.println("Nome modificado: " + c1.getNome());


    }
}
