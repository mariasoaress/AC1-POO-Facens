# **Locadora de Veículos - Projeto AC1 (2 semestre de Análise e desenvolvimento de sistemas)**

## Descrição do Projeto:

Este projeto implementa um sistema básico de locação de veículos utilizando conceitos de Programação Orientada a Objetos, utilizando herança e encapsulamento. 
Foi desenvolvido como parte das atividades práticas da disciplina de Análise e Desenvolvimento de Sistemas. Foram utilizadas as seguintes tecnologias:
- Linguagem de programação Java;
- Visual Studio Code;
- Simulação de comandos SQL;

## Observações:

- O projeto foi desenvolvido para fins educacionais;
- Não possui verdadeira integração com o banco de dados;
- Os dados utilizados são fictícios;


## Estrutura do Projeto  (classes):

-> **Veículo (Classe Base)**:
Representa a classe genérica que armazena informações comuns a todos os tipos de veículos.

   - Atributos:
    modelo, placa, montadora, valor, cor, anoFabricacao.
   - Métodos:
    > validarPlaca(): Valida se a placa segue o formato ABC1D23.
    > descricao(): Gera uma descrição genérica do veículo.

-> **Carro (Classe Derivada)**:
Representa carros disponíveis para locação.

   - Atributos adicionais:
    quantPortas, potencia, tipoCarro, tipoCambio, tipoCombustivel.
   - Métodos:
    > descricaoCarro(): Retorna uma descrição específica de carros.
    > insert(): Gera um comando SQL para inserir os dados do carro.

-> **Moto (Classe Derivada)**:
Representa motos disponíveis para locação.

   - Atributos adicionais:
    cilindradas, pesoMoto, chassi, suspensao.
   - Métodos:
    > descricaoMoto(): Retorna uma descrição específica de motos.
    > insert(): Gera um comando SQL para inserir os dados da moto.

-> **Caminhão (Classe Derivada)**:
Representa caminhões disponíveis para locação.

   - Atributos adicionais:
    quantEixos, cargaMaxima, alturaCarga, tipoCabine, tipoCaminhao.
   - Métodos:
    > descricaoCaminhao(): Retorna uma descrição específica de caminhões.
    > insert(): Gera um comando SQL para inserir os dados do caminhão.

-> **Principal**:
Classe que contém o método main().

   - Realiza testes de criação de objetos e exibe descrições e comandos SQL (insert).
