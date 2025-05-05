# TP module 1

Son objectif est de se familiariser avec la syntaxe Java avant d'attaquer la programmation orientée objet

La durée estimée est 2 heures

## Énoncé

L’objectif est de créer un jeu de lettres : le joueur voit un tirage de lettres et doit trouver un mot le plus long
possible en utilisant ces lettres.

Voici comment se déroule l’algorithme du programme :

- Un mot est tiré au sort dans le dictionnaire ;
- Les lettres le constituant sont mélangées aléatoirement ;
- Le tirage est affiché au joueur ;
- Le joueur saisit sa proposition ;
- La proposition est vérifiée :
  - uniquement les lettres tirées ont été utilisées ; 
  - mot présent dans le dictionnaire ;
- Le mot tiré au sort est dévoilé au joueur

Le code d'origine du fichier ne doit pas être modifié, seulement complété.
Il permet d'exécuter et vérifier les comportements.

## Ressources

Un fichier contenant les mots admis, vous est fourni : dictionnaire.txt

Indications

1. Création du projet : Garder les options par défaut, notamment la séparation des fichiers sources et des fichiers compilés. 
2. Création d’une fonction tirerMotAleatoirement() retournant un tableau de caractères contenant les lettres du mot tiré au sort dans le fichier dictionnaire.
   - Pour lire une ligne (présente dans un fichier ou saisie dans une console) et récupérer un tableau de caractères majuscules, il faut utiliser l’instruction suivante : `char[] t = s.nextLine().toUpperCase().toCharArray();` 
   - Il vous manque des éléments de cours pour comprendre cette instruction, mais cela sera abordé dans le prochain module. 
3. Création d’une fonction melanger() prenant en paramètre un tableau de caractères et retournant un autre tableau dont les caractères ont été mélangés aléatoirement. 
4. Création d’une procédure afficher() prenant en paramètre un tableau de caractères et affichant ceux-ci sur la console.
5. Création d’une fonction bonnesLettres() prenant en paramètre un premier tableau de caractères contenant les lettres du tirage et un second contenant le mot proposé par le joueur et qui retourne vrai si les lettres utilisées par le joueur sont bien toutes parmi les lettres tirées. Attention, chaque lettre tirée ne peut être utilisée qu’une seule fois.
6. Création d’une fonction dansLeDico() qui prend en paramètre un tableau de caractères contenant la proposition du joueur et qui vérifie si le mot est présent dans le fichier dictionnaire.
7. Création de la procédure principale main() utilisant les procédures et fonctions précédemment codées pour permettre à l’utilisateur de jouer au Maximot.
