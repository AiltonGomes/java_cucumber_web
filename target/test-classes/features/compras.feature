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
    #E adicionar ao carrinho a <quantidade>
    #E adicionar o <segundo_produto> ao carrinho na <quantidade>
    #E adicionar o <terceiro_produto>
    #E realizar o pagamento com <nome>, <CC>, <data>, <cvc>
    #Entao valido a minha compra

    Exemplos:
      |			usuario			    |	senha  	  | primeiro_produto | quantidade |
      |	"teste.testando@teste.com"  | "123456789" | "Stylish Dress"  |    "3"     |


    #               segundo_produto               | quantidade | terceiro_produto |       nome       |        CC        |   data  | cvc |
    #"Beautiful Peacock Blue Cotton Linen Saree"  |    "2"     |  "Men Tshirt"    |"Teste T Testando"|"5461485388316873"|"11/2024"|"971"|


    #1 - Pesquisar pelo vestido, validar se esta na tela - /product_details/4 ou
    #2 - Acessar o ver detalhes
    #3 - Adicionar ao carrinho

    #Stylish Dress 3 produtos
    #Beautiful Peacock Blue Cotton Linen Saree 2 - itens
    #Men Tshirt - 1

    #Teste T Testando				name = name_on_card
    #5461 4853 8831 6873				name = card_number
    #01/11/2024						name = expiry_month			name = expiry-year
    #971								name = cvc

  # Criar if para popups
