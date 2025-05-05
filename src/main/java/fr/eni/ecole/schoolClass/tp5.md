# TP module 6

L’objectif est de mettre en place de l'héritage
La durée estimée est 1 heure

## Énoncé

Ce TP est la suite de l’application de prise de rendez-vous d’un cabinet médical. Dans cette itération, nous ajoutons la notion de classe d’héritage. Continuez le projet QuelMedecin

## Etape 1 - La classe Personne

Voici le diagramme de classes :

Vous avez sûrement remarqué que les classes Patient et MedecinGeneraliste ont un certain nombre d’éléments en commun. Il est possible de mutualiser ce code commun au sein d’une classe et de faire hériter de celle-ci deux classes avec les éléments spécifiques à chacune.

Créer une classe Personne et modifier les classes Patient et MedecinGeneraliste en conséquence.

Voici le résultat attendu lors de l’exécution de la classe de test TestPersonnes :

```
__________________________ Médecins
______________________________
MALALANICHE Mélanie
Téléphone : 02.28.03.17.28
Tarif : 25€
Adresse :
ZAC du Moulin Neuf
2B rue Benjamin Franklin
44800 SAINT HERBLAIN
Créneaux :
09:00 - 09:15 (15 minutes)
09:15 - 09:30 (15 minutes)
09:30 - 09:45 (15 minutes)
09:45 - 10:00 (15 minutes)
10:30 - 10:45 (15 minutes)
10:45 - 11:00 (15 minutes)
11:15 - 11:30 (15 minutes)
11:30 - 11:45 (15 minutes)
11:45 - 12:00 (15 minutes)
14:00 - 14:30 (30 minutes)
14:30 - 15:00 (30 minutes)
15:00 - 15:30 (30 minutes)
15:30 - 16:00 (30 minutes)
16:00 - 16:30 (30 minutes)
16:30 - 17:00 (30 minutes)
__________________________________________________________________
__________________________ Rendez-Vous ___________________________
Rendez-vous du 23 mai 2020 09:00 - 09:15 (15 minutes)
avec le Dr MALALANICHE
pour PAMAMOBE Adhémar
Téléphone : 0753428619
Sexe : Masculin
Numéro de Sécurité sociale : 192112192020142
Date de naissance : 21 novembre 1992
Commentaires : [aucun commentaire]
Adresse :
19 avenue Léo Lagrange
79000 NIORT
```

## Etape 2 - Différents types de médecins

Voici le diagramme de classes :

En plus de médecins généralistes, des médecins spécialistes vont utiliser cette application de prise de rendez-vous.

Les spécialistes ont les mêmes caractéristiques que les généralistes, sauf que leurs tarifs sont différents d’un praticien à un autre et qu’il faut connaître le nom de leur spécialité.

Voici le résultat attendu lors de l’exécution de la classe de test TestSpecialistes :
```
__________________________ Spécialistes
__________________________
OCENSEMAIME Céline
Téléphone : 0748159263
Spécialité : ORL
Tarif : 52€
Adresse :
ZAC du Moulin Neuf
2B rue Benjamin Franklin
44800 SAINT HERBLAIN
Créneaux :
14:00 - 14:20 (20 minutes)
14:20 - 14:40 (20 minutes)
14:40 - 15:00 (20 minutes)
15:00 - 15:20 (20 minutes)
15:20 - 15:40 (20 minutes)
15:40 - 16:00 (20 minutes)
16:00 - 16:20 (20 minutes)
16:20 - 16:40 (20 minutes)
16:40 - 17:00 (20 minutes)
17:00 - 17:20 (20 minutes)
Rendez-vous du 17 juin 2020 15:20 - 15:40 (20 minutes)
avec le Dr OCENSEMAIME
pour PAMAMOBE Adhémar
Téléphone : 0753428619
Sexe : Masculin
Numéro de Sécurité sociale : 192112192020142
Date de naissance : 21 novembre 1992
Commentaires : [aucun commentaire]
Adresse :
19 avenue Léo Lagrange
79000 NIORT
```