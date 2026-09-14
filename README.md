# ☕ Java MVC — Gestión de Tareas

Proyecto educativo desarrollado en **Java** para comprender e implementar el patrón arquitectónico **MVC (Model-View-Controller)** mediante una aplicación sencilla de gestión de tareas.

El proyecto utiliza **Maven** para la gestión y construcción del proyecto y una aplicación de consola como interfaz de usuario.

---

## 📋 Descripción

Esta aplicación permite gestionar una lista sencilla de tareas utilizando una arquitectura basada en el patrón **MVC**.

Cada tarea contiene:

* Identificador único.
* Título.
* Estado de finalización.

La aplicación permite crear tareas, consultar su información y marcar tareas como completadas.

El objetivo principal del proyecto es comprender cómo separar las responsabilidades de una aplicación en tres componentes:

```text
Model      → Datos y estado de la aplicación
View       → Presentación de la información
Controller → Lógica de control y comunicación
```

---

## 🎯 Objetivos de aprendizaje

Este proyecto fue desarrollado con fines educativos para practicar:

* Programación orientada a objetos en Java.
* Encapsulamiento.
* Clases y objetos.
* Métodos y constructores.
* Colecciones de Java.
* `ArrayList`.
* Patrón arquitectónico MVC.
* Separación de responsabilidades.
* Arquitectura básica de aplicaciones.
* Gestión de proyectos con Maven.
* Uso de Git y GitHub.

---

## 🏗️ Arquitectura MVC

El proyecto está dividido en tres componentes principales.

### Model — Modelo

Ubicación:

```text
src/main/java/Modelo/
```

Contiene la clase:

```text
Task
```

Responsable de representar la información de una tarea.

Atributos:

```java
private int id;
private String title;
private boolean completed;
```

---

### View — Vista

Ubicación:

```text
src/main/java/Vista/
```

Contiene:

```text
TaskView
```

Su responsabilidad es mostrar la información de las tareas al usuario mediante la consola.

---

### Controller — Controlador

Ubicación:

```text
src/main/java/Controlador/
```

Contiene:

```text
TaskController
```

Se encarga de controlar las operaciones sobre las tareas y coordinar la actualización de la vista.

Entre sus operaciones se encuentran:

```text
addTask()
completeTask()
updateView()
```

---

## ⚙️ Funcionalidades

### Gestión de tareas

* Crear tareas.
* Asignar un identificador.
* Asignar un título.
* Consultar las tareas almacenadas.
* Marcar tareas como completadas.
* Mostrar el estado actual de cada tarea.

### Presentación

La información se muestra mediante la consola:

```text
Task ID: 1
Title: Learn SOLID principles
Completed: false
----------
```

Después de completar la tarea:

```text
Task ID: 1
Title: Learn SOLID principles
Completed: true
----------
```

---

## 🧩 Estructura del proyecto

```text
java-mvc/
│
├── pom.xml
├── .gitignore
│
└── src/
    │
    ├── main/
    │   │
    │   ├── java/
    │   │   │
    │   │   ├── Main.java
    │   │   │
    │   │   ├── Modelo/
    │   │   │   └── Task.java
    │   │   │
    │   │   ├── Vista/
    │   │   │   └── TaskView.java
    │   │   │
    │   │   └── Controlador/
    │   │       └── TaskController.java
    │   │
    │   └── resources/
    │
    └── test/
        └── java/
```

---

## 🛠️ Tecnologías utilizadas

| Tecnología       | Uso                                 |
| ---------------- | ----------------------------------- |
| Java 22          | Lenguaje de programación            |
| Maven            | Gestión y construcción del proyecto |
| POO              | Diseño de clases y objetos          |
| MVC              | Arquitectura del proyecto           |
| Java Collections | Gestión de la lista de tareas       |
| IntelliJ IDEA    | Entorno de desarrollo               |
| Git              | Control de versiones                |
| GitHub           | Repositorio                         |

---

## 📦 Dependencias

El proyecto actualmente utiliza las capacidades estándar de Java y no requiere dependencias externas adicionales.

El proyecto está configurado en Maven mediante:

```xml
<maven.compiler.source>22</maven.compiler.source>
<maven.compiler.target>22</maven.compiler.target>
```

---

## ▶️ Ejecución

### Requisitos

Antes de ejecutar el proyecto se recomienda tener instalado:

* JDK 22.
* Maven.
* IntelliJ IDEA u otro IDE compatible.
* Git, si se desea trabajar con control de versiones.

### Ejecutar mediante Maven

Desde la raíz del proyecto:

```bash
mvn clean compile
```

Posteriormente puede ejecutarse la clase:

```text
Main
```

---

## 🔄 Flujo de ejecución

La aplicación comienza en:

```text
Main.java
```

Se crea la vista:

```java
TaskView view = new TaskView();
```

Posteriormente se crea el controlador:

```java
TaskController controller = new TaskController(view);
```

El controlador agrega las tareas:

```java
controller.addTask(1, "Learn SOLID principles");
controller.addTask(2, "Implement MVC pattern in Java");
```

Después se actualiza la vista:

```java
controller.updateView();
```

Finalmente se completa una tarea:

```java
controller.completeTask(1);
```

Y se vuelve a actualizar la vista:

```java
controller.updateView();
```

---

## 📊 Ejemplo de funcionamiento

Inicialmente:

```text
Task ID: 1
Title: Learn SOLID principles
Completed: false
----------

Task ID: 2
Title: Implement MVC pattern in Java
Completed: false
----------
```

Después de ejecutar:

```java
controller.completeTask(1);
```

La primera tarea cambia a:

```text
Task ID: 1
Title: Learn SOLID principles
Completed: true
----------
```

---

## 🧠 Conceptos de programación aplicados

### Encapsulamiento

La clase `Task` mantiene sus atributos privados:

```java
private int id;
private String title;
private boolean completed;
```

El acceso se realiza mediante métodos:

```java
getId()
getTitle()
isCompleted()
setCompleted()
```

### Colecciones

El controlador utiliza:

```java
List<Task> tasks;
```

y:

```java
new ArrayList<>();
```

para almacenar las tareas en memoria.

### Separación de responsabilidades

Cada componente tiene una responsabilidad específica:

```text
Task
 ↓
Representar los datos

TaskController
 ↓
Gestionar las operaciones

TaskView
 ↓
Mostrar información
```

---

## ⚠️ Mejoras pendientes

Este proyecto representa una implementación inicial y educativa del patrón MVC.

Como siguientes pasos se podrían implementar:

* [ ] Agregar eliminación de tareas.
* [ ] Agregar edición de tareas.
* [ ] Buscar tareas por ID.
* [ ] Buscar tareas por título.
* [ ] Validar IDs duplicados.
* [ ] Validar títulos vacíos.
* [ ] Agregar interacción mediante teclado.
* [ ] Crear menú de opciones.
* [ ] Separar la lógica de negocio de `TaskController`.
* [ ] Crear una capa `Service`.
* [ ] Crear un repositorio.
* [ ] Persistir información en una base de datos.
* [ ] Implementar pruebas unitarias con JUnit.
* [ ] Crear una interfaz gráfica con JavaFX.
* [ ] Evolucionar posteriormente hacia Spring Boot.

---

## 🔮 Posible evolución arquitectónica

El proyecto puede utilizarse como punto de partida para comprender cómo evoluciona una aplicación Java.

### Versión actual

```text
Main
 │
 ▼
Controller
 ├── Model
 └── View
```

### Evolución

```text
Controller
     │
     ▼
  Service
     │
     ▼
 Repository
     │
     ▼
 Database
```

Una evolución posterior podría utilizar:

```text
Java
Spring Boot
Spring MVC
Spring Data JPA
Hibernate
MySQL
JUnit
Postman
```

Esto permitiría transformar el ejercicio actual en una aplicación web completa.

---

## 📚 Propósito del proyecto

Proyecto desarrollado como parte del aprendizaje práctico de **Java, programación orientada a objetos y patrones arquitectónicos**.

El objetivo principal es comprender los fundamentos necesarios para posteriormente trabajar con arquitecturas más completas utilizando frameworks como **Spring Boot**.

---

## 👨‍💻 Autor

**OSLO**

Proyecto educativo / portfolio de aprendizaje.

---

## 📄 Licencia

Proyecto de carácter educativo y personal.

