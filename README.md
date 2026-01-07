## Decisões de Design

Esse projeto foi desenvolvido com o foco em demonstrar habilidades básicas de API REST e SpringBoot

### Arquitetura
A aplicação possui as seguintes camadas:
- **Controller**: Responsável por receber e responder as requisições HTTP
- **Service**: Contém as regras de negócio e validações.
- **Model**: Representa a entidade do estudante

Essa separação melhora a legibilidade e a manutenção do código

### Armazenamento interno
Os estudantes ficam armazenados na memória utilizando um simples armazenamento de dados.
Tomei essa decisão para deixar o projeto mais fácil de rodar e mais leve.

### Validações
- Notas dos estudantes em um intervalo aceitável (0 à 10).
- Utilizei o aplicativo "Apidog" para testar a API.

Os ENDPOINTS testados foram:
- POST: Para adicionar alunos ao database interno (Você insere: "name", "grade")
- GET: Para ver a lista completa de alunos. (E recebe de retorno: "id", "name", "grade", "uniqueLetter")
- GET: Um GET extra para poder ver um aluno filtrando pelo seu id.


