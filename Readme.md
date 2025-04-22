# Proyecto Vehículo - ICB0005-UF2-PR01

Este proyecto consiste en el desarrollo colaborativo de una clase *Vehículo* siguiendo la metodología de **Test Driven Development (TDD)**, utilizando **Java**, **JUnit 5**, **Git**, **GitHub** y **GitHub Actions**.

## Objetivos

- Aplicar buenas prácticas de desarrollo con control de versiones y colaboración en equipo.
- Diseñar y testear una clase Java simulando el comportamiento de un vehículo.
- Automatizar la ejecución de pruebas unitarias.
- Gestionar el flujo de trabajo con Pull Requests, revisiones y protección de ramas.

## Requisitos funcionales
La clase *Vehiculo* contará con los siguientes **atributos**:
- String marca
- String modelo
- int velocidadActual
- int velocidadMaxima

Y los siguientes **métodos**:

- `void acelerar(int incremento)`  
  Incrementa la velocidad actual sin superar la velocidad máxima.

- `void frenar(int decremento)`  
  Disminuye la velocidad actual, sin ser menor que 0.

- `void parar()`  
  Establece la velocidad actual a 0.

- `boolean esDeportivo()`  
  Devuelve `true` si la velocidad máxima es mayor o igual a 180 km/h.

- `Getters y Setters` según necesidad.

## Tabla de Testing

| Método      | Nombre del Test            | Descripción                             | Datos de Entrada       | Resultado Esperado           |
|-------------|----------------------------|-----------------------------------------|-------------------------|------------------------------|
| acelerar    | test_acelerar_normal        | Aumentar velocidad dentro del límite    | incremento = 20         | velocidad_actual += 20       |
| acelerar    | test_acelerar_supera_max    | Supera velocidad máxima                 | incremento = 300        | velocidad_actual = max       |
| frenar      | test_frenar_normal          | Reduce velocidad sin llegar a 0         | decremento = 10         | velocidad_actual -= 10       |
| frenar      | test_frenar_bajo_cero       | Reduce más de la velocidad actual       | decremento = 100        | velocidad_actual = 0         |
| parar       | test_parar                  | Detener vehículo                        | -                       | velocidad_actual = 0         |
| esDeportivo | test_es_deportivo_true      | Deportivo si velocidad > 200            | velocidad_maxima = 250  | true                         |
| esDeportivo | test_es_deportivo_false     | No deportivo si velocidad ≤ 200         | velocidad_maxima = 180  | false                        |

## Flujo de trabajo
- Desarrollo basado en TDD: primero se escriben los tests, luego se implementa la funcionalidad.
- Cada funcionalidad se desarrolla en una rama distinta.
- Las PRs deben ser revisadas por un otro miembro del equipo antes de hacer merge.
- GitHub Actions ejecuta los tests automáticamente al hacer PR.

## Miembros del equipo
- Alice Aliaga 
- Ariadna Perez
- Yaqueline Alcaraz

--------------------------------------------------------------------------------------------------------------------
Incrementaremos este README a medida que avancemos con el desarrollo del proyecto.
