# Implementación de un Sistema de Procesamiento de Eventos Reactivo

En un sistema de gestión de pagos, el originador de créditos necesita procesar eventos de pagos entrantes de múltiples canales (tarjeta, transferencia, billetera digital) de manera reactiva. Los eventos deben ser procesados en tiempo real, manteniendo la resiliencia, escalabilidad y confiabilidad del sistema. Los eventos de pago deben ser validados (monto positivo, cuenta existente) y persistidos con garantía de idempotencia (clave: número de operación + canal). El sistema debe ser capaz de manejar backpressure y recuperarse automáticamente de fallos temporales en servicios externos (timeout del buró de riesgos >2s, respuesta 5xx del core bancario).

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del Entorno de Procesamiento de Eventos

**Objetivo:** Establecer un entorno capaz de recibir y procesar eventos de pago de manera reactiva.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configura un sistema que pueda recibir eventos de pago desde tres canales diferentes (tarjeta, transferencia, billetera digital).
- Implementa la validación básica de los eventos (monto positivo, cuenta existente).
- Persiste cada evento con garantía de idempotencia utilizando el número de operación y el canal como clave.

**Entregable:** Entorno de procesamiento de eventos operativo que recibe, valida y persiste eventos de pago con idempotencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar la concurrencia y la persistencia de eventos en un sistema reactivo.
- Piensa en cómo garantizar que cada evento se procese una sola vez, incluso en caso de reintentos.

</details>

### Fase 2: Manejo de Backpressure y Recuperación de Fallos

**Objetivo:** Implementar mecanismos para manejar la backpressure y recuperarse de fallos temporales en servicios externos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa mecanismos para manejar la backpressure en el sistema de procesamiento de eventos.
- Configura el sistema para que se recupere automáticamente de fallos temporales en servicios externos (timeout del buró de riesgos >2s, respuesta 5xx del core bancario).

**Entregable:** Sistema de procesamiento de eventos que maneja backpressure y se recupera automáticamente de fallos temporales en servicios externos.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga estrategias para manejar la backpressure en sistemas reactivos.
- Considera cómo implementar mecanismos de reintento y recuperación en caso de fallos temporales.

</details>

### Fase 3: Optimización y Escalabilidad

**Objetivo:** Optimizar el sistema para mejorar su escalabilidad y rendimiento.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identifica y elimina cuellos de botella en el sistema de procesamiento de eventos.
- Implementa mejoras para aumentar la escalabilidad y el rendimiento del sistema.

**Entregable:** Sistema de procesamiento de eventos optimizado para mayor escalabilidad y rendimiento.

<details>
<summary>Pistas de conocimiento</summary>

- Analiza el flujo de eventos y identifica áreas de mejora.
- Considera estrategias para mejorar la concurrencia y el procesamiento paralelo de eventos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y cómo se aplica en el procesamiento de eventos?
- **paraQueSirve**: ¿Para qué sirve manejar la backpressure en un sistema reactivo?
- **comoSeUsa**: ¿Cómo se usa la idempotencia para garantizar la consistencia en la persistencia de eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema reactivo y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la elección de estrategias para recuperarse de fallos temporales en servicios externos?

## Criterios de Evaluacion

- Configuración de un entorno de procesamiento de eventos operativo.
- Implementación de validaciones y persistencia de eventos con idempotencia.
- Manejo de backpressure y recuperación de fallos temporales en servicios externos.
- Optimización del sistema para mejorar la escalabilidad y el rendimiento.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
