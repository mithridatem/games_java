# games_java
### 1 Cloner le repository

```bash
git clone https://github.com/mithridatem/games_java.git
```

### 2 Se déplacer dans le dossier du projet

```bash
cd games_java
```

### 3 Importer la dépendance mysql-connector dans votre projet

Projet structure -> modules -> dependencies -> + -> JARs or directories

-> sélectionner le fichier mysql-connector-j-9.5.0.jar dans le dossier libs

### 4 Créer la base de données

En utilisant votre client MySQL préféré, exécuter le script SQL contenu 
dans le fichier `bdd.sql` pour créer la base de données et les tables nécessaires.

### 5 Configurer la base de données

Remplacer les valeurs de connexion dans le fichier `Env.java` par vos propres valeurs.

