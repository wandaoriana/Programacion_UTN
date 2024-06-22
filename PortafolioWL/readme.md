# Fusión de Ramas en Git

## Clase 9 - Miércoles 5 de Junio del 2024

### Introducción a Git Merge

La fusión en Git es la forma en que este sistema une un historial bifurcado. El comando `git merge` permite integrar líneas de desarrollo independientes generadas por `git branch` en una sola rama. Con este comando, podemos crear un nuevo commit que combina dos ramas o branches: la rama actual y la rama que se indica después del comando.

> **Nota:** Estos comandos de fusión afectan solo a la rama actual y no a la rama de destino. Por lo tanto, se recomienda utilizar `git checkout` para seleccionar la rama actual y `git branch -d` para eliminar la rama de destino obsoleta.

### Funcionamiento de Git Merge

Git merge fusiona secuencias de confirmaciones en un solo historial, generalmente para combinar dos ramas. Busca una confirmación de base común y genera una confirmación de fusión que representa la combinación de las dos ramas hasta el resultado final.

### ¿Cómo Unir dos Ramas en Git?

Para combinar ramas en tu repositorio local:

1. **Cambiar a la Rama de Fusión:**
   - Usa `git checkout` para cambiar a la rama donde deseas fusionar (generalmente la rama principal).
   - Ejemplo:
     ```bash
     git checkout master
     ```

2. **Fusionar la Otra Rama:**
   - Usa `git merge` seguido del nombre de la rama que quieres combinar.
   - Ejemplo:
     ```bash
     git merge segunda
     ```

### Comandos Básicos de GitHub

- `git init`: Crear un nuevo repositorio.
- `git add .`: Agregar archivos al área de staging.
- `git commit -m "mensaje"`: Guardar los archivos en Git con un mensaje.
- `git branch nombre_rama`: Crear una nueva rama.
- `git checkout nombre_rama`: Cambiar entre ramas.
- `git push origin rama`: Enviar cambios a un servidor remoto.
- `git fetch`: Traer actualizaciones del servidor remoto al repositorio local.
- `git merge rama`: Fusionar ramas. Puede usarse para fusionar cambios desde una rama remota.
- `git pull origin rama`: Combina `fetch` y `merge` en un solo comando.
- `git checkout "codigo de version" "nombre del archivo"`: Volver a una versión específica.
- `git reset`: Volver a un estado anterior. Tiene varios modos:
  - `git reset --soft`: Guarda los cambios en staging.
  - `git reset --hard`: Todo vuelve a su versión anterior.
  - `git reset HEAD`: Saca los cambios de staging.
- `git rm`: Elimina archivos de Git (pero no su historial).
  - `git rm --cached`: Elimina archivos de staging pero los mantiene en el disco duro.
  - `git rm --force`: Elimina archivos de Git y del disco duro.
- `git status`: Muestra el estado de los archivos en el repositorio.
- `git log`: Muestra la historia completa del repositorio.
- `git log --stat`: Muestra los cambios específicos a partir de un commit.
- `git show`: Muestra cambios históricos específicos en un archivo.
- `git diff "codigo de version 1" "codigo de version 2"`: Compara cambios entre versiones.
- `git diff`: Compara el directorio de trabajo con staging.

### Resolución de Conflictos en Git Merge

En ocasiones, la fusión puede generar conflictos que requieren intervención manual. Aquí se describe cómo resolverlos:

1. **Conflictos en la Rama `segunda`:**
   - Cambiar a la rama `segunda`:
     ```bash
     git checkout segunda
     ```
   - Realizar cambios en el archivo y guardar:
     ```bash
     # Ctrl + S (Guardar en el editor de texto)
     ```
   - Hacer commit de los cambios:
     ```bash
     git commit -am "Finalizado el cambio en rama segunda"
     ```

2. **Conflictos en la Rama `master`:**
   - Cambiar a la rama `master`:
     ```bash
     git checkout master
     ```
   - Realizar otros cambios en el archivo y guardar:
     ```bash
     # Ctrl + S (Guardar en el editor de texto)
     ```
   - Hacer commit de los cambios:
     ```bash
     git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"
     ```

3. **Fusión y Resolución de Conflictos:**
   - Fusionar la rama `segunda` en `master`:
     ```bash
     git merge segunda
     ```
   - En caso de conflictos, resolverlos usando un editor de texto, como Visual Studio Code. Nunca se debe utilizar la opción de "Fusionar los dos cambios" automáticamente sin revisar.
   - Hacer commit de la resolución del conflicto:
     ```bash
     git commit -am "Arreglando conflicto"
     ```
   - Comprobar el estado de los archivos:
     ```bash
     git status
     ```

4. **Actualizar la Rama `segunda` con los Cambios Resueltos:**
   - Cambiar a la rama `segunda`:
     ```bash
     git checkout segunda
     ```
   - Fusionar los cambios de `master` en `segunda`:
     ```bash
     git merge master
     ```
   - Hacer commit de los cambios:
     ```bash
     git commit -am "Cargamos esto ahora"
     ```

5. **Completar la Fusión:**
   - Cambiar a la rama `master` y fusionar:
     ```bash
     git checkout master
     git merge segunda
     ```

### Notas Finales

- La fusión (`merge`) siempre ocurre en la rama en la que estás posicionado.
- Visual Studio Code y otros editores modernos facilitan la resolución de conflictos con herramientas de interfaz gráfica.
- Asegúrate de siempre hacer commit después de resolver conflictos para mantener la integridad del historial de cambios.

---


# Resolución de Conflictos al Hacer Merge en Git

## Clase 10 - Miércoles 12 de Junio del 2024

### Sección de Lectura

Git es una herramienta muy robusta y tiene la capacidad de resolver muchos conflictos automáticamente. Sin embargo, hay casos en los que no puede hacerlo, especialmente cuando dos ramas distintas han realizado cambios en la misma línea de código. 

#### Conceptos Clave:

- **Merge y Checkout**: Cambiar de rama o fusionar ramas no borra ninguna rama o commit.
- **Conflictos**: Ocurren cuando dos ramas diferentes realizan cambios distintos en la misma línea de código.
- **Resolución de Conflictos**: Debe ser realizada manualmente en un editor de código, donde se elige qué cambios aceptar.
- **Nuevo Commit**: Es necesario crear un nuevo commit para aplicar los cambios después de un merge.
- **Estado Unmerged**: Archivos con conflictos entran en un estado intermedio conocido como Unmerged.
- **Revertir un Merge**: Se puede cancelar un merge usando `git merge --abort`.

#### Comandos para Repositorios Remotos:

- `git clone`: Clona un repositorio remoto al directorio de trabajo local.
- `git push`: Envía cambios al repositorio remoto.
- `git fetch`: Actualiza el repositorio local con cambios del remoto.
- `git pull`: Combina `git fetch` y `git merge` en un solo paso.
- `git commit -am ""`: Combina `git add` y `git commit` en un solo comando.
- `git branch`: Crea una nueva rama.
- `git checkout`: Cambia de una rama a otra.
- `git merge`: Fusiona cambios de una rama a otra. Esto ocurre en la rama en la que estás posicionado.
- Los merges pueden generar conflictos que necesitan ser resueltos manualmente.

### Sección Práctica

#### Pasos para Crear y Resolver un Conflicto:

1. **Cambios en la Rama `segunda`:**
   - Posicionarse en la rama `segunda`:
     ```bash
     git checkout segunda
     ```
   - Realizar cambios en un archivo HTML y CSS.
   - Guardar los cambios:
     ```bash
     # Ctrl + S (Guardar en el editor de texto)
     ```
   - Hacer commit de los cambios:
     ```bash
     git commit -am "Modifiqué el CSS y el color del texto"
     ```

2. **Cambios en la Rama `master`:**
   - Cambiar a la rama `master`:
     ```bash
     git checkout master
     ```
   - Realizar otros cambios en los mismos archivos HTML y CSS.
   - Guardar los cambios:
     ```bash
     # Ctrl + S (Guardar en el editor de texto)
     ```
   - Hacer commit de los cambios:
     ```bash
     git commit -am "Agregué suscripción, cambié el código y puse todo azul en CSS"
     ```

3. **Fusión de Ramas y Resolución de Conflictos:**
   - Fusionar la rama `segunda` en `master`:
     ```bash
     git merge segunda
     ```
   - En caso de conflicto, abrir el archivo en el editor de texto y resolver los conflictos indicados. Esto se puede hacer desde Visual Studio Code seleccionando: el cambio entrante.
   - Después de resolver el conflicto, guardar el archivo:
     ```bash
     # Ctrl + S (Guardar en el editor de texto)
     ```
   - Comprobar el estado de los archivos:
     ```bash
     git status
     ```
   - Hacer commit de la solución del conflicto:
     ```bash
     git commit -am "Solución de conflictos al fusionar las ramas"
     ```

4. **Actualizar la Rama `segunda` con los Cambios Resueltos:**
   - Cambiar a la rama `segunda`:
     ```bash
     git checkout segunda
     ```
   - Fusionar los cambios de `master` en `segunda`:
     ```bash
     git merge master
     ```

### Notas Adicionales:

- Recuerda que la fusión (`merge`) siempre ocurre en la rama en la que estás posicionado.
- Visual Studio Code facilita la resolución de conflictos con herramientas de interfaz gráfica.
- Asegúrate de siempre hacer commit después de resolver conflictos para mantener la integridad del historial de cambios.

Este proceso asegura que los cambios en ambas ramas se combinen de manera efectiva, resolviendo cualquier conflicto que surja.

---

¡Buena suerte con tu manejo de conflictos en Git!