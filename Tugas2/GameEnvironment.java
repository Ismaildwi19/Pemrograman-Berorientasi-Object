package Tugas2;

import java.util.ArrayList;

public class GameEnvironment
{
    //encapsulation
    private double width, height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<>();

    //constructor kosong
    public GameEnvironment(){

    }

    //constructor dengan parameter width dan height
    public GameEnvironment(double width, double height){
        this.width = width;
        this.height = height;
    }

    //method untuk menmbah player ke dalam environment
    public void addPlayer(GamePlayer player){
        this.arrPlayer.add(player);
    }

    //method untuk menghapus player dari environment
    public void removePlayer(GamePlayer player){
        this.arrPlayer.remove(player);
    }

    //method untuk menampilkan semua player di environment
    public void getAllPlayer(){
        if (arrPlayer.isEmpty()){
            System.out.println("No player in the environment");
        }
        else {
            System.out.println("All of Players:"+ arrPlayer);
        }
    }

    //method untuk menambah enemy ke environment
    public void addEnemy(GameEnemy enemy){
        this.arrEnemy.add(enemy);
    }

    //method untuk menghapus enemy dari environment
    public void removeEnemy(GameEnemy enemy){
        this.arrEnemy.remove(enemy);
    }

    //method untuk menampilkan semua enemy di environment
    public ArrayList<GameEnemy> getAllEnemy(){
        return this.arrEnemy;
    }

    //method untuk menghitung jarak antara player dan enemy
    public static int EuclideanDistance(int x1, int y1, int x2, int y2){
        return (int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

    }

    //method untuk melakukan interaksi antara player dan enemy
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