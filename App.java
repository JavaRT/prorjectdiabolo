package prorject.diabolo;

import prorject.diabolo.npc.CreatePlayer;
import prorject.diabolo.npc.Monster;
import prorject.diabolo.npc.Player;

import java.util.List;


public class App {
    public static void main(String[] args) {
        System.out.println("Dungeon master says: Hello World!");
        Player player = CreatePlayer.createPlayer();
        List<Monster> monsters = MonsterCreationUtil.createMonsters();

        monsters.get(0).receiveDamage(player.attack());
        monsters.stream().filter(m -> m.isAlive())
                .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
        System.out.println(monsters);
        while (player.isAlive() && monsters.stream().anyMatch(m -> m.isAlive())) {

            monsters.stream()
                    .filter(m -> m.isAlive())
                    .findFirst()
                    .get()
                    .receiveDamage(player.attack());


            monsters.stream().filter(m -> m.isAlive())
                    .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
            System.out.println(monsters);
        }
    }
}