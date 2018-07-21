$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ecommerce.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Autor: Anderson Da Cruz Benet"
    }
  ],
  "line": 2,
  "name": "Ecommerce",
  "description": "",
  "id": "ecommerce",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": ": Pesquisar produto",
  "description": "",
  "id": "ecommerce;:-pesquisar-produto",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "tenha acessado a pagina",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "informo o \"\u003cproduto\u003e\" no campo procurar produtos",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clico no icone pesquisar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "seleciono um produto na lista de produtos apresentados",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clico no botao adicionar ao carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clico no icone carrinho de compras",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "vejo o produto no carrinho de compras",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "ecommerce;:-pesquisar-produto;",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 15,
      "id": "ecommerce;:-pesquisar-produto;;1"
    },
    {
      "cells": [
        "batman"
      ],
      "line": 16,
      "id": "ecommerce;:-pesquisar-produto;;2"
    },
    {
      "cells": [
        "ps3"
      ],
      "line": 17,
      "id": "ecommerce;:-pesquisar-produto;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3264997138,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": ": Pesquisar produto",
  "description": "",
  "id": "ecommerce;:-pesquisar-produto;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "tenha acessado a pagina",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "informo o \"batman\" no campo procurar produtos",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clico no icone pesquisar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "seleciono um produto na lista de produtos apresentados",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clico no botao adicionar ao carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clico no icone carrinho de compras",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "vejo o produto no carrinho de compras",
  "keyword": "Then "
});
formatter.match({
  "location": "EcommerceSteps.tenhaAcessadoAPagina()"
});
formatter.result({
  "duration": 46855133097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "batman",
      "offset": 11
    }
  ],
  "location": "EcommerceSteps.informoONoCampoProcurarProdutos(String)"
});
formatter.result({
  "duration": 132787580,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.clicoNoIconePesquisar()"
});
formatter.result({
  "duration": 3674232254,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.selecionoUmProdutoNaListaDeProdutosApresentados()"
});
formatter.result({
  "duration": 3265041475,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.clicoNoBotaoAdicionarAoCarrinho()"
});
formatter.result({
  "duration": 183923958,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.clicoNoIconeCarrinhoDeCompras()"
});
formatter.result({
  "duration": 11468224449,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.vejoOProdutoNoCarrinhoDeCompras()"
});
formatter.result({
  "duration": 48177305,
  "status": "passed"
});
formatter.after({
  "duration": 201255553,
  "status": "passed"
});
formatter.before({
  "duration": 2224625169,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": ": Pesquisar produto",
  "description": "",
  "id": "ecommerce;:-pesquisar-produto;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "tenha acessado a pagina",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "informo o \"ps3\" no campo procurar produtos",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clico no icone pesquisar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "seleciono um produto na lista de produtos apresentados",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clico no botao adicionar ao carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clico no icone carrinho de compras",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "vejo o produto no carrinho de compras",
  "keyword": "Then "
});
formatter.match({
  "location": "EcommerceSteps.tenhaAcessadoAPagina()"
});
formatter.result({
  "duration": 33096072989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ps3",
      "offset": 11
    }
  ],
  "location": "EcommerceSteps.informoONoCampoProcurarProdutos(String)"
});
formatter.result({
  "duration": 102994049,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.clicoNoIconePesquisar()"
});
formatter.result({
  "duration": 6325725461,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.selecionoUmProdutoNaListaDeProdutosApresentados()"
});
formatter.result({
  "duration": 37726779200,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.clicoNoBotaoAdicionarAoCarrinho()"
});
formatter.result({
  "duration": 194696576,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.clicoNoIconeCarrinhoDeCompras()"
});
formatter.result({
  "duration": 12850182561,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceSteps.vejoOProdutoNoCarrinhoDeCompras()"
});
formatter.result({
  "duration": 44411548,
  "status": "passed"
});
formatter.after({
  "duration": 102295334,
  "status": "passed"
});
});