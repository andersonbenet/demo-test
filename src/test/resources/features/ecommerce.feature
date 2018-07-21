#Autor: Anderson Da Cruz Benet
Feature: Ecommerce

  @smoke
  Scenario Outline:: Pesquisar produto
    Given tenha acessado a pagina
    When informo o "<produto>" no campo procurar produtos
    And clico no icone pesquisar
    And seleciono um produto na lista de produtos apresentados
    And clico no botao adicionar ao carrinho
    And clico no icone carrinho de compras
    Then vejo o produto no carrinho de compras
    
    Examples:
    |produto|
    |batman |
    |ps3    |