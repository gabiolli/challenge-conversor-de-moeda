<p align="center">
   <img src="src/titulo.png" alt="Título Conversor de Moeda">
</p>

## 📌 Índice
1. [Descrição](#-descrição)
2. [Funcionalidades](#-funcionalidades)
3. [Tecnologias Utilizadas](#-tecnologias-utilizadas)
4. [Como Usar](#-como-usar)
5. [Exemplo de Uso](#-exemplo-de-uso)
6. [Contribuições](#-contribuições)
7. [Licença](#-licença)


## 📝 Descrição
Este projeto é um Conversor de Moeda desenvolvido em Java que permite a conversão entre 12 opções de moedas. O usuário pode interagir diretamente pelo teclado, escolhendo a moeda de origem e destino, além de inserir valores numéricos de forma intuitiva. O programa integra-se a uma API de taxas de câmbio, garantindo que os cálculos estejam sempre alinhados com as taxas atuais do mercado.

## ✨ Funcionalidades
- Conversão entre 12 moedas diferentes (BRL, USD, EUR, JPY, CNY, ARS e COP).
- Interação intuitiva via teclado onde o usuário escolhe a moeda de origem e destino.
- Impede entrada inválida e opções incorretas, garantindo uma experiência fluida.
- As taxas de câmbio são obtidas automaticamente via API de conversão de moedas.
- Exibe resultados formatados com duas casas decimais para melhor precisão.

## 🔨 Tecnologias Utilizadas
- Java

## 💻 Como Usar
1. Clone o repositório e copie o projeto para seu computador usando o seguinte comando no terminal:
```sh
git clone https://github.com/seu-usuario/challenge-conversor-de-moeda.git
```
Depois, entre na pasta do projeto:
```sh
cd challenge-conversor-de-moeda
```
2. Execute o programa em uma IDE ou via terminal com os seguintes comandos:
```sh
javac src/Principal.java
java -cp src Principal
```

3. Ao iniciar o programa, você verá um menu interativo com 12 opções de conversão. Digite uma opção válida e o programa calculará automaticamente com a taxa de câmbio mais atualizada.
***************************************
                    
1) Real brasileiro ==> Dólar
2) Dólar ==> Real brasileiro
3) Real brasileiro ==> Euro
4) Euro ==> Real brasileiro
5) Peso argentino ==> Dólar
6) Dólar ==> Peso argentino
7) Peso colombiano ==> Dólar
8) Dólar ==> Peso colombiano
9) Real brasileiro ==> Iene
10) Iene ==> Real brasileiro
11) Real brasileiro ==> Yuan chinês
12) Yuan chinês ==> Real brasileiro
13) Sair
                    
***************************************

4. Em seguida digite o valor que deseja converter.

## 🔍 Exemplo de Uso
```sh
***************************************
Seja bem-vindo(a) ao Conversor de Moeda!

1) Real brasileiro ==> Dólar
2) Dólar ==> Real brasileiro
...
Escolha uma opção válida: 1
Digite o valor para a conversão: 100
O valor 100.00 BRL convertido é 19.23 USD
***************************************
```
## 🤝 Contribuições
Caso deseje ajudar a melhorar este projeto siga os passos abaixo:
1. Fork o repositório e clone-o:
```sh
git clone https://github.com/seu-usuario/challenge-conversor-de-moeda.git
```
2. Crie uma branch para suas alterações:
```sh
git checkout -b minha-melhoria
```
3. Implemente as melhorias e faça seus commits.

4. Envie a branch para o repositório e crie um Pull Request.

## 📜 Licença
Este projeto está licenciado sob a **MIT License**.
