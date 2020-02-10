# language: pt


Funcionalidade: Busca de um produto pela pagina inicial
  Contexto: 
    Dado que estou na tela home

	@BuscaHomeSucesso
  Cenário: Busca de produto pela home com sucesso
    Quando clico na categoria LAPTOPS
    E seleciono o produto
    E estou no produto desejado
	Então eu valido o produto

	@BuscaHomeFalha
  Cenario: Certifica abertura de produto diferente
    E escolhe produto na tela inicial
    E abre produto diferente do que consta na  tela inicial
    Então eu comparo o produto
