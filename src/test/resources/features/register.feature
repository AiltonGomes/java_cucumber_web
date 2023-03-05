#language: pt
#encoding: utf-8
#@registro

Funcionalidade: Cadastrar novo usuario

  @registro
  Cenario: Realizar o cadastro de um novo usuario
    Dado que acesso o ecommerce
    Quando selecionar para logar
    E digitar um novo nome e email
    E selecionar para cadastrar
    E selecionar o titulo
    E digitar uma senha
    E selecionar a data de aniversario
    E digitar o primeiro nome
    E digitar o sobrenome
    E digitar a empresa
    E digitar o endereço
    E selecionar o pais
    E digitar o estado
    E digitar a cidade
    E digitar o cep
    E digitar o numero de celular
    E selecionar para criar conta
    Então valido a criação da nova conta

