package br.edu.ifsul.objetivo1.control;

import br.edu.ifsul.objetivo1.model.Automovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutomovelController {

    public static void main(String[] args) {
        // Instanciado com o construtor padrão da classe
        Automovel a1 = new Automovel();

        // Instanciado com o construtor parametrizado
        Automovel a2 = new Automovel(2, "Abc", "340RKF", "branco", 4, "gasolina", 40, "queisso", 1304.00);

        // Impresso utilizando comportamento toString()
        System.out.println(a1);
        System.out.println(a2);

        a1.setId(1);
        a1.setRenavan("abc");
        a1.setPlaca("203FOI");
        a1.setCor("preto");
        a1.setNum_rodas(4);
        a1.setCombustivel("exemplo");
        a1.setQuilometragem(2404);
        a1.setChassi("seila");
        a1.setValor_locacao(2130.99);

        System.out.println(a1.getRenavan() + " " + a1.getPlaca() + " " + a1.getCor());

        Automovel a3 = new Automovel(3, "Abc", "340RKF", "branco", 4, "gasolina", 40, "queisso", 1304.00);
        Automovel a4 = new Automovel(4, "Abc", "340RKF", "branco", 4, "gasolina", 40, "queisso", 1304.00);
        Automovel a5 = new Automovel(5, "Abc", "340RKF", "branco", 4, "gasolina", 40, "queisso", 1304.00);
        Automovel a6 = a2;

        /*
            Collection List
        */

        List<Automovel> automovelList = new ArrayList<>();

        automovelList.add(a2);
        automovelList.add(a3);
        automovelList.add(a4);
        automovelList.add(a5);
        automovelList.add(a6);

        System.out.println(automovelList);

        automovelList.forEach(x -> {
            if(x.getId() == 3) {
                System.out.println("Objeto de ID = 3 : ");
                System.out.println(x);
            }

        });

        // Ordena a list pela ordem que ela foi formada
        Collections.sort(automovelList);

        // Ordena List inline

        automovelList.sort((x1, x2) -> {
            if(x1.getId() < x2.getId()){
                return 1;
            }
            else if (x1.getId() > x2.getId()) {
                return -1;
            }
            return 0;
        });

        System.out.println("Lista ordenada inline: " + automovelList);
    }

}
