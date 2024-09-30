# Application de Calcul des Impôts Locaux de Voiture

Cette application mobile permet de calculer les impôts locaux basés sur la surface d'une maison, le nombre de pièces, et la présence ou non d'une piscine.

## Fonctionnalités

- **Saisie utilisateur** : L'utilisateur entre les informations suivantes :
  - Nom
  - Adresse
  - Surface (en mètres carrés)
  - Nombre de pièces
  - Indication s'il y a une piscine

- **Calcul des impôts** :
  - **Impôt de base** : Calculé en fonction de la surface, selon la formule : `Impôt de base = Surface * 2`.
  - **Impôt supplémentaire** : Calculé en fonction du nombre de pièces et de la présence d'une piscine. La formule est : 
    - `Impôt supplémentaire = Nombre de pièces * 50`.
    - Si la maison dispose d'une piscine, un supplément de 100 est ajouté à l'impôt supplémentaire.

- **Affichage des résultats** : Le résultat des impôts est affiché après le calcul.

## Formules

- **Impôt de base** = `Surface * 2`
- **Impôt supplémentaire** = `Nombre de pièces * 50`
- **Bonus piscine** = `+100` (ajouté à l'impôt supplémentaire si une piscine est présente)

## Prérequis

- SDK Android installé
- Android Studio ou tout autre IDE pour le développement Android

## Installation

1. Clonez ce dépôt :
    ```bash
    git clone https://github.com/votre-nom-utilisateur/nom-du-repository.git
    ```
2. Ouvrez le projet dans Android Studio.
3. Compilez et exécutez l'application sur un émulateur ou un appareil physique.

## Utilisation

1. Entrez les informations demandées (nom, adresse, surface, nombre de pièces, piscine).
2. Appuyez sur le bouton de calcul pour obtenir le montant des impôts.
3. Les résultats seront affichés sur l'écran.


## Auteur
younes Amerge

## Licence

Ce projet est sous licence MIT.




https://github.com/user-attachments/assets/094db894-44ac-4762-b56e-93540b056b6e




