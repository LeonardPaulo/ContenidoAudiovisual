# Sistema de Contenido Audiovisual

## Descripción

Aplicación Java para la gestión y manipulación de contenidos audiovisuales, incluyendo películas, series de televisión, documentales, actores, temporadas e investigadores. El sistema está diseñado siguiendo principios de código limpio, refactorización y los principios SOLID, implementando el patrón de diseño Modelo-Vista-Controlador (MVC) y asegurando la calidad mediante pruebas unitarias con JUnit.

## Funcionalidades

- Carga de contenidos audiovisuales desde un archivo CSV.
- Almacenamiento actualizado de los contenidos en archivo CSV.
- Gestión y visualización de películas, series de TV y documentales.
- Incorporación de actores, temporadas e investigadores.
- Interfaz de usuario en consola para interactuar con el sistema.
- Implementación de código limpio y principios SOLID para mejorar la mantenibilidad.
- Pruebas unitarias completas que aseguran el correcto funcionamiento.

## Requisitos Previos

- JDK 17 o superior instalado.
- Maven configurado para gestión de dependencias.
- IntelliJ IDEA recomendado como IDE para facilitar ejecución y pruebas.

## Instalación y Ejecución

1. Clonar o descargar el repositorio.
2. Colocar el archivo `contenidos.csv` en la raíz del proyecto.
3. Abrir el proyecto en IntelliJ IDEA.
4. Compilar el proyecto usando Maven:
   mvn clean install
5. Ejecutar la clase principal `Main` ubicada en `com.audiovisual`.
6. Interactuar con la aplicación a través del menú en consola.

## Ejecución de Pruebas Unitarias

Para validar el correcto funcionamiento del sistema:

- Ejecutar las pruebas JUnit ubicadas en `src/test/java`.
- Desde IntelliJ IDEA: Clic derecho en la carpeta `test` → `Run Tests`.
- Desde consola con Maven:
  mvn test
