package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
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

        Label labelAviso = new Label();

        Label labelSenhaGerada = new Label("Senha Gerada:");
        TextField fieldSenhaGerada = new TextField();
        fieldSenhaGerada.setEditable(false);
        fieldSenhaGerada.setStyle("-fx-text-fill: cyan; -fx-background-color: black;");

        Button buttonGerarSenha = new Button("Gerar Senha");
        buttonGerarSenha.setOnAction(e -> {
            try {
                int tamanhoSenha = Integer.parseInt(fieldTamanhoSenha.getText());

                if (tamanhoSenha <= 3) {
                    labelAviso.setText("Digite um número maior que 3.");
                    fieldSenhaGerada.clear();
                    return;
                }

                String senha = GeradorDeSenha.gerarSenha(tamanhoSenha);
                fieldSenhaGerada.setText(senha);
                labelAviso.setText("");

            } catch (NumberFormatException ex) {
                labelAviso.setText("Digite um número válido maior que 3 (ex: 12).");
                fieldSenhaGerada.clear();
            }
        });

        Button buttonCopiarSenha = new Button("Copiar senha");
        buttonCopiarSenha.setOnAction(e -> {
            if (!fieldSenhaGerada.getText().isBlank()) {

                // Acessa diretamente o clipboard do sistema (equivalente a um Ctrl+C automático)
                Clipboard clipboard = Clipboard.getSystemClipboard();

                // Cria um objeto que vai armazenar o conteúdo a ser copiado
                ClipboardContent content = new ClipboardContent();

                // Coloca o texto da senha dentro do conteúdo do clipboard
                content.putString(fieldSenhaGerada.getText());

                // Envia o conteúdo para o clipboard (equivalente a Ctrl+C)
                clipboard.setContent(content);
                
                labelAviso.setText("Senha copiada!");
            }
        });

        VBox vBox = new VBox(5,
                labelTamanhoSenha,
                fieldTamanhoSenha,
                buttonGerarSenha,
                labelAviso,
                labelSenhaGerada,
                fieldSenhaGerada,
                buttonCopiarSenha
        );
        vBox.setPadding(new Insets(10));
        Scene scene = new Scene(vBox, 500, 300);
        stage.setScene(scene);
        stage.show();
    }
}
