/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07muonmartinezmarieemmanuelle;
import java.util.ArrayList;

/**
 *
 * @author MUON
 */
public abstract class Monster implements Interactive{
    protected final String name, type, strongAgainst, weakAgainst;
    protected int maxHP, hp, atk, def, xp, lvl;
    private static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + " HP.");
        if(strong) System.out.println("It was super effective!\n");
        if(weak) System.out.println("It wasn't very effective...\n");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public abstract void special();

    public void restoreHealth(){
        hp = maxHP;
        System.out.println(name + " is now at full health.\n");
    }
    
    @Override
    public void interact() {
        System.out.println("Name: " + name + "\nType: " + type + "\n");
    }
}