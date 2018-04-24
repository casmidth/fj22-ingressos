Projeto do curso da Caelum fj22 - Desenvolvimento com Spring e teste

- Plugins de servidor
	Jetty (nativo do maven)
	TomCat

- maven fica instalado no servidor onde a aplicacao vai rodar
	~/.m2/repository
	- aqui dentro fica o arquivo settings.xml que tem as informacoes de deploy do Nexus
	
- commands
	mvn clean package
		- roda o clean, o validate, compile, test e package
	mvn jetty:run
		- inicializa o servidor
		

- Lifecycle do Maven
	1) validate (confirma se as tags do pom estao corretas)
	2) compile (primeiro instala as dependencias e depois compila o projeto) 
	3) test (roda os testes)
	4) package (gera os .class)
	5) verify (faz a verificacao de algumas atividades, mas depende de um plugin associado)
	6) install (salva o war em um artifact repository)
	7) deploy (pega o war do repositorio local e joga em um remoto, tipo o Nexus)
	
- github commands
	git add <file>
	git commit -a -m
	git push
	git pull
	git checkout <branch name> (muda de branch)
	git merge <branch a> <branch b>

- curiosidades
	a) Maven Mojo -> criador de plugins do Maven, criador de goals	