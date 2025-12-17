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

        Label labelTamanhoSenha = new Label("Tamanho da senha: ");
        TextField fieldTamanhoSenha = new TextField();
        fieldTamanhoSenha.setPromptText("Digite o tamanho (ex: 12)");

        Label labelSenhaGerada = new Label();
        TextField fieldSenhaGerada = new TextField();
        fieldSenhaGerada.setEditable(false); // usuário não consegue mexer na senha gerada

        Button buttonGerarSenha = new Button("Gerar senha");
        buttonGerarSenha.setOnAction(e -> {
            int tamanhoSenha = Integer.parseInt(fieldTamanhoSenha.getText());
            String senha = GeradorDeSenha.gerarSenha(tamanhoSenha);
            fieldSenhaGerada.setText(senha);
        });

        VBox vBox = new VBox(labelTamanhoSenha,fieldTamanhoSenha, buttonGerarSenha, labelSenhaGerada, fieldSenhaGerada);
        Scene scene = new Scene(vBox, 250, 200);
        stage.setScene(scene);
        stage.show();
    }
}