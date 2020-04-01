# language: pt
@PesquisaPelaLupa
Funcionalidade: Pesquisa de produto
  A pesquisa deve ser feita pelo campo de busca.

  Contexto: 
    Dado que estou na tela inicial
    Quando clico na lupa de pesquisa

  @PesquisaLupaSucesso
  Esquema do Cenário: Buscar um produto sucesso
    E digito o nome do produto desejado "<produto>"
    E clico no produto
    Então estarei na tela do produto pesquisado
    Exemplos:
      | produto                 |
      | HP CHROMEBOOK 14 G1(ES) |

  @pesquisarProdutoInexistente
  Cenario: pesquisar produto inexistente
    E digitar um produto inexistente no site
    Entao constata que o produto nao existe
