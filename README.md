# Projeto ContaBanco

## Descrição

O projeto **ContaBanco** é uma aplicação Java simples que recebe dados de uma conta bancária via terminal e exibe uma mensagem de confirmação ao usuário. Este projeto foi desenvolvido como parte de um exercício para praticar conceitos básicos de sintaxe, manipulação de variáveis, entrada de dados pelo terminal, e boas práticas de programação.

## Funcionalidades

- Solicitação de informações sobre a conta bancária do usuário:
  - Número da conta
  - Agência
  - Nome do cliente
  - Saldo
- Exibição de uma mensagem de confirmação com os dados inseridos pelo usuário.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- `ContaTerminal.java`: Classe que representa a conta bancária.
- `App.java`: Classe principal que contém a lógica para receber os dados do usuário e exibir a mensagem de confirmação.

## Tecnologias Utilizadas

- Java
- Scanner (para entrada de dados via terminal)

## Pré-requisitos

- JDK (Java Development Kit) instalado
- Um ambiente de desenvolvimento Java (IDE) ou um editor de texto
- Terminal ou console para executar a aplicação

## Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/ContaBanco.git

   ```

2. **Navegue até o diretório do projeto:**

   ```bash
   cd ContaBanco

   ```

3. **Compile os arquivos java**:

   ```bash
   javac App.java

   ```

4. **Execute a aplicação**
   ```bash
   java App
   ```

### Exemplo de uso

Ao executar a aplicação, você será solicitado a inserir os dados da conta bancária. Veja um exemplo abaixo:

    ```plaintext
    Informe os seu dados por favor.

    Número: 1021
    Agência: 067-8
    Nome: MARIO ANDRADE
    Saldo R$: 237.48

    Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.

### Contribuição

Se você quiser contribuir para o projeto, sinta-se à vontade para abrir um pull request ou relatar problemas na seção de issues.
