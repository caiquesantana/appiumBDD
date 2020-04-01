# language: pt
@Cadastro
Funcionalidade: Cadastro de usuario

  Contexto: 
    Dado que eu esteja no app

  @CadastroSucesso
  Esquema do Cenário: Deve cadastrar mais usuarios
    E clico em criar nova conta
    E insiro o login "<login>"
    E o email "<email>"
    E a senha "<senha>"
    E confirmo a senha "<confirmarSenha>"
    E o nome "<nome>"
    E o sobrenome "<sobrenome>"
    E o telefone "<telefone>"
    E seleciono o Pais
    E o insiro o Estado "<estado>"
    E o endereco "<endereco>"
    E a Cidade "<cidade>"
    E o codigo postal "<cep>"
    Quando clico no botão de registrar
    Então o usuário foi cadastrado "<login>"

    Exemplos: 
      | login      | email            | senha   | confirmarSenha | nome   | sobrenome | telefone  | estado  | endereco | cidade  | cep        |
      | Caique1917 | caique@email.com | Caique1 | Caique1        | caique | Santana   | 987665432 | Mendoza | Rua hum  | Palermo | 0988490983 |
  @CadastroFalha
  Esquema do Cenário: Cadastro de usuario com falha
    E clico em criar nova conta
    E insiro o login "<login>"
    E o email "<email>"
    E a senha "<senha>"
    E confirmo a senha "<confirmarSenha>"
    E o nome "<nome>"
    E o sobrenome "<sobrenome>"
    E o telefone "<telefone>"
    E seleciono o Pais
    E o insiro o Estado "<estado>"
    E o endereco "<endereco>"
    E a Cidade "<cidade>"
    E o codigo postal "<cep>"
    Quando clico no botão de registrar
    Então apresenta o que o login já esta cadastrado "<login>"

    Exemplos: 
      | login       | email            | senha   | confirmarSenha | nome   | sobrenome | telefone  | estado  | endereco | cidade  | cep        |
      | cauasantana | caique@email.com | Caique1 | Caique1        | caique | Santana   | 987665432 | Mendoza | Rua hum  | Palermo | 0988490983 |