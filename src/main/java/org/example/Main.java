package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.service.GeradorDeSenha;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gerador de Senhas");

        Label labelTamanhoSenha = new Label("Tamanho da senha:");
        TextField fieldTamanhoSenha = new TextField();
        fieldTamanhoSenha.setPromptText("Digite o tamanho (ex: 12)");

        Label labelErro = new Label();

        TextField fieldSenhaGerada = new TextField();
        fieldSenhaGerada.setEditable(false);

        Button buttonGerarSenha = new Button("Gerar senha");
        buttonGerarSenha.setOnAction(e -> {
            try {
                int tamanhoSenha = Integer.parseInt(fieldTamanhoSenha.getText());

                if (tamanhoSenha <= 3) {
                    labelErro.setText("Digite um número maior que 3.");
                    fieldSenhaGerada.clear();
                    return;
                }

                String senha = GeradorDeSenha.gerarSenha(tamanhoSenha);
                fieldSenhaGerada.setText(senha);
                labelErro.setText("");

            } catch (NumberFormatException ex) {
                labelErro.setText("Digite um número válido maior que 3 (ex: 12).");
                fieldSenhaGerada.clear();
            }
        });

        VBox vBox = new VBox(10, labelTamanhoSenha, fieldTamanhoSenha, buttonGerarSenha, labelErro, fieldSenhaGerada);
        Scene scene = new Scene(vBox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
