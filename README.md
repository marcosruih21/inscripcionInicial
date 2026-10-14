# Plantilla inicial: inscripción a una actividad

Proyecto mínimo para la práctica de consolidación de Desarrollo de Interfaces.
Incluye Java 21, JavaFX 21.0.12, Maven y una ventana con una etiqueta.

## 1. Importar en Eclipse

1. Descomprime el ZIP en una carpeta de trabajo. No trabajes dentro del ZIP.
2. En Eclipse: File > Import > Maven > Existing Maven Projects.
3. En Root Directory selecciona la carpeta `inscripcion-inicial` que contiene `pom.xml`.
4. Selecciona el proyecto y pulsa Finish. Espera a que Maven descargue las dependencias.

No necesitas instalar el SDK de JavaFX ni Maven por separado si tu Eclipse ya tiene integración Maven.
La primera ejecución necesita conexión a Internet para descargar las dependencias que falten.

## 2. Ejecutar

1. Clic derecho en el proyecto > Run As > Maven build…
2. En Goals escribe: `clean javafx:run`.
3. En la pestaña JRE selecciona el JDK 21 instalado (Alternate JRE).
4. Pulsa Apply y después Run.

La ventana debe mostrar «Mi aplicación de inscripción».
Para repetir: Run > Run Configurations > Maven Build y selecciona esta configuración guardada.
No ejecutes App mediante Run As > Java Application.

Si no aparece el JDK: Window > Preferences > Java > Installed JREs > Add > Standard VM,
selecciona su carpeta de instalación y vuelve a elegirlo en la configuración Maven.
El pom hace que la aplicación use el mismo Java con el que se ejecuta Maven.

## 3. Trabajar en la práctica

- Abre `src/main/resources/es/aula/inscripcion/inicio.fxml` desde Scene Builder (File > Open).
- Construye la bienvenida y crea la segunda vista en esa misma carpeta de recursos.
- Crea tus controladores dentro de `src/main/java/es/aula/inscripcion`.
- Añade tu hoja CSS junto a los FXML y enlázala desde las vistas o desde la Scene.
- Guarda en Scene Builder y actualiza el proyecto con F5 en Eclipse si fuera necesario.
- Ejecuta después de cada cambio importante.

La plantilla no incluye controlador, navegación, formulario ni CSS resueltos.
El FXML inicial no necesita controlador porque solo muestra una etiqueta.
Cuando añadas eventos, crea el controlador y asigna su nombre completo en Scene Builder.
Si conservas el paquete y la clase App no necesitas modificar el pom.xml.

## 4. Git y entrega

El ZIP no contiene un repositorio Git. Inicializa uno en esta carpeta con el procedimiento
utilizado en clase (en Eclipse: Team > Share Project > Git).
Haz un primer commit de la plantilla y otro significativo al finalizar cada sesión.
Entrega el proyecto sin la carpeta target. Completa este README con:

- Nombre del alumno: Marcos Ruiz Haro

- Temática elegida: Videojuegos

- Funcionalidades realizadas y pendientes: Pantalla de bienvenida y acceso al formulario, Formulario con nombre, modalidad, fecha, casilla adicional y observaciones.
, Resumen actualizado con los valores actuales,navegación entre vistas en la misma ventana.  
  No quedan funcionalidades pendientes pero si se podria mejorar el diseño de la pantalla principal

- Comprobación por un compañero y mejora realizada: El compañero no ha tenido muchas dificultades. He mejorado un boton qye tenia poca visibilidad y poco mas.

- Uso de IA, si lo ha habido:Se ha utilizado ChatGPT como apoyo para organizar la memoria y planificar los pasos de implementación. El código final se ha revisado, probado y adaptado al proyecto de clase.

Referencia de configuración: https://openjfx.io/openjfx-docs/
