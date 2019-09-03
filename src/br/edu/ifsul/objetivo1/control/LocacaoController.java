package br.edu.ifsul.objetivo1.control;

import br.edu.ifsul.objetivo1.model.Locacao;

public class LocacaoController {

    public static void main(String[] args) {
	    // Instanciado com o construtor padrão da classe
        Locacao l1 = new Locacao();

        System.out.println(l1);

        l1.setQuilometragem(1230);
        System.out.println("Quilometragem modificada: " + l1.getQuilometragem());
    }
}
