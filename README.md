# Controle de Horas

Projeto para fins de estudo academico em java.

Este é um sistema simples de Controle de Horas desenvolvido em Java. Ele permite registrar entradas e saídas de usuários, calcular as horas trabalhadas, e gerar relatórios de atividade.

## Funcionalidades

- **Cadastro de Usuários**: Registre informações básicas dos usuários, como nome, cargo e ID.
- **Registro de Horas**: Permite registrar as horas de entrada e saída dos usuários.
- **Cálculo de Horas Trabalhadas**: Calcula automaticamente as horas trabalhadas com base nos registros.
- **Geração de Relatórios**: Gera relatórios simples das atividades dos usuários.

## Estrutura do Projeto

O projeto está organizado em pacotes:

- `model`: Contém as classes que representam os dados, como `Usuario` e `RegistroDeHoras`.
- `service`: Contém a lógica de negócios, com a classe `ControleDeHorasService`.
- `controller`: Contém a classe `Main`, que controla o fluxo do programa.

## Como Executar

1. **Pré-requisitos**:
   - Java Development Kit (JDK) 8 ou superior.
   - IDE Eclipse.

2. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/controle-de-horas.git
   cd controle-de-horas
   ```

3. **Importar o Projeto no Eclipse**:
  - Abra o Eclipse.
  - Vá para File > Import.
  - Selecione Existing Projects into Workspace e clique em Next.
  - Navegue até o diretório do projeto clonado e clique em Finish.

4. **Executar o Projeto**:
 - No Eclipse, clique com o botão direito na classe Main dentro do pacote controller.
 - Selecione Run As > Java Application.

5. **Verificar a Saída**:
 - O console do Eclipse exibirá os registros de entrada, saída e horas trabalhadas para cada usuário.

# Possíveis Expansões

 - Persistência de Dados: Adicionar suporte a um banco de dados para armazenar os registros de horas.
 - Interface Gráfica (GUI): Implementar uma interface gráfica para facilitar o uso do sistema.
 - Controle de Acesso: Incluir autenticação e níveis de acesso para diferentes tipos de usuários.

# Contribuição

 - Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar issues.
