class Solution {
    public String reverseWords(String s) {
        String res = "";
        int l = 0, r = 0;
        while (r < s.length()){
            if (s.charAt(r) != ' '){
                r++;
            }else{
                res += new StringBuilder(s.substring(l, r)).reverse();
                res += " ";
                r ++;
                l = r;
            }
        }
        res += new StringBuilder(s.substring(l, r)).reverse();

        return res.toString();
    }
}

/*
* StringBuilder
O que é:
StringBuilder é uma classe do Java usada para construir e
modificar strings de forma eficiente.

Por que usar StringBuilder:
Strings em Java são imutáveis, ou seja, quando você modifica uma String,
o Java cria um novo objeto em memória. Isso pode ser ineficiente quando
você precisa fazer muitas alterações (como em loops).
O StringBuilder, por outro lado, permite alterar o conteúdo sem criar novos objetos.
Exemplo:
StringBuilder sb = new StringBuilder("Olá");
sb.append(" mundo");
System.out.println(sb.toString()); // Saída: "Olá mundo"
*/

/*
* substring
O que é:
substring é um método da classe String usado para pegar parte de uma string.

Sintaxe:
String sub = original.substring(inicio, fim);
inicio: índice inicial inclusivo
fim: índice final exclusivo

Exemplo:
String texto = "programador";
String parte = texto.substring(0, 7);
System.out.println(parte); // Saída: "program"
Isso pega os caracteres do índice 0 ao 6 (o 7 não é incluído).
*/