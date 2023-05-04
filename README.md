# Nasa-Apod-API

![Badge em Confi](http://img.shields.io/static/v1?label=FUNCIONALIDADE&message=%20Receber%20fotos%20diárias%20e%20consultar%20imagens%20antecessoras%20ao%20dia%20atual%20&color=blueviolet&style=for-the-badge)


<div>

<h1 align="center"> Picture of the Day <img src="https://user-images.githubusercontent.com/101806906/229294885-5339f337-e9eb-4573-8fef-21fe6ed59708.png" height="110px" width="130px"/> </h1>
</div><bR>

  # :chart_with_downwards_trend: Funcionalidades do projeto
 Aplicativo em desenvolvimento para pessoas amantes de fotografias, podendo publicar lindas imagens diariamente e consulta-las quando quiser!
 Tradução: Uma biblioteca Java para acessar a API Picture of the Day (APOD) baseada em HTTP. Esta aplicação está disponivel para celulares antigos e modernos.
  <br><br>
 **Dupla:** Eduardo Andreolli e Leonardo Mazzuco | 3° DS | Programação Mobile (**Prof°:** Aline Firmino Brito)<br>

<bR>
  

  <details open="sumarioo"><br>
 <summary><b>Sumário:</summary></b>
  
- [URL da Documentação](#1)
- [URL de Acesso](#2)
- [Métodos Disponíveis (endpoints) e indicação de qual/quais serão implementados na aplicação](#3)
- [Atributos/parâmetros solicitados por cada método](#4)
- [Dados retornados para cada método (Dicionário de dados)](#5)

</details>
  
  <br>
  
 <h3> <b>🖇️ URL da Documentação:</b></h3>
 https://github.com/nasa/apod-api<br>
 
 <bR>
 
   <h3>  📎<b> URL de Acesso:</b></h3>
 https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY<br>


 <h3> <b> 📔	 Métodos disponíveis</b></h3>

- `apod_object_parser.get_dat 1`: a get_date função pega o dicionário que obtivemos acima e retorna a data.
- `apod_object_parser.get_explaination`: a get_explaination função pega o dicionário que obtivemos acima e retorna a explicação.
- `apod_object_parser.get_hdurl`: a get_hdurl função pega o dicionário que obtivemos acima e retorna a url de alta definição da imagem.
- `apod_object_parser.get_media_type`: a get_media_type função pega o dicionário que obtivemos acima e retorna o tipo de mídia do arquivo (pode ser um vídeo de uma imagem).
- `apod_object_parser.get_title`: a get_title função pega o dicionário que pegamos acima e retorna o título da imagem.
- `apod_object_parser.get_url`: a get_url função pega o dicionário que obtivemos acima e retorna a url de definição padrão da imagem.


<br>
 <h3> <b>💾 Pâramentros soliciatos por cada método </b></h3>


- `api_key`: Demonstração: DEMO_KEY | https://api.nasa.gov/#signUp
- `date`: É uma STRING no formado AAAA-MM-DD - exemplo: 2023-14-01. 
- `concept_tags`: É um BOOLEANO True | False a qual indica se as tags devem ser retornadas com o restante da resposta. Seu padrão é Falso.
- `hd`: É um parâmetro BOOLEANO True | Falso a qual indica se as imagens de alta resolução podem ou não serem retornadas, são retornados independemente. 
- `count`: Número INTEIRO positivo > 100, não pode ser utilizado com date e nem variantes. 
- `thumbs`: É um parâmetro BOOLEANO True | False o qual indica se a API deve retornar um URL da imagem.

<br>
    <h3> <b>📼 Dados retornados para cada atributo. </b></h3>
  
- `resource `: Um dicionáriaa que descreve o image.
- `title `:O título da image.
- `date`: Data da imagem e a resposta dos valores.
- `URL`: A URL da imagem APOD do dia.
- `hdurl`: A URL de qualquer imagem com alta resolução, caso tenha.
- `media_type `: O tipo de mídia (dados) refornado.
- `explanation `: Conceito do texto fornecido pela imagem; 
- `copyright `: O nome do detentor dos direitos autorais.
   
   <br>
   
  <br>
  
 <h3>  📂  Diagrama de Classes e Banco de Dados</h3>
    

<details close="classe">
  
  
<summary><b>Diagrama de Classes</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101806906/236333540-a177615d-d392-4181-8856-78278e4c858d.png" heigth="800px" width="1000px"/></h1>
  </details>
<details close="classe">

  <summary><b>Diagrama de Banco de Dados</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101806906/236333781-351b50b2-5cfb-44c1-82ca-3d90379c73d6.png" heigth="800px" width="1000px"/></h1>
</details>

   
   <br>
   
   
  ## :chart_with_downwards_trend:   Protótipo - Mapa de Navegação e suas respectivas funcionalidades:
<br>
<details close="Mapa"> 
  
<summary><b>Protótipo:</summary></b>
  
  <h3> Visualização do Protótipo: https://www.figma.com/file/BollsJOdyP4N2FE1RkYp7M/Untitled?node-id=0-1&t=yyswIDWRms1SFtfF-0
    
  </h3> <BR><BR>
<h1 align="center"><img src= "" heigth="800px" width="1000px"/></h1>
  
  
  </details>
   
   ![Tela - Boa Vindas](https://user-images.githubusercontent.com/101806906/236351212-2041bde1-dc0d-43ad-80af-d283f8e7f46d.png)
![Telas - _Splash_](https://user-images.githubusercontent.com/101806906/236351222-a5abb3b2-9207-4171-8d5a-5feb8cd3bdc2.png)
![Tela - Cadastro](https://user-images.githubusercontent.com/101806906/236351224-70c9b065-4c5a-499a-a92c-d2ef1c0f6ae6.png)
![Tela - Consulta API](https://user-images.githubusercontent.com/101806906/236351225-e2110450-f9cc-436e-943a-46275cbf5f1e.png)
![Tela - Detalhada](https://user-images.githubusercontent.com/101806906/236351228-155cfa42-4abd-4650-83b4-2d8488548ee5.png)
![Tela - Favoritos](https://user-images.githubusercontent.com/101806906/236351230-9ebaa95f-8126-4745-8c39-e5be76c2ff04.png)
![Tela - Home](https://user-images.githubusercontent.com/101806906/236351231-4100aeb6-5aff-4b97-b6f8-f39674a57504.png)
![Tela - Login](https://user-images.githubusercontent.com/101806906/236351233-63767aaf-f138-42a6-a73d-a63709575c4b.png)
![Tela - Resultado](https://user-images.githubusercontent.com/101806906/236351236-eb157dd3-a684-4e02-baf2-ac3cc03a6bd6.png)
![Tela - Usuário](https://user-images.githubusercontent.com/101806906/236351238-47b434fe-6e74-4eeb-ae80-2d6b7b3f3c4e.png)


   
 <details close="Mapa"> 
  
<summary><b>Mapa de Navegação:</summary></b>
<h1 align="center"><img src= "" heigth="800px" width="1000px"/></h1>
  </details>
   
   <details close="Mapa"> 
  
<summary><b>Descrição e funcionalidades da aplicação:</summary></b>
     <h3 <i class="devicon-firebase-plain"></i>>mete o texto aq</h3><BR><BR>
  </details>
   
  <br>
  
  

  ## ✅ Será usado:
   - `Java `
   - `Android `
   - `Paradigma de orientação a objetos `
   
  

   
   


