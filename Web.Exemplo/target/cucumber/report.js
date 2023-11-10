$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('AntonioRodrigues\Automacao\API\Exemplo\Features\ExemploAPI.feature');
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "Exemplo de uso do modelo da automacao",
  "description": "",
  "id": "exemplo-de-uso-do-modelo-da-automacao",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 4,
  "name": "Eu como usuario dos fontes de automacao",
  "description": "        Necessito de um exemplo de uso dos fontes\r\n        Para que possa realizar exercicios sobre implementacao de testes automatizados",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 9,
  "name": "Validar metodo POST de criacao de usuario",
  "description": "",
  "id": "exemplo-de-uso-do-modelo-da-automacao;validar-metodo-post-de-criacao-de-usuario",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@CTA0001"
    },
    {
      "line": 8,
      "name": "@ValidacaoAPI"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "acesso o endpoint via POST",
  "rows": [
    {
      "cells": [
        "endpoint"
      ],
      "line": 11
    },
    {
      "cells": [
        "https://reqres.in/api/users"
      ],
      "line": 12
    }
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "verifico se a resquisicao POST foi bem sucedida",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExemploAPISteps.acesso_o_endpoint_via_POST(DataTable)"
});
formatter.result({
  "duration": 5237548800,
  "status": "passed"
});
formatter.match({
  "location": "ExemploAPISteps.verifico_se_a_resquisicao_POST_foi_bem_sucedida()"
});
formatter.result({
  "duration": 4679900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Eu como usuario dos fontes de automacao",
  "description": "        Necessito de um exemplo de uso dos fontes\r\n        Para que possa realizar exercicios sobre implementacao de testes automatizados",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 16,
  "name": "Validar metodo GET SINGLE USER de consulta de usuario",
  "description": "",
  "id": "exemplo-de-uso-do-modelo-da-automacao;validar-metodo-get-single-user-de-consulta-de-usuario",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 15,
      "name": "@CTA0002"
    },
    {
      "line": 15,
      "name": "@ValidacaoAPI"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "acesso o endpoint via GET",
  "rows": [
    {
      "cells": [
        "endpoint"
      ],
      "line": 18
    },
    {
      "cells": [
        "https://reqres.in/api/users/2"
      ],
      "line": 19
    }
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 20,
  "name": "verifico se a resquisicao GET foi bem sucedida",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExemploAPISteps.acesso_o_endpoint_via_GET(DataTable)"
});
formatter.result({
  "duration": 1057161200,
  "status": "passed"
});
formatter.match({
  "location": "ExemploAPISteps.verifico_se_a_resquisicao_GET_foi_bem_sucedida()"
});
formatter.result({
  "duration": 20800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Eu como usuario dos fontes de automacao",
  "description": "        Necessito de um exemplo de uso dos fontes\r\n        Para que possa realizar exercicios sobre implementacao de testes automatizados",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 23,
  "name": "Validar metodo GET LIST USERS de consulta de usuarios",
  "description": "",
  "id": "exemplo-de-uso-do-modelo-da-automacao;validar-metodo-get-list-users-de-consulta-de-usuarios",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 22,
      "name": "@CTA0003"
    },
    {
      "line": 22,
      "name": "@ValidacaoAPI"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "acesso o endpoint via GET",
  "rows": [
    {
      "cells": [
        "endpoint"
      ],
      "line": 25
    },
    {
      "cells": [
        "https://reqres.in/api/users?page\u003d2"
      ],
      "line": 26
    }
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "verifico se a resquisicao GET foi bem sucedida",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExemploAPISteps.acesso_o_endpoint_via_GET(DataTable)"
});
formatter.result({
  "duration": 801562300,
  "status": "passed"
});
formatter.match({
  "location": "ExemploAPISteps.verifico_se_a_resquisicao_GET_foi_bem_sucedida()"
});
formatter.result({
  "duration": 17900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Eu como usuario dos fontes de automacao",
  "description": "        Necessito de um exemplo de uso dos fontes\r\n        Para que possa realizar exercicios sobre implementacao de testes automatizados",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 30,
  "name": "Validar metodo PATCH de atualizacao de usuario",
  "description": "",
  "id": "exemplo-de-uso-do-modelo-da-automacao;validar-metodo-patch-de-atualizacao-de-usuario",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 29,
      "name": "@CTA0004"
    },
    {
      "line": 29,
      "name": "@ValidacaoAPI"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "acesso o endpoint via PATCH",
  "rows": [
    {
      "cells": [
        "endpoint"
      ],
      "line": 32
    },
    {
      "cells": [
        "https://reqres.in/api/users/2"
      ],
      "line": 33
    }
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 34,
  "name": "verifico se a resquisicao PATCH foi bem sucedida",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExemploAPISteps.acesso_o_endpoint_via_PATCH(DataTable)"
});
formatter.result({
  "duration": 1050229400,
  "status": "passed"
});
formatter.match({
  "location": "ExemploAPISteps.verifico_se_a_resquisicao_PATCH_foi_bem_sucedida()"
});
formatter.result({
  "duration": 24300,
  "status": "passed"
});
});