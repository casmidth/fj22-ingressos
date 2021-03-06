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
	git branch <nome branch>
	git checkout <branch name> (muda de branch)
	git merge <branch a> <branch b>

- Spring annotations
	@Controller - fala que uma classe eh um controller de paths (requests) da web app
	@Service - fala que uma classe devolve informacoes 
	@Repository - fala que uma classe eh um DAO
	@Componenet - quando uma classe nao eh nenhuma das outras acima.
	@Autowired - quando o objeto de uma classe eh injetado pelo Spring
	@GetMapping e @RequestParam

- Hibernate
	@Entity -> dizendo pro Hibernate que a classe eh uma entidade de banco
	@ManyToOne -> indica cardinalidade em um objeto instanciado dentro do outro
	@ID @GeneratedValues(Strategy=IDENTITY)
	@DateTimeFormat(pattern="hh:mm")
	
- Testes
	Unitario -> testa via 3A ou GWT, quando eh testado uma pequena unidade (Ex um metodo) por vez
	Integracao -> quando eh testada funcionalidades externas da applicacao, tipo conexao com banco
	Aceitacao -> teste manual feito por humanos (Selenium)
		
- Design Patterns
	Strategy-> implementa varias funcoes (classes) que podem ser extendidas, mas mantem a funcao que as usa fixa passando uma interface, cuja as classes extensivas implementam
	Factory-> por exemplo Enum, que estamos usando para converter a string de resposta da UI para uma classe
	
- curiosidades
	a) Maven Mojo -> criador de plugins do Maven, criador de goals
	b) Tipos de data:
		Date
		Calendar
		DataTimeApi (Duration, LocalDate, LocalTime, LocalDateTime)
	c) SpringData -> tem todos os metodos de CRUD prontos
	d) DTO -> data transfer object, previde ataques na web (mass assignment)
	e) Optional.class -> generics que tem alguns metodos tipo .IsPresent, .get, .orElse ou .ifPresent
	f) aplicao assincrona e sincrona -> varias execucoes ao mesmo tempo vs uma funcao por vez
	g) LOG4J -> log assincrono
	h) Map -> mapear um conjunto de dados para conjuntos menores (afunilando)
	i) Reduce -> reduzir o conjunto de dados em um so
	j) Parallel Stream -> java 8 faz a lista toda de processamentos sem ter que configurar
	k) method reference -> Ingressos.stream().map(Ingresso::getLugar)