Imagine we are making a game where players fight using water pistols. Each time a player shoots they lose some water. If they hit another player, the other player loses a life. We want to set up some classes to describe this game.

1. Complete the `Player` *class*. 
   It should have the following member variables - 
    String name;
    int water;
    int lives;

2. Write the method `shoot` which takes two players (a shooter, and the one being shot) and a boolean value which is true if the shot hit. If the shooter has water left, the method takes one ‘water’ off the shooter (provided they have some) and one life off the shot player if the shot hit.

3. Modify the `shoot` method to say when a player has run out of lives and/or water.  


