# TP module 2

L’objectif est de créer un petit calendrier permettant de visualiser tous les jours d’un mois d’un seul coup d’œil.
Utilisation des nouvelles fonctionnalités de l'API java.time
La durée estimée est 1 heure 30

## Introduction à l'API java.time

Les nouvelles fonctionnalités de l'API java.time
permettent un code plus clair, moins sujet aux erreurs qu'avec GregorianCalendar présenté dans le cours.

1. Remplacement de GregorianCalendar par LocalDate :
    - Utilisation de LocalDate.of(annee, mois, jour), pour créer une date.
    - Utilisation des méthodes plusMonths(), minusMonths(), et getDayOfWeek().
2. Manipulation des jours de la semaine avec la méthode getDayOfWeek()
    - Cette méthode retourne en fonction de la LocalDate ; le jour de la semaine depuis une énumération DayOfWeek
    - Si sur la valeur de l'énumération DayOfWeek ; vous appelez la méthode value(). Vous obtiendrez un entier qui fait correspondre à lundi (1), à mardi (2), ... à dimanche (7).
3. Formatage des informations : pour récupérer le nom du mois en français, utilisez getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE)
4. Gestion de la fin du mois : pour obtenir le nombre de jours dans le mois ; utilisez lengthOfMonth()


## Énoncé

1. Création du projet : garder les options par défaut, notamment la séparation des fichiers sources et des fichiers compilés.
2. Création d’une procédure afficherMois() prenant en paramètres deux entiers : l’année et le mois à afficher
    - Avec les LocalDate, vous pouvez utiliser les mois entre 1 et 12.
    - Aidez-vous de la JavaDoc pour écrire votre code
    - L’affichage attendu pour un appel à cette méthode avec les valeurs 2024 et 11 doit être celui-ci :

```
     * novembre 2024 *
    Lu Ma Me Je Ve Sa Di
                 1  2  3 
     4  5  6  7  8  9 10 
    11 12 13 14 15 16 17 
    18 19 20 21 22 23 24 
    25 26 27 28 29 30
```

3. Création de la procédure principale main()
    - Affichant initialement le calendrier du mois en cours
    - Un menu positionné en dessous du calendrier propose à l’utilisateur de consulter
    - Le calendrier du mois précédent,
    - Du mois suivant
    - Ou d’un mois et d’une année de son choix
    - Une dernière option permet de quitter le programme
   - Voici un exemple de traces :

```   
     * novembre 2024 *
    Lu Ma Me Je Ve Sa Di
                 1  2  3 
     4  5  6  7  8  9 10 
    11 12 13 14 15 16 17 
    18 19 20 21 22 23 24 
    25 26 27 28 29 30 

    Choisissez votre option de calendrier : 
     -(q) quitter 
     -(-) mois précédent 
     -(+) mois suivant 
     -(d) date personnalisée
```
