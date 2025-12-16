package org.example.service;

import java.security.SecureRandom;

public class GeradorDeSenha {

    private static final String CARACTERES =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-+=[]{}|;:,.<>?/";

    public static String gerarSenha(int comprimento) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++) {
            // gera um índice aleatório baseado no tamanho da lista de caracteres
            int indice = random.nextInt(CARACTERES.length());

            // adiciona à senha o caractere correspondente ao índice sorteado
            senha.append(CARACTERES.charAt(indice));
        }

        // converte o StringBuilder em String e retorna a senha final
        return senha.toString();
    }
}
