import java.util.Random;

class Main {
  public static void main(String[] args) {

    Player [] players = new Player [3];

    players [0] = new Player ();
    players [0]. name = " Fred ";
    players [0]. water = 5;
    players [0]. lives = 3;
    players [1] = new Player ();
    players [1]. name = " Jim ";
    players [1]. water = 5;
    players [1]. lives = 3;
    players [2] = new Player ();
    players [2]. name = " Sheila ";
    players [2]. water = 5;
    players [2]. lives = 3;

    /* Get players to randomly shoot each other for a while */
    Random r = new Random ();
    for ( int i = 0; i < 30; i++) 
    {
      Player shooter = players [r. nextInt ( players . length )];
      Player shot = players [r. nextInt ( players . length )];

      boolean hit = r. nextInt (2) > 0;
      
      shoot( shooter , shot , hit );
    }
  }

  public static void shoot(Player shooter, Player shotAt, boolean hit){
    if (shooter.water>0)
    {
      System.out.println(shooter.name + " shot");
      shooter.water--;
      if (shooter.water==0)
      {
        System.out.println(shooter.name + " is out of water");
      }
    
      if (hit && shotAt.lives>0)
      {
        System.out.println(shooter.name + " hit " + shotAt.name);
        shotAt.lives--;
        if (shotAt.lives==0)
        {
          System.out.println(shotAt.name + " is out of lives");
        }
      }
    }  
  }

}