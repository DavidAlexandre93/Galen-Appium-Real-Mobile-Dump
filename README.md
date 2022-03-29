# Real-Mobile-Appium-JUnit
# Test Real Mobile Device Junit

<b>GALEN FRAMEWORK - CONFIGURAÇÃO</b>

```
Instalar: (JAVA JDK, JAVA JRE, NODE,JS, Chocolatey(choco Install all drivers), GALEN, Zip Galen, Editor de texto VSCode)
```

```
Configurar variável do sistema --> ChromeDrive/GeckoDrive/IEDriver no path do sistema
```

```
Configurar variável do sistema --> Java JDK(Criar nova variável como JAVA_HOME)(Adicionar o %JAVA_HOME%\bin no path do sistema)
```

```
Configurar variável do sistema --> Java JRE (Criar nova variável como JRE_HOME) 
```

```
Instalar Chocolatey (Link --> https://medium.com/qaninja/choco-um-jeito-doce-de-instalar-ruby-e-selenium-no-windows-5113f26f826a)
```

```
Para linux Configurar colocando na Variável do sistema JavaScriptExecutor Java Rhino.
```

```
Iniciar GITBash/CMD para modo administrador com o comando --> cmd.exe npm--
```

```
Configurar variável do sistema com arquivo Zip Galen/Galen.bat (Link para informação --> http://mindengine.net/post/2014-01-08-configuring-galen-framework-for-windows/#.XBhLnFxKi00)
```

<b>GALEN FRAMEWORK - INSTALAÇÃO NO WINDOWNS</b>

```
Abra o CMD
```

```
Verifica sua versão de ferramentas --> Node -v / NPM -v / galen -v 
```

```
Instalar Galen Framework com o comando --> npm install -g galenframework-cli (NPM é gerenciador de pacotes do JavaScript) (Node é responsavel por migrar código do cliente para o servidor)
```

```
Execute este comando para verificar atualizações recentes / npm install npm@latest -g
```

```
Atualizar Galen Framework com o comando --> npm update -g galenframework-cli
```

```
Verifica novamente versão do galen com o comando --> galen -v
```

```
Local padrão de salvamento do diretório Galen ( C:\Users\david\AppData\Roaming\npm\node_modules\galenframework-cli )
```

<b>GALEN FRAMEWORK - INSTALAÇÃO NO LINUX</b>

```
Abra o terminal
```

```
Extrair galen ao local desejado digite o seguinte comando --> unzip galen-bin-2.4.0.zip
```

```
Comando para listar aquivos --> ls
```

```
Comando para acessar pasta galen-bin-2.4.0 --> cd
```

```
Listar arquivos --> ls
```

```
Executar o instalador com o comando --> install.sh
```

```
Instalação de executor JavaScript Rhino 1.7
```

<b>GALEN FRAMEWORK - GERAR GALEN CONFIG</b>

```
(Link para consulta --> http://galenframework.com/docs/getting-started-install-galen/ || https://www.npmjs.com/get-npm)
```

```
Executar o comando para criar arquivo config Galen --> galen config
```

```
Para acessar e editar configurações galen --> Code galen.config
```

<b>GALEN FRAMEWORK - CRIANDO PASTA E ARQUIVO DE TESTE</b>

```
Código para verificar ajudar e exemplos --> galen -h
```

```
Executar o comando --> cd.. (para voltar a raiz do diretório)
```

```
Entrar no diretório workspace com comando --> cd workspace/ OBS: Windowns verificar local onde galen cli está instalado
```

```
Executar o comando --> ls/dir
```

```
Criar um novo diretório para armazenar o teste com comando --> mkdir Teste-Layout
```

```
Acessar no diretório criado com o comando --> cd galen-teste-layout
```

```
Executar o comando --> ls/dir
```

```
Executar o comando para criar um arquivo em branco --> touch home.gspec (Windows executar o comando --> fsutil file createnew nome-do-arquivo  tamanho)
```

```
Executar o comando Code dependendo de seu editor de texto --> Code home.gspec (.gspec para leitura galen)
```

```
Aperta a letra “i” para realizar um insert no texto (Editor Vim)
```

```
Código de exemplo:
----------------------------------------------------
@objects
    header-logo          #header-logo
    header-text          #header h1




= Header =
    header-logo:
        left-of header-text 5 to 25 px   
----------------------------------------------------
```

```
Executar o comando ESC para sair do Insert e "ctrl" + ":" + "w" + "q" para escrever, salvar e sair (Editor Vim)
```

<b>GALEN FRAMEWORK - EXECUTANDO TESTE</b>

```
Executar o comando para iniciar o teste --> galen check home.gspec --url http://testapp.galenframework.com/ --size 1024x768 --htmlreport Evidence_Test
```

```
Teste em suíte o comando --> galen test my.test --htmlreport Evidence_Test
```

```
Teste com site que contém bug -->  testapp.galenframework.com/bad-version || www.davidalexandrefernandes.com.br
```

```
Para visualização do report --> google-chrome Evidence/report.html (Para Windowns o comando é  start Evidence/report.html)
```

<b>GALEN FRAMEWORK - LINK PARA ESTUDOS</b>

```
https://www.youtube.com/watch?v=dtS2w0hJ2RQ
```

```
https://www.softwaretestinghelp.com/selenium-grid-selenium-tutorial-29/
```

```
https://www.lucascaton.com.br/2018/01/07/comandos-para-o-terminal-windows-macos-e-linux/
```

```
https://groups.google.com/forum/#!forum/galen-framework
```

<b>GALEN FRAMEWORK - GALEN DUMP</b>

Realizar comparação de imagem com Galen Dump:
```
Acessar a página para teste --> testapp.galenframework.com
```

```
Inspecionar elemento da página ( header, aside, section, nav, footer) 
```

```
Digitar o comando para abrir uma pasta direto do cmd --> start .
```

```
Iniciar um teste com a .gspec contendo somente os @objects --> galen dump home.gspec --url http://testapp.galenframework.com/ --size 1024x768 --export homepage-dump
```

```
Código de comparação de imagen no arquivo gspec --> image file homepage-dump/objects/header.logo.png, map-filter denoise 2, error 5px
```

```
Executar o comando de teste --> galen check home.gspec --url http://testapp.galenframework.com/ --size 1024x768 --htmlreport Evidence_Test
```

```
Ou executar o suíte de teste -- galen test my.test --htmlreport Evidence
```

```
Obs: Para exemplo na "home.gspec" alterar o image-1 para image2 e executar comando de teste novamente
```

```
EXEMPLO DE DUMP --> http://galenframework.com/public/pagedump-example/page.html
```


<b>GALEN FRAMEWORK - GERADOR DE CÓDIGO TESTE</b>

```
Gerar testes automaticamente --> galen generate "home-pagedump/page.json" --export login.gspec
```

```
Sem formato de galen-extras --> galen generate "home-pagedump/page.json" --export login.gspec --no-galen-extras
```

<b>SELENIUM GRID - CONFIGURANDO O SELENIUM GRID</b>

INSTALAR:
```
Selenium standalone --> http://selenium-release.storage.googleapis.com/index.html?path=3.141/
```

```
Criar uma pasta no disco local "C:" extrair neste local
```

```
No cmd digitar o seguinte comando --> java -jar selenium-server-standalone-3.141.59.jar -port 4444 -role hub
```

```
No cmd digitar o seguinte comando --> java -jar selenium-server-standalone-3.141.59.jar -role node 
```

```
Verificar o nó criado em --> http://localhost:4444/grid/console
```

CÓDIGO EXEMPLO DE SUÍTE BROWSER:
```
@@ Set 
     domain testapp.galenframework.com
     run_in_grid selenium grid http://localhost:4444/wd/hub


@@ table browsers
    | browser |          
    | chrome  |
    | firefox | 
    | ie      | 
@@ table myDevices
    | deviceName |  
    | desktop    | 
    | mobile     | 
@@ table myDevices2
    | size    |
    | 1024x768|
    | 500x800 | 
@@ table myDevices3
    | tags    |
    | desktop |
    | mobile  |
                                    
@@ parameterized using myDevices, browsers, myDevices2, myDevices3
My notes page on ${deviceName} device in ${browser} browser
    
My notes page in Selenium Grid in firefox
    ${run_in_grid} --browser firefox --version "64.0" --platform "Windows" --page "http://${domain}" --size ${size}
        
        check specs/home.gspec  --include   "${tags}" 
        check specs/mynotes.gspec --include "${tags}"
```

<b>APPIUM - INSTALANDO O APPIUM</b>

```
Instalar o appium digite o seguinte codigo --> npm install -g appium
```

```
Intalar o AndroidDriver com o comando --> npm install appium-android-driver
```

```
Instalar um requisito do appium que é android sdk digite o comando --> npm install -g android-sdk-client / npm i android-sdk / npm i android-platform-tools
```

```
Conectar um dispositivo com appium digite o seguinte codigo --> appium -a 127.0.0.1 -p 8001 -U emulator-5554
```

<b>ANDROID STUDIO - INSTALANDO E CONFIGURANDO ANDROID MANAGER</b>

```
Baixar SDK completo --> https://android-sdk.br.uptodown.com/windows
```

```
Baixar em uma pasta criada no disco local "C:"
```

```
Executar o SDK manager e instalar drivers
```

```
Criar na variável do sistema o caminho para a pasta criada do androidSDK --> ANDROID_HOME
```

```
Para visualizar seu dispositivo digitar o comando --> adb devices
```

```
Para visualizar o nome do dispositivo o comando --> adb devices -l (completo)
```

```
Obs: Em mobile se preferir visualizar o screenshot full tera que ir para o galen.config e mudar de false para true
```

<b>TESTADOR DE ESPECIFICAÇÕES DE CÓDIGO TESTE</b>


Teste de especificações do código --> galen mutate login.gspec --url "http://testapp.galenframework.com#login" --size 1200x800 --offset 5 --htmlreport mutation-report 

<b>APPIUM - WIFI APPIUM</b>

```
Digitar o comando para registrar o celular na porta padrão --> adb tcpip 5555
```

```
Digitar o comando para verificar o IP do celular --> adb shell ip -f inet addr show wlan0
```

```
Desconectar do cabo USB o Celular
```

```
Digitar o comando para conectar IP do celular com o computador --> adb connect 192.168.43.1
```

```
Para voltar a porta USB digite o comando --> adb usb
```

```
Obs: Garantirá que exista um servidor executando --> adb start-server 
```

```
Obs: Comando que matará o servidor se ele estiver em execução --> adb kill-server 
```

<b>GITHUB - GIT PARA O GITHUB</b>

```
Dentro da pasta do projeto inicializar o Git bash
```

```
git clone (url do repositório no github)
```

```
acessar a pasta clonada
```

```
git init
```

```
git status (em vermelho ainda falta enviar para o github)
```

```
git add .(enviar tudo)
```

```
git commit -m "Version 1.0"
```

```
git push
```

<b>AVD MANAGER - CONFIGURAR AVD</b>

```
Acessar o caminho do tools ->  C:\SDK\tools
```

```
Listar os dispositivos AVD -> emulator.exe -list-avds
```

```
Executar o emulador desejado -> emulator.exe -avd Nexus_5_API_24
```

```
Será mostrado o celular emulador
```

<b>ADICIONAIS</b>

ATUALIZAR CHROMEDRIVER_VERSION:
```
chromedriverversion=2.20 npm install appium
```

```
chromedriverversion=latest npm install appium
```

<b>.BAT - COMANDOS .BAT</b>

ECHO: Escreve na tela
ECHO OFF: Oculta informações e o código executado pelo sistema.
ECHO ON: Exibe informações e o código executado pelo sistema.
ECHO.: Salta uma linha.
@ECHO: Faz com que o prompt fique oculto durante toda execução.
SET: Cria variável que pode ser referenciada através de %variável%.
CLS: Limpa o console.
IF e ELSE: Estruturas condicionais.
GOTO: Avança até determinado trecho do lote.
FOR: Estrutura de repetição.
PAUSE: Faz uma pausa, e exibe: “Pressione qualquer tecla para continuar.”
REM: Utilizado para fazer comentários.
START: Inicializa um aplicativo ou programa.
MOVE: Move (recorta) um arquivo de um diretório para outro.




