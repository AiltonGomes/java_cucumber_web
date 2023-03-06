Projeto de automação WEB com Selenium WebDriver

######################## !!!!!!!!!!!!!! IMPORTANTE !!!!!!!!!!!!!! ########################   
Observações:

A respeito dos testes:
    
    O primeiro site que foi enviado no primeiro teste estava com problemas, tendo sido suspenso.
    
    O site escolhido é instável e tem muita propaganda, aparecendo em momentos totalmente aleatórios. A única propaganda que é constante aparece ao clicar em produtos, para essa 
    criei um método para fechar e dar continuidade no teste, porém a maioria das propagandas aparecem em locais e em momentos diversos, sendo impossível mapear e criar algo que de 
    100% assertivo, se caso fosse criar uma tratativa, teria que criar um if para cada interação. Portanto o teste não tem 100% de assertividade, pois também as propagandas 
    são diversas e para cada uma tem um elemento para a fechar.
    
    1 - Em alguns momentos momentos não era possivel logar.
    2 - Algumas propagandas aparecem nos cantos da tela e as vezes acaba atrapalhando os cliques, criei uma rolagemde tela para que role até encontrar o elemento mas em alguns
        momentos nem issi salva o teste e infelizmente ele quebra.
    3 - A maioria dos elementos não tem Id, name, class ou qualquer outro identificador, quase todos tive que criar os xpaths, para isso utilizei o plugin do chrome: Ttrue patch.

    Todas as evidencias estão na pasta de evidencias. 
    As evidencias foram criadas manualmente, infelizmente não deu tempo de criar o metodo para isso e nem o de report.
    
    Até o envio desse projeto via email, ainda estava refatorando alguns métodos, alterando e melhorando o código, porém esta tendo algum problema no login.

Criando e subindo o meu projeto no repositório GIT:

    git init
    git add .
    git commit -m "Comentario do seu commit"
    git remote add origin https://github.com/AiltonGomes/teste_dbc_web.git
    git push -u origin
    git push --set-upstream origin master

Clonando o projeto para realizar testes:

    git clone https://github.com/AiltonGomes/teste_dbc_web.git

Navegador e chromedriver:
    
    Salvei o chromedriver na pasta: test/resource/drivers, adicionai apenas o chromedriver, atentesse a versão do seu navegador para que não der erro, as versões chrome e chromedriver
    devem ser compativeis.

Suite de teste:
    
    Na pasta test/java/tests tem o arquivo TestRule.class que seria nossa suite, basta alterar ou adicionar a TAG do teste que ira rodar.