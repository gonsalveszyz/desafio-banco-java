# Desafio Banco em Java

Este projeto é uma aplicação simples desenvolvida em **Java**, executada via terminal, que simula algumas operações básicas de uma conta bancária.

O programa exibe os dados iniciais de um cliente e apresenta um menu interativo, permitindo que o usuário consulte saldo, realize transferências, receba valores e encerre a aplicação.

---

## Funcionalidades

O sistema possui as seguintes funcionalidades:

- Exibir dados iniciais do cliente;
- Consultar o saldo da conta;
- Transferir um valor da conta;
- Verificar se há saldo suficiente para transferência;
- Receber um valor e atualizar o saldo;
- Exibir menu interativo no terminal;
- Encerrar o programa ao escolher a opção de saída;
- Tratar opções inválidas no menu.

---

## Dados iniciais da conta

O programa inicia com os seguintes dados cadastrados diretamente no código:

| Informação | Valor |
|---|---|
| Nome do cliente | Roberto |
| Tipo de conta | Corrente |
| Saldo inicial | 1599.99 |

---

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- Terminal

---

## Conceitos de Java aplicados

Este projeto utiliza conceitos fundamentais da linguagem Java, como:

- Criação de classe;
- Método `main`;
- Variáveis;
- Tipos de dados `String`, `int` e `double`;
- Entrada de dados com `Scanner`;
- Saída de dados com `System.out.println`;
- Estrutura de repetição `while`;
- Estruturas condicionais `if`, `else if` e `else`;
- Operadores de comparação;
- Operadores aritméticos;
- Atualização de variáveis;
- Text blocks com `"""`.

---

## Como funciona o programa

Ao iniciar o programa, são exibidas as informações da conta:

```text
**********************

Nome do Cliente Roberto
Tipo de Conta: Corrente
Saldo da Conta: 1599.99

**********************

***Digite sua opcao***

1 - Consultar Saldo da Conta
2 - Transferir Saldo da Conta
3 - Receber um valor
4 - Sair

Qual o valor que deseja transferir
2000
Nao a saldo para transferir

Qual o valor que deseja transferir
500
O novo saldo atualizado e 1099.99
