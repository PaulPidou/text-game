text-game
=========

Java Text Game

Idées :
- Pas de graphisme (jeu textuel)
- Monde post-apocalyptique
- Environnement intérieur / extérieur (possibilité d'entrée dans les maisons)
- Sandbox
- Monde généré procéduralement

Features :
- Gestion de l'inventaire (poids, ..)
- Gestion de la santé (blessures, sommeil, maladies)
- Système de combat au tour par tour
- Système d'entitées (armes, nourritures ..)
- Sauvegarde de carte
- Déplacement sur la carte

Interface:

Displayable
  Attributs:
  - Nom
  - Description

Classes:

Alive - implemente Displayable
  
  Méthodes:
  - Se déplacer

Alive_fight - hérite de Alive
  Attributs:
  - Points de vie
  - Force / dégats de base
  
  Méthodes:
  - Recevoir dégats
  - Donner dégats / tirer

Hero - hérite de Alive_fight
  Méthodes:
  - Ramasser arme
  - Voir inventaire

Monster - hérite de Alive_fight

Item - implemente Displayable
  Attributs:
  - Poids

Weapon - hérite de Item
  Attributs:
  - Dégats

