# Restaurante Rodrigues
O primeiro dos meus projetos principais desenvolvido em Java com banco de dados SQL. Foi criado para a conclusão do Projeto Integrador II do meu curso em Desenvolvimento de Sistemas no SENAC.

Criado para auxiliar um restaurante, com controle de mesas, pedidos, pratos servidos e cardápio.

## Tecnologias

- Java 17+
- Maven 
- MySQL
- JDBC 
- Swing (interface gráfica)

## Funcionalidades

- Adição e remoção de mesas prático
- Adição, atualização e finalização de pedidos
- Documentação de pedidos, com ID, mesa, CPF do cliente e valor.
- Organização de pratos servidos para cada pedido

## Melhorias futuas
- Adicionar e remover opções do cardápio

## Contato
- LinkedIn: https://www.linkedin.com/in/renato-rodrigues-76837a322/

- GitHub: https://github.com/Renato-DS

- Email: renatorodrigues0302@gmail.com

## Se quiser executar o projeto:
- Pré-requisitos: Java 17+, Maven e MySQL configurados.

1. Clone o repositório ou baixe o código-fonte.

2. Execute o arquivo `restauranterodriguesbd.sql` (presente na pasta exe) para criar e preencher o banco de dados local.

3. Ajustar senha para conexão no arquivo `persistence.xml` disponível na pasta raiz do projeto:
Altere o campo "value" da linha: "<property name="jakarta.persistence.jdbc.password" value="SuaSenhaAqui" />"

4. Execute `Compilar.bat` na pasta raiz do projeto

5. Execute `Restaurante Rodrigues.bat` disponível na pasta `exe`

## Licença
Este projeto está licenciado sob a MIT License. Consulte o arquivo LICENSE para mais detalhes.