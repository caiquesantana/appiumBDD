# language: pt
Funcionalidade: Cadastro de usuario

  Contexto: 
    Dado que eu esteja no site
    E clico em criar nova conta
    E insiro o login
    E o email
    E a senha
    E confirmo a senha
    E o nome
    E o sobrenome
    E o telefone
    E seleciono o Pais
    E o insiro o Estado
    E o endereco
    E a Cidade
    E o codigo postal
    

  @CadastroSucesso
  Cenário: Cadastro de usuario com sucesso
    Quando clico no botão de registrar
    Então o usuário foi cadastrado

  @CadastroFalha
  Cenário: Cadastro de usuario com falha
    Quando clico no botão de registrar
    Então apresenta o que o login já esta cadastrado
