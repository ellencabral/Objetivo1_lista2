package br.edu.ifsul.objetivo1.control;

import br.edu.ifsul.objetivo1.model.Modelo;

public class ModeloController {

    public static void main(String[] args) {
        // Instanciado com construtor padrão da classe
        Modelo mo1 = new Modelo();

        Modelo mo2 = new Modelo(2, "Muito bonito");

        System.out.println(mo1);
        System.out.println(mo2);

        mo1.setDescricao("Legal");
        System.out.println("Descricao modificada: " + mo1.getDescricao());


    }
}
