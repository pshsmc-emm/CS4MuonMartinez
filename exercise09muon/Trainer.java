/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09muon;
import java.util.*;

/**
 *
 * @author MUON
 */
public class Trainer {
	private String name;
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        this.name = n;
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(m.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(m.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void sureCapture(Monster m)extends AlreadyCapturedException {
        if (team.contains(m)) { 
            team.add(m);
            System.out.printf("%s was successfully captured.", m.getName());
        } else {
            throw new AlreadyCapturedException();
        }
       
    }
    public void release(Monster m){
        team.remove(m);
        System.out.printf("%s was released from the team.", m.getName());
    }
}