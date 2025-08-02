# Contenido Audiovisual

## Descripción

Este proyecto gestiona diferentes tipos de contenidos audiovisuales (Películas, Series de TV, Documentales), así como actores, temporadas e investigadores. Se implementó un sistema en Java con principios de código limpio, refactorización, y patrones SOLID para mejorar la mantenibilidad y calidad del código. Además, se aplicó el patrón MVC para separar la lógica, la vista y el modelo.

## Cambios realizados

- Manejo de archivos: Métodos para lectura y escritura de datos CSV para todos los tipos de contenido y entidades.
- Refactorización: Código dividido en métodos pequeños, con nombres claros y eliminación de duplicados.
- Principios SOLID: Se aseguró que cada clase tenga una única responsabilidad, se usaron interfaces para abstracción y se separaron responsabilidades según ISP y DIP.
- Patrón MVC: Separación clara entre modelo (clases de negocio), vista (interfaz de consola) y controlador (lógica y coordinación).
- Pruebas unitarias: Cobertura completa con JUnit para clases principales, incluyendo casos normales y casos límite.

## Estructura del proyecto

ContenidoAudiovisual/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/audiovisual/
│   │   │   │   ├── modelo/             # Clases del modelo (Película, SerieTV, Documental, Actor, Temporada, Investigador)
│   │   │   │   ├── utils/              # Utilidades para manejo de archivos (ArchivoUtils)
│   │   │   │   ├── vista/              # Vista en consola (ConsolaVista)
│   │   │   │   ├── controlador/       # Controlador que coordina modelo y vista (ContenidoController)
│   │   │   │   └── Main.java           # Clase principal para ejecutar la aplicación
│   ├── test/
│   │   ├── java/
│   │   │   ├── com/audiovisual/
│   │   │   │   ├── modelo/             # Pruebas unitarias para modelos
│   │   │   │   ├── utils/              # Pruebas unitarias para utilidades
│   │   │   │   └── controlador/       # Pruebas unitarias para controladores

├── contenidos.csv                       # Archivo de ejemplo para contenidos audiovisuales
├── actores.csv                         # Archivo de ejemplo para actores
├── temporadas.csv                      # Archivo de ejemplo para temporadas
├── investigadores.csv                  # Archivo de ejemplo para investigadores
├── README.md                          # Documentación del proyecto

## Cómo clonar y ejecutar el proyecto

1. Clonar el repositorio:

git clone https://github.com/tuusuario/ContenidoAudiovisual.git
cd ContenidoAudiovisual

2. Abrir el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, VSCode con soporte Java).

3. Asegúrate de tener instalado Java JDK 11 o superior.

4. Compilar y ejecutar la clase principal:

- En IntelliJ o Eclipse: Ejecuta la clase com.audiovisual.Main.
- Por consola:

javac -d out src/main/java/com/audiovisual/**/*.java
java -cp out com.audiovisual.Main

## Cómo ejecutar las pruebas unitarias

### Con Maven (si usas Maven)

mvn test

### Sin Maven (usando JUnit 5 en el IDE)

- Abre la carpeta src/test/java.
- Ejecuta las pruebas unitarias desde el IDE (clic derecho → Run Tests).

### Ejemplo por consola usando JUnit Platform Console Launcher

1. Descarga el JUnit platform console launcher jar.
2. Ejecuta:

java -jar junit-platform-console-standalone-1.9.3.jar -cp out --scan-class-path


