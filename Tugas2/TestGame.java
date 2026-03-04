package Tugas2;


public class TestGame{
    public static void main(String[] args){
        /* 
        GamePlayer player1 = new GamePlayer(50.0, 100.0, 10, 20);
        System.out.println("GamePlayer 1:");
        System.out.println("Width: " + player1.getWidth());
        System.out.println("Height: " + player1.getHeight());
        System.out.println("Position X:" + player1.getX());
        System.out.println("Position Y:" + player1.getY());
        player1.Run();
        player1.Run(60);

        GameEnemy enemy1 = new GameEnemy(60.0, 120.0, 30, 40);
        System.out.println("\nGameEnemy 1:");
        System.out.println("Width: " + enemy1.getWidth());
        System.out.println("Height: " + enemy1.getHeight());
        System.out.println("Position X:" + enemy1.getX());
        System.out.println("Position Y:" + enemy1.getY());
        enemy1.Run();
        */

        GamePlayer hero = new GamePlayer();
        hero.setDimension(12,12);
        hero.setPosition(10, 220);
        System.out.println("Posisi Player: "+ hero.getX() + "," + hero.getY());
        hero.Run(12);
        System.out.println("Posisi Player: " + hero.getX() + "," + hero.getY());
        GamePlayer hero2 = new GamePlayer();
        hero2.setDimension(12, 32);
        hero2.setPosition(10, 10);

        GameEnemy monster = new GameEnemy();
        monster.setDimension(12, 32);
        monster.setPosition(10, 10);

        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(hero);
        scene.addPlayer(hero);
        scene.addPlayer(hero2);
        scene.getAllPlayer();
        scene.removePlayer(hero);
        scene.getAllPlayer();
        scene.addEnemy(monster);
        scene.Iteraction();

    }
}