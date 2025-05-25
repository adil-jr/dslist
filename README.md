# 🎮 DSList - API de Coleção de Jogos

Uma API REST desenvolvida em Java com Spring Boot para gerenciamento e organização de coleções de jogos digitais.

## 📋 Sobre o Projeto

O **DSList** é uma aplicação backend que permite criar e gerenciar listas personalizadas de jogos, onde é possível visualizar informações detalhadas de cada jogo e reorganizá-los conforme sua preferência. O projeto foi desenvolvido utilizando uma arquitetura em camadas bem estruturada, seguindo as melhores práticas do Spring Framework.

A aplicação oferece uma API REST completa para operações CRUD, permitindo listar jogos, buscar por ID, gerenciar listas personalizadas e reordenar jogos dentro das listas.

## ⚡ Funcionalidades

- **✅ Listar todos os jogos cadastrados**
- **🔍 Buscar jogo específico por ID** 
- **📝 Visualizar listas de jogos organizadas**
- **🎯 Buscar jogos por lista específica**
- **🔄 Reordenar posições dos jogos nas listas**
- **📊 Exibir informações detalhadas dos jogos**

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot** - Framework principal
- **Spring Web** - Para criação da API REST
- **Spring Data JPA** - Camada de persistência
- **Hibernate** - ORM para mapeamento objeto-relacional
- **PostgreSQL** - Banco de dados em produção
- **H2 Database** - Banco de dados para testes
- **Maven** - Gerenciamento de dependências

## 🏗️ Arquitetura do Projeto

O projeto segue uma **arquitetura em camadas** (Layered Architecture):

```
├── Controllers (Camada de Apresentação)
├── Services (Camada de Negócio)  
├── Repositories (Camada de Acesso a Dados)
└── Entities (Camada de Domínio)
```

**Modelo Conceitual:**
- **Game** - Entidade principal dos jogos
- **GameList** - Listas de jogos organizadas
- **Belonging** - Relacionamento entre jogos e listas com posicionamento

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+
- PostgreSQL (para produção)

### Passos para execução

1. **Clone o repositório:**
```bash
git clone https://github.com/adil-jr/dslist.git
```

2. **Navegue até o diretório:**
```bash
cd dslist
```

3. **Execute a aplicação:**
```bash
./mvnw spring-boot:run
```

4. **Para executar os testes:**
```bash
mvn test
```

A aplicação estará disponível em: `http://localhost:8080`

## 📡 Endpoints da API

### **Games**

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `GET` | `/games` | Lista todos os jogos cadastrados |
| `GET` | `/games/{id}` | Busca jogo específico por ID |

### **Listas de Jogos**

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `GET` | `/lists` | Lista todas as listas de jogos |
| `GET` | `/lists/{id}/games` | Lista jogos de uma lista específica |
| `POST` | `/lists/{id}/replacement` | Altera posição de um jogo na lista |

### **Exemplo de Response - Lista de Jogos:**
```json
[
  {
    "id": 1,
    "title": "Mass Effect Trilogy",
    "year": 2007,
    "imgUrl": "https://example.com/img.jpg",
    "shortDescription": "Uma épica trilogia de RPG espacial"
  }
]
```

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/adiljr/dslist/
│   │       ├── controllers/     # Controladores REST
│   │       ├── dto/            # Data Transfer Objects  
│   │       ├── entities/       # Entidades JPA
│   │       ├── repositories/   # Repositórios de dados
│   │       ├── services/       # Lógica de negócio
│   │       └── projections/    # Projeções para consultas
│   └── resources/
│       ├── application.properties
│       └── import.sql          # Dados iniciais
└── test/                       # Testes automatizados
```

## 🎯 Conceitos Aplicados

Durante o desenvolvimento deste projeto, foram aplicados os seguintes conceitos:

- **Arquitetura em Camadas** - Separação clara de responsabilidades
- **API REST** - Implementação dos verbos HTTP corretamente
- **Injeção de Dependência** - Uso do Spring IoC Container
- **JPA/Hibernate** - Mapeamento objeto-relacional
- **Profile de Configuração** - Ambientes de teste, desenvolvimento e produção
- **DTO Pattern** - Transferência otimizada de dados
- **Repository Pattern** - Abstração da camada de dados

## 🔧 Perfis de Configuração

- **test** - Utiliza H2 Database em memória
- **dev** - PostgreSQL local para desenvolvimento  
- **prod** - PostgreSQL para ambiente de produção

---

⭐ **Desenvolvido como parte do aprendizado em Spring Boot e arquitetura de APIs REST**
