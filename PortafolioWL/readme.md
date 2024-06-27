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
# Resolución de Conflictos al Hacer Merge en Git

## Clase 11 - Miércoles, 12 de Junio del 2024

### Portafolio 5

---

## Sección de Lectura


Git es una herramienta que no borra nada a menos que se lo indiquemos. Comandos como `git merge` o `git checkout` no eliminan ramas ni commits; simplemente cambian de rama o crean un nuevo commit. Recuerda que puedes borrar commits con `git reset` y ramas con `git branch -d`.

### Resolución Automática de Conflictos

Git puede resolver automáticamente algunos conflictos, como cambios en líneas diferentes. Sin embargo, cuando dos ramas modifican la misma línea de manera diferente, Git no sabe cómo resolver el conflicto. Estos conflictos se deben resolver manualmente editando el archivo en cuestión.

### Manejo de Conflictos

1. Realiza el merge.
2. Abre el archivo en conflicto en tu editor de código.
3. Decide si deseas mantener una de las versiones o combinar ambas.
4. Guarda el archivo.

Visual Studio Code y otros editores ofrecen herramientas para resolver estos conflictos sin necesidad de editar manualmente el texto. Simplemente selecciona las opciones deseadas y guarda el archivo.

Recuerda siempre crear un nuevo commit después de resolver los conflictos de un merge. Si Git resuelve automáticamente el conflicto, hará el commit por ti. Si no, debes solucionarlo y luego hacer el commit manualmente.

### Estado Unmerged

Los archivos en conflicto durante un `git merge` entran en un estado llamado Unmerged, similar al estado Unstaged, que es un estado intermedio entre Untracked y Unstaged. Para resolver esto:

1. Ejecuta `git add` para mover los archivos al área de staging.
2. Ejecuta `git commit` para

# Cómo Funcionan las Llaves Públicas y Privadas en Cifrado Asimétrico

## Clase 12 - Miércoles, 19 de Junio del 2024

### Portafolio 6

---

## Sección de Lectura

### Introducción al Cifrado Asimétrico

Las llaves públicas y privadas, también conocidas como cifrado asimétrico, son fundamentales para mantener la privacidad y seguridad en la comunicación entre diferentes nodos. Este tipo de cifrado permite enviar mensajes de manera segura asegurando que solo el destinatario deseado pueda leer el contenido.

### Funcionamiento del Cifrado con Llaves Públicas y Privadas

1. **Generación de Llaves**:
   - Cada persona debe crear un par de llaves: una llave pública y una llave privada.
   
2. **Compartir la Llave Pública**:
   - La llave pública puede ser compartida libremente con cualquier persona o entidad. No hay riesgo si esta llave es interceptada ya que no puede descifrar mensajes por sí sola.

3. **Cifrado del Mensaje**:
   - Cuando una persona desea enviar un mensaje seguro, utiliza la llave pública del destinatario para cifrar el mensaje. Este mensaje cifrado solo puede ser descifrado por la llave privada correspondiente del destinatario.

4. **Envío Seguro del Mensaje**:
   - El mensaje cifrado puede ser enviado a través de cualquier canal. Incluso si el mensaje es interceptado, no puede ser leído sin la llave privada correcta.

5. **Descifrado del Mensaje**:
   - El destinatario utiliza su llave privada para descifrar el mensaje y acceder al contenido original.

### Importancia de Mantener Segura la Llave Privada

- **Llave Pública**:
  - Es segura para compartir y puede ser vista por cualquiera. Su principal función es cifrar el mensaje que solo la llave privada correspondiente puede descifrar.

- **Llave Privada**:
  - Debe mantenerse completamente segura y nunca ser compartida. Esta llave es la única que puede descifrar mensajes cifrados con su llave pública correspondiente.

### Nota Importante

- **Compartir Llave Pública**:
  - Puedes compartir tu llave pública con cualquier persona sin preocuparte por la seguridad.

- **Seguridad de la Llave Privada**:
  - Nunca compartas tu llave privada con nadie. Mantén esta llave en un lugar seguro para asegurarte de que solo tú puedas descifrar los mensajes cifrados dirigidos a ti.

---

Este `README.md` te proporciona una comprensión básica de cómo funcionan las llaves públicas y privadas en el cifrado asimétrico y cómo se utilizan para mantener la seguridad en la comunicación.

# Clase 13 - Miércoles 26 de junio de 2024 - Portafolio 7

## Configura tus llaves SSH en local (Parte 13)

Si usamos GitHub solo con usuario y contraseña, corremos el riesgo de perder todo si nuestra PC se extravía o es comprometida. Para fortalecer la seguridad, es recomendable utilizar llaves públicas y privadas. Esto no solo mejora la seguridad, sino que también evita tener que ingresar usuario y contraseña cada vez.

A continuación, se describen los pasos para configurar tus llaves SSH en local:

1. Abre Git Bash (en Windows) o la terminal (en Ubuntu) en cualquier ubicación.

2. Verifica tu configuración de Git con el comando:

git config -l


3. Actualiza el correo que usas en GitHub con:

git config --global user.email “alumnos@mail.com”


4. Genera tus llaves SSH con el siguiente comando:

ssh-keygen -t rsa -b 4096 -C “alumnos@mail.com”


5. Enciende el servidor de llaves SSH con:

eval $(ssh-agent -s)


6. Añade tu llave SSH al servidor con:

ssh-add ~/.ssh/id_ga35745

(Reemplaza `id_ga35745` con el nombre de tu llave privada).
Si usas una Mac, sigue estos pasos para configurar tus llaves SSH:

7. Abre la terminal y ejecuta el siguiente comando para encender el “servidor” de llaves SSH:

eval “$(ssh-agent -s)”


8. Si estás usando una versión de OSX superior a Mac Sierra (v10.12), crea o modifica un archivo llamado “config” en la carpeta de tu usuario con el siguiente contenido (cuidado con las mayúsculas):

vim config

Agrega lo siguiente al archivo:

Host * AddKeysToAgent yes UseKeychain yes IdentityFile ruta-donde-guardaste-tu-llave-privada


9. Añade tu llave SSH al “servidor” de llaves SSH de tu computadora (en caso de error, ejecuta este mismo comando sin el argumento -K):

ssh-add -K ruta-donde-guardaste-tu-llave-privada


## Segundo Factor de Autenticación (2FA)

Para mejorar la seguridad, considera habilitar el 2FA:
1. Ve a tu perfil en GitHub.
2. Selecciona "Settings".
3. Navega a "Password and Authentication".
4. Activa el 2FA:
- GitHub Mobile: Instala la aplicación GitHub Mobile y sigue las instrucciones.
- Authenticator app: Escanea el código QR con una app como Twilio Authy Authenticator.

Recuerda guardar tus datos de acceso en un lugar seguro para mantener el acceso incluso si cambias de dispositivo.