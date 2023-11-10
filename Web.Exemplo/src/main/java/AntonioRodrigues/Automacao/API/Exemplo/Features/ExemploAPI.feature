 # language: pt
Funcionalidade: Exemplo de uso do modelo da automacao

    Contexto: Eu como usuario dos fontes de automacao
              Necessito de um exemplo de uso dos fontes
              Para que possa realizar exercicios sobre implementacao de testes automatizados

	@CTA0001 @ValidacaoAPI
	Cenario: Validar metodo POST de criacao de usuario 
	Quando acesso o endpoint via POST
	| endpoint 					|
	|https://reqres.in/api/users|
	Entao verifico se a resquisicao POST foi bem sucedida

	@CTA0002 @ValidacaoAPI
	Cenario: Validar metodo GET SINGLE USER de consulta de usuario 
	Quando acesso o endpoint via GET
	| 	endpoint 						|
	|	https://reqres.in/api/users/2	|
	Entao verifico se a resquisicao GET foi bem sucedida

	@CTA0003 @ValidacaoAPI
	Cenario: Validar metodo GET LIST USERS de consulta de usuarios
	Quando acesso o endpoint via GET
	| 	endpoint 							|
	|	https://reqres.in/api/users?page=2	|
	Entao verifico se a resquisicao GET foi bem sucedida

	@CTA0004 @ValidacaoAPI
	Cenario: Validar metodo PATCH de atualizacao de usuario 
	Quando acesso o endpoint via PATCH
	| 	endpoint 							|
	|	https://reqres.in/api/users/2	|
	Entao verifico se a resquisicao PATCH foi bem sucedida