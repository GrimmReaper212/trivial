# trivial

## Problema 0

Extraemos el código duplicado a un método "nuevaPosicionJugador",
al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_un_1_voy_a_casilla_1"

## Problema 1
Creamos un if (esJugable()) en la clase GameLauncher que comprueba
si hay 2 o más jugadores.

Creamos test unitario "problema1"

## Problema 2
Creamos varios try catch para que cuando haya más de 6 jugadores, 
no continúe la partida y aparezca un mensaje explicando la situación
a los queridos jugadores.

Creamos test unitario "problema2"

## Problema 3
Cambiamos el valor del booleano está en la carcel para que en caso de
sacar un número impar salga de ella (no sólo que nos diga que ha salido,
si no que salga de verdad).

## Problema 4
Invertimos la lógica de noGanador = false con un ! en los métodos.

## Problema 5
Simplificamos el código intangible a algo más simple extrayendo
código duplicado a un nuevo método llamado "pasarSiguienteJugador"

## Problema 6
Simplificamos código nuevamente, parece que se entiende algo mejor,
lo hemos extraído al método "loHaDichoBien"

## Problema 7
Añadimos un do while en el método de las preguntas para que, en caso
de que se acaben, siga preguntando hasta que gane alguien.

