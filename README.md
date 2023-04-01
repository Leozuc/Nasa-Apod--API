# Nasa-Apod-API

![Badge em Confi](http://img.shields.io/static/v1?label=FUNCIONALIDADE&message=%20Receber%20fotos%20diárias%20e%20consultar%20imagens%20antecessoras%20ao%20dia%20atual%20&color=blueviolet&style=for-the-badge)


<div>

<h1 align="center"> Picture of the Day <img src="https://user-images.githubusercontent.com/101806906/229294885-5339f337-e9eb-4573-8fef-21fe6ed59708.png" height="90px" width="110px"/> </h1>
</div><bR>

  # :chart_with_downwards_trend: Funcionalidades do projeto
 Aplicativo em desenvolvimento para pessoas amantes de fotografias, podendo publicar lindas imagens diariamente e consulta-las quando quiser!
 Tradução: Uma biblioteca Java para acessar a API Picture of the Day (APOD) baseada em HTTP. Esta aplicação está disponivel para celulares antigos e modernos.
  <br><br>
 **Dupla:** Eduardo Andreolli e Leonardo Mazzuco | 3° DS | Programação Mobile (**Prof°:** Aline Firmino Brito)<br>

<bR>
  

* [URL da Documentação](#1)
* [URL de Acesso](#2)
* [Métodos Disponíveis (endpoints) e indicação de qual/quais serão implementados na aplicação](#3)
* [Atributos/parâmetros solicitados por cada método](#4)
* [Dados retornados para cada método (Dicionário de dados)](#5)

  <br>
  
 <h3> <b>🖇️ URL da Documentação:</b></h3>
 https://github.com/nasa/apod-api<br>
 
 <bR>
 
   <h3>  📎<b> URL da Documentação:</b></h3>
 https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY<br>

# :hammer: Métodos disponíveis

- `apod_object_parser.get_dat 1`: a get_date função pega o dicionário que obtivemos acima e retorna a data.
- `apod_object_parser.get_explaination`: a get_explaination função pega o dicionário que obtivemos acima e retorna a explicação.
- `apod_object_parser.get_hdurl`: a get_hdurl função pega o dicionário que obtivemos acima e retorna a url de alta definição da imagem.
- `apod_object_parser.get_media_type`: a get_media_type função pega o dicionário que obtivemos acima e retorna o tipo de mídia do arquivo (pode ser um vídeo de uma imagem).
- `apod_object_parser.get_title`: a get_title função pega o dicionário que pegamos acima e retorna o título da imagem.
- `apod_object_parser.get_url`:a get_url função pega o dicionário que obtivemos acima e retorna a url de definição padrão da imagem.





