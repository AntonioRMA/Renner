 # language: pt
Funcionalidade: Exemplo de uso do modelo da automacao

    Contexto: Eu como usuario dos fontes de automacao
              Necessito de um exemplo de uso dos fontes
              Para que possa realizar exercicios sobre implementacao de testes automatizados

	@CTA0001 @ValidacaoWEB
	Cenario: Validar selecao de produtos para usuario cadastrado
	Dado Que configuro o documento de evidencia da execucao
	| IdDemanda		| Sprint	| Sistema			| DescricaoCenario 												| ResultadoEsperado													|
	| CTA0001		| 0			| Teste Renner		| Inclususão de produtos no carrinho com usuario pre existente	| Produtos inseridos no carrinho com suas determinadas quantidades	|
	Dado que acessei o portal de teste com usuário deslogado 
	Quando realizo o login do usuario
	| email						| senha		|
	| boxosac913@jucatyo.com	| 102030	| 
	E acesso a tela de produtos
	E insiro os produtos no carrinho com suas quantidades
	| Produto									| Itens	| 
	| Stylish Dress								| 3		| 
	| Beautiful Peacock Blue Cotton Linen Saree	| 2		| 
	| Men Tshirt								| 1		| 
	Entao Verifico se os produtos foram incluidos no carrinho
	
	@CTA0002 @ValidacaoWEB
	Cenario: Validar selecao de produtos para usuario nao cadastrado
	Dado Que configuro o documento de evidencia da execucao
	| IdDemanda		| Sprint	| Sistema			| DescricaoCenario 												| ResultadoEsperado													|
	| CTA0001		| 0			| Teste Renner		| Inclususão de produtos no carrinho com cadastro de usuario	| Produtos inseridos no carrinho com suas determinadas quantidades	|
	Dado que acessei o portal de teste com usuário deslogado 
	Quando realizo o cadastro de um novo usuario
	E acesso a tela de produtos
	E insiro os produtos no carrinho com suas quantidades
	| Produto									| Itens	| 
	| Stylish Dress								| 3		| 
	| Beautiful Peacock Blue Cotton Linen Saree	| 2		| 
	| Men Tshirt								| 1		| 
	Entao Verifico se os produtos foram incluidos no carrinho
		

	
	
	