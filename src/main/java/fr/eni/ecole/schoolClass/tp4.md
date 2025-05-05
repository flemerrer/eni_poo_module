# TP module 4

L’objectif est d’implémenter un ensemble d’associations entre les classes.
La durée estimée est 2 heures

## Énoncé

Ce TP est la suite de l’application de prise de rendez-vous d’un cabinet médical. Dans cette itération, nos instances vont pouvoir interagir entre elles par associations. Continuez le projet QuelMedecin.


## Etape 1 - Ajout d’adresse pour les médecins généralistes et les patients

Ajouter une association unidirectionnelle entre MedecinGeneraliste et Adresse pour pouvoir connaître l’adresse d’un médecin. Modifier le constructeur de la classe pour prendre en plus un paramètre de type Adresse et modifier la méthode afficher() pour afficher également cette information.

Faire de même pour associer une adresse à un patient.

Voici le résultat attendu lors de l’exécution de la classe de test TestAssoMedecin :

```
__________________________ Médecins ______________________________
MALALANICHE Mélanie
Téléphone : 02.28.03.17.28
Tarif : 25€
Adresse :
ZAC du Moulin Neuf
2B rue Benjamin Franklin
44800 SAINT HERBLAIN
------------------------------------------------------------------
BOSAPIN Edmond
Téléphone : +33 2 17 18 19 20
Tarif : 25€
Adresse :
19 avenue Léo Lagrange
79000 NIORT
------------------------------------------------------------------
TABLE Djémila
Téléphone : 03-04-05-06-07
Tarif : 25€
Adresse :
ZAC du Moulin Neuf
2B rue Benjamin Franklin
44800 SAINT HERBLAIN
__________________________________________________________________
__________________________ Patient _______________________________
VAMBUCE Hillary
Téléphone : 0123456789
Sexe : Féminin
Numéro de Sécurité sociale : 287060244010154
Date de naissance : 2 juin 1987
Commentaires : Allergie aux arachides
Adresse :
4 Rue des Glatiniers
02100 SAINT-QUENTIN
------------------------------------------------------------------
PERRET Inès
Téléphone : 0698745123
Sexe : Féminin
Numéro de Sécurité sociale : 245021067034521
Date de naissance : 10 février 1945
Commentaires : [aucun commentaire]
Adresse :
19 avenue Léo Lagrange
79000 NIORT
------------------------------------------------------------------
PAMAMOBE Adhémar
Téléphone : 0753428619
Sexe : Masculin
Numéro de Sécurité sociale : 192112192020142
Date de naissance : 21 novembre 1992
Commentaires : [aucun commentaire]
Adresse :
4 Rue des Glatiniers
02100 SAINT-QUENTIN
```

## Etape 2 - Ajout de créneaux horaires pour les médecins

Les médecins possèdent des créneaux de consultation journaliers.

Dans cet exemple, le praticien a des créneaux de 15 minutes le matin et des créneaux de 30 minutes l’après-midi. Un médecin ne peut pas avoir plus de 15 créneaux.

Créer une classe Creneau et associer à un médecin un tableau de Creneau de 15 cases. Cette association doit être bidirectionnelle. Le constructeur de Creneau prend en paramètres l’heure de début du créneau (de type LocalTime), la durée en minutes et le médecin associé à ce créneau. Ajouter une méthode afficher() afin d’afficher l’horaire du créneau et sa durée. Créer un accesseur pour récupérer le médecin associé au créneau.

Dans la classe MedecinGeneraliste, ajouter une méthode ajouterCreneau() prenant en paramètre un créneau. Modifier également la méthode afficher() pour ajouter les créneaux du médecin.

Voici le résultat attendu lors de l’exécution de la classe de test TestCreneau :

```
__________________________ Créneaux ______________________________
09:00 - 09:15 (15 minutes)
Médecin associé à ce créneau : Dr MALALANICHE
------------------------------------------------------------------
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
------------------------------------------------------------------
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

```
## Etape 3 - La prise de rendez-vous

Selon les recommandations (simplifiées) de La Poste, une adresse française se compose en principe :

L’objectif est qu’un patient puisse prendre rendez-vous avec un médecin.

Créer une classe RendezVous dont le constructeur prend en paramètres un créneau, un patient et une date.

Ajouter une méthode afficher()

Voici l’affichage attendu pour l’exécution de la classe TestRDV :

```
__________________________ Rendez-Vous ___________________________
Rendez-vous du 23 mai 2020 11:45 - 12:00 (15 minutes)
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