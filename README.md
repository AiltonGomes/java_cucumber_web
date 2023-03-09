Projeto de automação WEB com Selenium WebDriver

######################## !!!!!!!!!!!!!! IMPORTANTE !!!!!!!!!!!!!! ########################   
Observações:

A respeito dos testes:

Clonando o projeto para realizar testes:

    git clone https://github.com/AiltonGomes/teste_dbc_web.git

Navegador e chromedriver:
    
    Salvei o chromedriver na pasta: test/resource/drivers, adicionai apenas o chromedriver, atentesse a versão do seu navegador para que não der erro, as versões chrome e chromedriver
    devem ser compativeis.

Suite de teste:
    
    Na pasta test/java/tests tem o arquivo TestRule.class que seria nossa suite, basta alterar ou adicionar a TAG do teste que ira rodar.

No teste de comprar os produtos:

    O teste tem um problema, tem muita propaganda e são aleátorias.
    Não criei um tratamento para elas pois são variadas e não tem como tratar todas, algumas delas até abre outra aba do navegador.
    Criei um tratamento que cobre 2 ou 3 propagandas que tem um elemento em comum, conseguindo assim fechar a propaganda e dar continuidade no teste.
    Criei um tratamento que cobre 2 ou 3 propagandas que tem um elemento em comum, conseguindo assim fechar a propaganda e dar continuidade no teste.
    Então infelizmente acaba quebrando algumas vezes.