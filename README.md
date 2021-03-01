# DesafioSefaz

Olá! Seja bem vindo ao repositório do desafio Sefaz.
Aqui deixarei algumas orientações sobre o projeto com o propósito de facilitar a sua execução em qualquer ambiente.

Pré-requisitos

  - Eclipse
  - JDK 1.8+
  - PostgreSQL 13.1
  - Wildfly 22

Preparando o sistema

Para o funcionamento da aplicação se faz necessário:
 - Criar o banco no PostgreSQL com o nome de "welcomeapp", já que ele não permite a criação do banco via Hibernate;
 - Certificar-se que há um usuário: "postgres" e uma senha "root" ou alterar os parâmetros nas linhas: 
    - 25 com as informações de login "settings.put(Environment.USER, "LOGIN");"
    - 26 com as informações de senha settings.put(Environment.PASS, "SENHA");
    no arquivo "HibernateUtil.java"
 - Pré-requisitos instaldos e com suas variáveis de ambiente devidamente configuradas.
 
 Execução:
 
   Após um clone é possível rodar a aplicação (através do Wildfly) e acessar através do link: http://127.0.0.1:8080/WelcomeApp-0.0.1-SNAPSHOT/
 
 O que faz a aplicação?
 
   - Permite que você crie usuários para uma integração futura a outros sistemas;
   - Permite que as informações de usuários criados sejam excluídas ou atualizadas;
   - Permite uma listagem de todos os usuários;
   - O nome "do" usuário, não o nome "de" usuário não pode ser alterado, propositalmente;
 
 O que faltou na aplicação?
 
   - O usuário não consegue efetuar o login
   - O usuário não consegue, através da interface, cadastrar mais de um telefone
 
 O que poderia melhorar?
 
   Uma melhor busca de conhecimento ajax, validação de campos de formulário(não possui nenhum), validação em caso de deleção ou atualização de
      cadastro(caso nenhum usuário tenha sido selecionado). Explorar melhor o front para colocar uma lista(Combobox) apresentando todos os telefones.
      Implementar uma forma de adicionar mais telefones através das telas de /user-new e /user-update
      
 Sobre a experiência desenvolvendo essa aplicação.
 
    "Quem aprende servlet, faz qualquer coisa em programação!"
    Essa foi a frase que mais escutei dos meus amigos com experiência na área, e quanto mais eu desenvolvia mais ela parecia fazer sentido.
    Gostei demais da oportunidade de desenvolver numa linguagem já bem antiga. Em minhas buscas na internet as soluções para meus problemas
    eram exponencialmente maiores que as que encontro desenvolvendo em expressJS, Flutter por exemplo. No mais desejo uma boa avaliação do
    projeto. Até breve!
