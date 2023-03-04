#language: pt
#encoding: utf-8
#@compra

Funcionalidade: Comprar produtos infantis

  @compra
  Esquema do Cenario: Realizar a compra de novos produtos infantis
    Dado que acesso o ecommerce
    #Quando fizer login usando <usuario> com <senha> validos
    E selecionar a aba produtos
    E pesquisar pelo <primeiro_produto>
    E adicionar ao carrinho a <qtd_1>
    E pesquisar pelo <segundo_produto>
    E adicionar ao carrinho a <qtd_2>
    E pesquisar pelo <terceiro_produto>
    E adicionar ao carrinho a <qtd_3> indo para o pagamento
    #E realizar o pagamento com <nome>, <CC>, <data>, <cvc>
    #Entao valido a minha compra

    Exemplos:
      |			usuario			    |	senha  	  | primeiro_produto | qtd_1 |               segundo_produto               | qtd_2 |  terceiro_produto |qtd_3|       nome       |        CC        |   data  | cvc |
      |	"teste.testando@teste.com"  | "123456789" | "Stylish Dress"  | "3"   |"Beautiful Peacock Blue Cotton Linen Saree"  | "2"   |  "Men Tshirt"     | "1" |"Teste T Testando"|"5461485388316873"|"11/2024"|"971"|
