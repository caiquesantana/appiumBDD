# language: pt
Funcionalidade: Cadastro de usuario

Contexto: 
	Dado que eu esteja no app
    
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
	Então o usuário foi cadastrado
	
Exemplos:
	|login		|email							|senha	|confirmarSenha|nome 	 |sobrenome |telefone  |estado   		|endereco  |cidade  |cep       |
	|Caique9876|caique@email.com  |Caique1|Caique1			 |caique |Santana	  |987665432 |Buenos Aires|Rua hum   |Palermo |0988490983|
	|Caique9302|caique@email.com  |Caique1|Caique1			 |Caique |Santana		|003902384 |Buenos Aires|Rua hum	 |Palermo |0968977686|

@CadastroSucesso
Cenário: Cadastro de usuario com sucesso
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
	Quando clico no botão de registrar
	Então o usuário foi cadastrado

@CadastroFalha
Cenário: Cadastro de usuario com falha
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
	Quando clico no botão de registrar
	Então apresenta o que o login já esta cadastrado