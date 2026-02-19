# ***Sistema de Controle de Versão***

1. ## Configuração inicial para uso do Git
 - ### Configuração de nome de usuário e e-mail no Git
Para que o usuário possa fazer commit de seu projeto é necessário que ele defina um nome de usuário e um e-mail. Assim, dessa forma é possível reconhecer quem foi o indivíduo que realizou o commit.

Para configurar isso, é necessário abrir o Terminal (ou o terminal do Git caso esteja no Windows) e escrever o seguinte:

```bash
git config --global user.name "Seu nome Completo"

git config --global user.email "seu-email@example.com"
```

- ### Criando Personal Access Token (PAT) no GitHub
o Personal Acess Token (PAT) é uma alternativa às senhas normais, que visa gerar maior segurança ao seu repositório do Github. É uma maneira de prevenir que pessoas desconhecidas que não eram para ter acesso ao repositório, façam mudanças no projeto.

Para criar um PAT, você deve fazer login no github e realizar os seguintes passos:

1. No canto superior direito, clique na imagem de perfil;
2. Vá em **Settings**;
3. Olhe para barra lateral esquerda, desça até o final e vá em **Developers Settings**;
4. Vá em **Personal acess tokens** > **Tokens (classic)**;
5. Vá em **Generate new token** > escolha a opção que lhe interessa
6. Insira seu Passkey ou senha do Github;
7. Dê um nome ao Token, defina a data que o token va expirar, selecione as opções que se aplicam a você.
8.  Por fim clique no botão verde escrito **Generate token**.

- ### Salvar em cache as credenciais do PAT
É importante salvar em cache suas credenciais do PAT para que possa manter a segurança do seu repositório/projeto atualizada.

Para salvar em cache suas credenciais por 1 hora é preciso abrir o terminal e escrever o seguinte:

```bash
#Para salvar as credenciais escreva isso (Padrão 15 minutos)
git config --global credential.helper cache

#Caso queira aumentar o tempo para 1 hora, escreva:
git config --global credential.helper 'cache --timeout=3600'

#Observação: caso queira salvar as credennciais de apenas um repositório, apenas remova "--global".
```

2. ## Qual a diferença entre git merge e git rebase?
A diferença entre os dois é:

O git merge, faz um novo commit que integra as alterações feitas numa branch mas preservando o histórico de desenvolvimento original.

Já o git rebase reescreve o histórico do projeto, onde ele move todo o conteúdo da sua branch para o último commit da branch de destino, dessa forma ele produz um histórico linear.

O Recomendado quando se está trabalhando em equipe é utilizar o git merge pois preserva todo o histórico de alterações feitas no projeto.

Já o git rebase é apropriado quando quiser limpar o histórico de uma branch local antes de fundi-la à principal, porém é mais arriscado e pode ser destrutivo quando usado em projetos públicos ou compartilhados.