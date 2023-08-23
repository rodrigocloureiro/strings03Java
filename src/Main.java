/*
    3-) Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas  iniciais.
    As iniciais são formadas pela primeira letra de cada nome, sendo que todas deverão  aparecer em maiúsculas na
    saída do programa. Note que os conectores e, do, da, dos, das,  de, di, du não são considerados nomes e,
    portanto, não devem ser considerados para a  obtenção das iniciais. As iniciais devem ser impressas em
    maiúsculas, ainda que o nome  seja entrado todo em minúsculas.

    Exemplos:
     Maria das Graças Pimenta => MGP
     João Carlos dos Santos => JCS
     José da Silva => JS
     Pedro Pereira Teixeira => PPT
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCompleto, iniciais = "";
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        String[] nomePartes;
        boolean encontrou;

        System.out.print("Nome completo: ");
        nomeCompleto = sc.nextLine();
        nomePartes = nomeCompleto.split(" ");

        for (String parte : nomePartes) {
            encontrou = false;
            for (String conector : conectores) {
                if (parte.equalsIgnoreCase(conector)) {
                    encontrou = true;
                    break;
                }
            }
            if (!encontrou) iniciais += parte.toUpperCase().charAt(0);
        }
        System.out.println(iniciais);
    }
}
