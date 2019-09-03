package br.edu.ifsul.objetivo1.control;

import br.edu.ifsul.objetivo1.model.Marca;

public class MarcaController {

    public static void main(String[] args) {
        //Instanciando com construtor padrão da classe
        Marca ma1 = new Marca();

        Marca ma2 = new Marca(2, "Essa eh a descricao da marca");

        System.out.println(ma1);
        System.out.println(ma2);

        ma1.setDescricao("Olha ai");
        System.out.println("Descricao modificada: " + ma1.getDescricao());
    }
}
