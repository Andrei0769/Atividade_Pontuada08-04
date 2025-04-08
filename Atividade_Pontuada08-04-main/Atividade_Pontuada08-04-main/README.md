# API de Gerenciamento de Funcionários

## 📋 Descrição
API REST desenvolvida com Spring Boot para gerenciamento de funcionários, permitindo operações CRUD completas.

## 🛠 Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (ou seu banco de dados configurado)

## 🚀 Endpoints

### Boas-vindas
```
GET /
Response: "🚀Bem-vindo à API de Funcionários!"
```

### Informações do Desenvolvedor
```
GET /dev
Response: "Desenvolvidor: Andrei Luiz���‍💻😊"

### Funcionários

#### Criar Funcionário
```
POST /funcionarios
Response: 201 (Created)
```

#### Listar Funcionários
```
GET /funcionarios
Response: 200 (OK) ou 204 (No Content)
```

#### Buscar por ID
```
GET /funcionarios/{id}
Response: 200 (OK) ou 404 (Not Found)
```

#### Atualizar Funcionário
```
PUT /funcionarios/{id}
Response: 200 (OK) ou 400 (Bad Request)
```

#### Deletar Funcionário
```
DELETE /funcionarios/{id}
Response: 200 (OK) ou 404 (Not Found)
```

## 🔒 Validações
- Email único por funcionário
- Campos obrigatórios validados
- Tratamento de exceções personalizado

## 🌟 Funcionalidades
- CRUD completo de funcionários
- Validação de dados
- Mensagens personalizadas
- Tratamento de erros
- Cross-Origin habilitado

## 📥 Como Executar
1. Clone o repositório
2. Configure o banco de dados em `application.properties`
3. Execute: `mvn spring-boot:run`
4. Acesse: `http://localhost:8080`

## 👨‍💻 Autor
Desenvolvido por Andrei Luiz

## 📄 Licença
Este projeto está sob a licença [Publica]
