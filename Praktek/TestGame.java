public class TestGame{
    public static void main(String[] args){

        Gameplayer hero = new Gameplayer();
        hero.setDimensi(12,12);
        hero.setPosition(10,220);
        System.out.println("Posisi Player: "+hero.getX()+","+hero.getY());
        hero.Run(12);
        System.out.println("Posisi Player: "+hero.getX()+","+hero.getY());
        Gameplayer hero2 = new Gameplayer();
        hero2.setDimensi(12,32);
        hero2.setPosition(10,10);

        Gameenemy monster = new Gameenemy();
        monster.setDimensi(12,32);
        monster.setPosition(10,10);

        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(hero);
        scene.addPlayer(hero);
        scene.addPlayer(hero2);
        scene.getAllPlayers();
        scene.removePlayer(hero);
        scene.getAllPlayers();
        scene.addEnemy(monster);
        scene.Interaction();
    }
    
}
