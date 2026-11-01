# 📚 Biblioteca JavaFX – Sistema de Gestión de Préstamos e Inventario

<div align="center">

[![Java](https://img.shields.io/badge/Java_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![JavaFX](https://img.shields.io/badge/JavaFX-007396?style=for-the-badge&logo=java&logoColor=white)](https://openjfx.io/)
[![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Pattern](https://img.shields.io/badge/Architecture-MVC_Pattern-blue?style=for-the-badge)](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)

<p align="center">
  <b>Software de escritorio empresarial para la administración centralizada de bibliotecas escolares y universitarias. Permite catalogar títulos, gestionar carnets de lectores y controlar préstamos y devoluciones en tiempo real.</b>
</p>

</div>

---

## 📌 Descripción del Proyecto

**Biblioteca JavaFX** es una aplicación desarrollada bajo el paradigma de Programación Orientada a Objetos y el patrón arquitectónico **MVC**. Automatiza el control del acervo bibliográfico, permitiendo a los bibliotecarios registrar libros clasificados por categoría y autor, afiliar lectores y llevar el registro de préstamos activos con fechas límite y control de devoluciones.

---

## ✨ Funcionalidades Principales

- **Catálogo Bibliográfico:** Registro detallado de libros (ISBN, título, autor, editorial, año de edición, número de copias y disponibilidad).
- **Control de Lectores:** Administración de usuarios afiliados, datos de contacto y estado de su carnet de biblioteca.
- **Gestión de Préstamos:** Registro de préstamos de libros vinculando lector, ejemplar, fecha de entrega y fecha máxima de devolución.
- **Control de Devoluciones:** Liquidación de préstamos con cálculo de días de mora ante entregas extemporáneas.
- **Búsqueda Dinámica:** Filtros rápidos por título, categoría, autor e ISBN.

---

## 🛠️ Tecnologías y Arquitectura

- **Lenguaje:** Java 17 (POO)
- **Interfaz de Usuario:** JavaFX con archivos FXML y estilos CSS personalizados
- **Base de Datos:** MySQL Server conectado a través del driver JDBC
- **Arquitectura:** Modelo-Vista-Controlador (MVC) con patrón Singleton para la conexión a la base de datos

---

## 📂 Estructura del Proyecto

```text
├── src/
│   └── org/rafaelcastro/
│       ├── bean/          # Modelos de entidad (Libro, Lector, Prestamo, Categoria)
│       ├── controller/    # Controladores de interfaz y lógica de negocio
│       ├── db/            # Conexión JDBC Singleton y scripts SQL
│       ├── view/          # Escenas FXML y recursos gráficos
│       └── system/        # Lanzador principal y cambio de vistas
├── database/              # Script de creación de tablas y procedimientos
└── README.md
```

---

## 🚀 Requisitos y Ejecución

### Prerrequisitos
- JDK 17 o superior
- JavaFX SDK
- MySQL Server (puerto 3306)
- IDE recomendado: NetBeans, IntelliJ IDEA o Eclipse

### Ejecución
1. Clonar el repositorio:
   ```bash
   git clone git@github.com:RafaelCastroRR/Repo-Biblioteca-JAVAFX.git
   ```
2. Ejecutar el script SQL de la carpeta `database/` en MySQL Workbench.
3. Ajustar credenciales en la clase `Conexion.java`.
4. Compilar y ejecutar desde el IDE.

---

## 👨‍💻 Autor
**Rafael Castro** – Graduado de Fundación Kinal  
- Portafolio: [portafolio.xibalbadev.xyz](https://portafolio.xibalbadev.xyz)  
- Contacto: [rafaelcastro0605@gmail.com](mailto:rafaelcastro0605@gmail.com)
