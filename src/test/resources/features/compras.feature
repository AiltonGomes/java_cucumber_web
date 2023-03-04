#language: pt
#encoding: utf-8
#@compra

Funcionalidade: Comprar produtos infantis

  @compra
  Esquema do Cenario: Realizar a compra de novos produtos infantis
    Dado que acesso o ecommerce
    Quando fizer login usando <usuario> com <senha> validos
    E selecionar a aba produtos
    #E pesquisar pelo <produto1>
    #E adicionar ao carrinho a <qtd_1>
    #E pesquisar pelo <produto2>
    #E adicionar ao carrinho a <qtd_2>
    E pesquisar pelo <produto3>
    E adicionar ao carrinho a <qtd_3> indo para o pagamento
    #E valido os produtos <produto1>, <produto2>, <produto3> indo para o pagamento
    E confirmo os produtos
    E realizar o pagamento com <nome>, <cc>, <cvc>, <mes>, <ano>
    #Entao valido a minha compra

    Exemplos:
      |			usuario			    |	senha  	  |     produto1     | qtd_1 |                  produto2                   | qtd_2 |      produto3     |qtd_3|       nome       |        cc        |   cvc  | mes  |  ano |
      |	"teste.testando@teste.com"  | "123456789" | "Stylish Dress"  | "3"   |"Beautiful Peacock Blue Cotton Linen Saree"  | "2"   |  "Men Tshirt"     | "1" |"Teste T Testando"|"5461485388316873"|  "971" | "11" |"2024"|
