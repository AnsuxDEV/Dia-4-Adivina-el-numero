# 🎮 Día 4 – Juego "Adivina el número"

# 📌 Descripción

Este proyecto consiste en un juego interactivo en consola donde el programa genera un número aleatorio entre 1 y 100, y el usuario debe adivinarlo.
El programa ofrece pistas (“más alto” o “más bajo”) y cuenta los intentos hasta que el número es acertado. Al finalizar, se puede jugar otra partida.

# 🧱 Funcionalidades

- Generación de un número aleatorio entre 1 y 100.
- Entrada de intentos por parte del usuario con validación de números.
- Pistas dinámicas: indica si el número secreto es mayor o menor.
- Contador de intentos con mensajes personalizados según el desempeño.
- Posibilidad de jugar múltiples partidas sin reiniciar el programa.

# 🧠 Aprendizajes
- Uso de la clase Random para generar números aleatorios.
- Manejo de bucles while con condiciones de salida.
- Validación de entradas con Scanner (hasNextInt).
- Control de flujo con variables booleanas (acertar, again).
- Personalización de mensajes según número de intentos.

# ▶️ Ejemplo de ejecución

¡Bienvenido a 'Adivina el número'!

Ya tengo mi número entre 1 y 100... ¿Podrás adivinarlo?

Intento 1:
50

El número es más alto 📈

Intento 2:
75

El número es más bajo 📉

Intento 3:
63

¡Enhorabuena! Me has pillado...

El número era 63

Has tardado 3 intentos

¡Guau! ¡Increíble!

¿Quieres jugar otra partida? 's' para SI o cualquier otra tecla para NO


# 📌 Próximos pasos
- Añadir niveles de dificultad (ej. rango 1–50, 1–500).
- Guardar historial de partidas en archivo.
- Mensajes especiales si se acierta en el primer intento.


