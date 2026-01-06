# RandomPass FX 🔐

![Java](https://img.shields.io/badge/Language-Java-orange)
![JavaFX](https://img.shields.io/badge/GUI-JavaFX-blue)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Platform](https://img.shields.io/badge/Platform-Desktop-lightgrey)

Projeto de uma aplicação desktop desenvolvida em **JavaFX** para geração de **senhas aleatórias seguras**, criada para aplicar e consolidar conceitos fundamentais de Java, Programação Orientada a Objetos e desenvolvimento de interfaces gráficas com JavaFX.

---

## 🎥 Demonstração em Vídeo

<a href="https://youtu.be/WkIQWf5RcRs" target="_blank">Assista a uma demonstração da aplicação em funcionamento</a>

---

## 📜 Sobre o Projeto
> **Nota de Contexto**
>
> Este projeto foi desenvolvido inicialmente como parte do curso **"Java Completo"** do professor **Arnaldo Sousa**.  
> A partir da base ensinada no curso, implementei novas funcionalidades, melhorias estruturais e personalizações visuais com o objetivo de aprofundar meus estudos em **JavaFX** e boas práticas de desenvolvimento.


Este projeto foi desenvolvido como um exercício prático para consolidar o uso do **JavaFX em aplicações desktop**, com foco em **usabilidade**, **validação de entrada do usuário** e **separação de responsabilidades** entre interface gráfica e lógica de negócio.

A aplicação permite ao usuário:
- Definir o tamanho da senha desejada
- Gerar uma senha aleatória segura
- Copiar a senha gerada para a área de transferência do sistema

O projeto utiliza uma interface simples e objetiva, priorizando clareza visual e facilidade de uso.

---

## ✨ Funcionalidades

* Geração de senhas aleatórias com tamanho definido pelo usuário
* Validação de entrada (tamanho mínimo e valores inválidos)
* Uso de `SecureRandom` para maior segurança na geração
* Campo de saída somente leitura para a senha gerada
* Botão para copiar a senha automaticamente para o clipboard
* Feedback visual para mensagens de erro e sucesso
* Interface organizada e responsiva utilizando `VBox`

---

## 💡 Destaque da Implementação

O principal destaque do projeto é a **separação clara entre interface gráfica e lógica de negócio**, utilizando uma classe de serviço dedicada (`GeradorDeSenha`) para a geração das senhas.

A aplicação demonstra:
- Uso de `SecureRandom` para geração segura de dados aleatórios
- Manipulação da área de transferência do sistema (`Clipboard`)
- Tratamento de exceções (`try/catch`) para entrada do usuário
- Organização de código seguindo boas práticas
- Construção de interfaces JavaFX sem FXML, focando na API pura

---

## 🚀 Como Executar o Projeto

```bash
# 1. Clone o repositório
git clone https://github.com/michell-ferreira/randompass-fx

# 2. Acesse a pasta do projeto
cd randompass-fx

# 3. Execute a aplicação
mvn javafx:run
```

## ✒️ Autor

**Michell Ferreira**

* **GitHub:** [michell-ferreira](https://github.com/michell-ferreira)
* **LinkedIn:** [ferreira-michel](https://www.linkedin.com/in/ferreira-michel/)

---
