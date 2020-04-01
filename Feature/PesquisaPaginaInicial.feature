# language: pt
@PesquiPaginaInicial
Funcionalidade: Busca de um produto pela pagina inicial

  Contexto: 
    Dado que estou na tela home

  @BuscaHomeSucesso
  Cenário: Busca de produto pela home com sucesso
    Quando clico na categoria LAPTOPS
    E seleciono o produto
    Então eu valido o produto

  @BuscaHomeFalha
  Cenario: Quantidade do produto incorreta ao ADD TO CART
    E Faco o login
    E escolho produto na tela inicial
    E adiciono mais de 10 unidades no carrinho
    Então eu comparo a quantidade de produto no carrinho
