package Tugas2;

import java.util.ArrayList;

public class GameEnvironment
{
    private double width, height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<>();

    public GameEnvironment(){

    }

    public GameEnvironment(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void addPlayer(GamePlayer player){
        this.arrPlayer.add(player);
    }

    public void removePlayer(GamePlayer player){
        this.arrPlayer.remove(player);
    }

    public void getAllPlayer(){
        if (arrPlayer.isEmpty()){
            System.out.println("No player in the environment");
        }
        else {
            System.out.println("All of Players:"+ arrPlayer);
        }
    }

    public void addEnemy(GameEnemy enemy){
        this.arrEnemy.add(enemy);
    }

    public void removeEnemy(GameEnemy enemy){
        this.arrEnemy.remove(enemy);
    }

    public ArrayList<GameEnemy> getAllEnemy(){
        return this.arrEnemy;
    }

    public static int EuclideanDistance(int x1, int y1, int x2, int y2){
        return (int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

    }

    public void Iteraction(){
        if (arrPlayer == null || arrEnemy == null){
            System.out.println("Player or enemy not sets");
        }

        for (int i = 0; i < arrPlayer.size(); i++){
            for (int j = 0; j < arrEnemy.size();j++){
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player: " + arrPlayer.get(i)+ " and Enemy: "+ arrEnemy.get(j) + " not in the same Y position");
                }

                if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2){
                    System.out.println("Player: " + arrPlayer.get(i)+ " Attacked ");
                    System.out.println("Enemy: "+ arrEnemy.get(j) + " loses");

                    arrEnemy.remove(arrEnemy.get(j));
                }
                else {
                    System.out.println("==> Player "+ arrPlayer.get(i));
                    arrPlayer.get(i).Run((int) Math.ceil(Math.random()*10));
                    System.out.println("current x position: "+ arrPlayer.get(i).getX()+ " <==");
                }

            }
        }
    }
}