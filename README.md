<h1 style="text-align:center">El telegrama más corto</h1>

<div style="text-align: center; background-color:#EDEDED; border:1px solid black; border-top:3px solid black"><small>Tiempo máximo: 2,000 s</small><span style="padding:3em"></span><small>Memoria máxima: 4096 KiB</small></div>

Aunque hoy su uso está en horas bajas, el sistema de telégrafo fue el medio principal de comunicación durante el final del siglo XIX y la primera mitad del XX [^time]. Para enviar letras y símbolos, se utilizaba código Morse, que codificaba cada elemento como una sucesión de puntos y rayas [^pdf]. Al menos esa es la creencia popular porque, en realidad, ambos son meros "pitidos" enviados por un cable con la característica de que el pitido asociado a una raya es tres veces más largo que el de un punto. Se conocen como puntos y rayas porque, en el receptor, esos pitidos ocasionaban perforaciones en una cinta de papel en movimiento, lo que originaba zonas rasgadas cortas (puntos) y largas (rayas).

<div style="text-align:center"><img width="279" height="350" src="images/morse.png" alt="Italian Trulli"></div>

El sistema era tan artesanal que el servicio se pagaba por número de palabras enviadas. Eso creó un lenguaje propio del telegrama, evitando palabras superfluas e incorporando abreviaturas particulares, como ocurriría mucho tiempo después con otras tecnologías como los SMS o Twitter.

Dice la leyenda que el telegrama más corto de la historia lo envió Victor Hugo. Pese a ser amante del subjuntivo, las frases subordinadas y los libros largos, cuando llegó el momento de preguntar por telegrama a su editor cómo estaban yendo las ventas de su recién publicado libro "Los miserables", decidió dejar su rimbombante prosa para otra ocasión y envió un simple "?".

Para saber si realmente Victor Hugo envió el telegrama más corto de la historia hay que recurrir a la foto finish. Su editor, a la vista de las buenas ventas del libro, le respondió con un simple "!".

## Entrada

La entrada comienza con un número indicando cuántos casos de prueba deberán ser procesados.

A continuación aparece una línea por cada caso de prueba, conteniendo una frase de no más de 80 letras mayúsculas del alfabeto inglés, signos de admiración e interrogación y espacios. Se garantiza que no aparecen dos espacios seguidos, y que la línea no empieza ni termina en espacio.

## Salida

Por cada caso de prueba el programa escribirá la duración en puntos del telegrama. Según la publicación de 1922 del estándar del código Morse, una raya dura tres puntos, entre símbolo y símbolo (raya o punto) de una misma letra hay que esperar un punto, la separación temporal entre letras son tres puntos, y la separación entre palabras cinco.

## Entrada de ejemplo

![Editor preferences pane](images/entrada.png)

## Salida de ejemplo

![Editor preferences pane](images/salida.png)

## Lenguaje empleado

<svg viewBox="-175 0 500 128">
<path fill="#0074BD" d="M52.581 67.817s-3.284 1.911 2.341 2.557c6.814.778 10.297.666 17.805-.753 0 0 1.979 1.237 4.735 2.309-16.836 7.213-38.104-.418-24.881-4.113zm-2.059-9.415s-3.684 2.729 1.945 3.311c7.28.751 13.027.813 22.979-1.103 0 0 1.373 1.396 3.536 2.157-20.352 5.954-43.021.469-28.46-4.365z"></path><path fill="#EA2D2E" d="M67.865 42.431c4.151 4.778-1.088 9.074-1.088 9.074s10.533-5.437 5.696-12.248c-4.519-6.349-7.982-9.502 10.771-20.378.001 0-29.438 7.35-15.379 23.552z"></path><path fill="#0074BD" d="M90.132 74.781s2.432 2.005-2.678 3.555c-9.716 2.943-40.444 3.831-48.979.117-3.066-1.335 2.687-3.187 4.496-3.576 1.887-.409 2.965-.334 2.965-.334-3.412-2.403-22.055 4.719-9.469 6.762 34.324 5.563 62.567-2.506 53.665-6.524zm-35.97-26.134s-15.629 3.713-5.534 5.063c4.264.57 12.758.439 20.676-.225 6.469-.543 12.961-1.704 12.961-1.704s-2.279.978-3.93 2.104c-15.874 4.175-46.533 2.23-37.706-2.038 7.463-3.611 13.533-3.2 13.533-3.2zM82.2 64.317c16.135-8.382 8.674-16.438 3.467-15.353-1.273.266-1.845.496-1.845.496s.475-.744 1.378-1.063c10.302-3.62 18.223 10.681-3.322 16.345 0 0 .247-.224.322-.425z"></path><path fill="#EA2D2E" d="M72.474 1.313s8.935 8.939-8.476 22.682c-13.962 11.027-3.184 17.313-.006 24.498-8.15-7.354-14.128-13.828-10.118-19.852 5.889-8.842 22.204-13.131 18.6-27.328z"></path><path fill="#0074BD" d="M55.749 87.039c15.484.99 39.269-.551 39.832-7.878 0 0-1.082 2.777-12.799 4.981-13.218 2.488-29.523 2.199-39.191.603 0 0 1.98 1.64 12.158 2.294z"></path><path fill="#EA2D2E" d="M94.866 100.181h-.472v-.264h1.27v.264h-.47v1.317h-.329l.001-1.317zm2.535.066h-.006l-.468 1.251h-.216l-.465-1.251h-.005v1.251h-.312v-1.581h.457l.431 1.119.432-1.119h.454v1.581h-.302v-1.251zm-44.19 14.79c-1.46 1.266-3.004 1.978-4.391 1.978-1.974 0-3.045-1.186-3.045-3.085 0-2.055 1.146-3.56 5.738-3.56h1.697v4.667h.001zm4.031 4.548v-14.077c0-3.599-2.053-5.973-6.997-5.973-2.886 0-5.416.714-7.473 1.622l.592 2.493c1.62-.595 3.715-1.147 5.771-1.147 2.85 0 4.075 1.147 4.075 3.521v1.779h-1.424c-6.921 0-10.044 2.685-10.044 6.723 0 3.479 2.058 5.456 5.933 5.456 2.49 0 4.351-1.028 6.088-2.533l.316 2.137h3.163v-.001zm13.452 0h-5.027l-6.051-19.689h4.391l3.756 12.099.835 3.635c1.896-5.258 3.24-10.596 3.912-15.733h4.271c-1.143 6.481-3.203 13.598-6.087 19.688zm19.288-4.548c-1.465 1.266-3.01 1.978-4.392 1.978-1.976 0-3.046-1.186-3.046-3.085 0-2.055 1.149-3.56 5.736-3.56h1.701v4.667h.001zm4.033 4.548v-14.077c0-3.599-2.059-5.973-6.999-5.973-2.889 0-5.418.714-7.475 1.622l.593 2.493c1.62-.595 3.718-1.147 5.774-1.147 2.846 0 4.074 1.147 4.074 3.521v1.779h-1.424c-6.923 0-10.045 2.685-10.045 6.723 0 3.479 2.056 5.456 5.93 5.456 2.491 0 4.349-1.028 6.091-2.533l.318 2.137h3.163v-.001zm-56.693 3.346c-1.147 1.679-3.005 3.008-5.037 3.757l-1.989-2.345c1.547-.794 2.872-2.075 3.489-3.269.532-1.063.753-2.43.753-5.701V92.891h4.284v22.173c0 4.375-.348 6.144-1.5 7.867z"></path>
</svg>
          

--

[🛜 Aquí puedes encontrar el sitio web oficial donde se encuentra este reto.](https://aceptaelreto.com/pub/problems/v006/37/st/statements/Spanish/index.html)

[^time]: Hoy en día, en muchos países el servicio de telégrafos, directamente ya no existe. En España se mantiene por su valor legal al dejar constancia de su envío y de su contenido, igual que los burofaxes.
[^pdf]: Esto ya tampoco es cierto. Hoy los "telegramas" son documentos PDF firmados digitalmente que viajan por redes de datos.