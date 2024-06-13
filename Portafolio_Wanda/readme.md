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


