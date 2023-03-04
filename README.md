Projeto de automação WEB com Selenium WebDriver

Criando e subindo o meu projeto no repositorio GIT:

    git init
    git add .
    git commit -m "Comentario do seu commit"
    git remote add origin https://github.com/AiltonGomes/teste_dbc_web.git
    git push -u origin
    git push --set-upstream origin master

Clonando o projeto para realizar testes:

    git clone  usar_um_dos_caminhos_abaixo
    Https =  https://github.com/AiltonGomes/teste_dbc_web.git
                        ou
    SSH   =  git@github.com:AiltonGomes/teste_dbc_web.git

######################## !!!!!!!!!!!!!! IMPORTANTE !!!!!!!!!!!!!! ########################   
Observações:

A respeito do site:
    
    O site é instavel e tem muita propaganda, aparecendo algumas propagandas em momentos aleatorios.
    Ao clicar em produtos sempre aparece uma, para essa criei um metodo para fechar e dar continuidade no teste, porém essa propaganda aparece em locais e em momentos totalmente aleatorios, sendo impossivel mapear e criar algo que de 100% de acertivo, se caso fosse tratar teria que criar um if para cada interação.
    O ideal é que, quando o teste der erro, verificar nas evidencias e ver se foi uma dessas propagandas, se for infelizmente tera que rodar o teste novamente.
