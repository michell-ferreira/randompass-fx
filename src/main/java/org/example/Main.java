package org.example;


import org.example.service.GeradorDeSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da senha que deseja: ");
        int comprimentoDaSenha = scanner.nextInt();
        String senha = GeradorDeSenha.gerarSenha(comprimentoDaSenha);

        System.out.println("Senha gerada: " + senha);


    }


}