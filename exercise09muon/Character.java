/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09muon;

/**
 *
 * @author MUON
 */
public abstract class Character {
    private String name;
    private Location currentLocation;

    public Character(String n){
        this.name = n;
        this.currentLocation = null;
    }
    public Character(String n, Location l){
        this.name = n;
        this.currentLocation = l;
    }

    public String getName(){
        return name;
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public void travel(Location destination){
        currentLocation.removePerson(this);
        destination.addPerson(this);
        currentLocation = destination;
        System.out.println(this.getName() + " travelled to " + destination.getName() + ".");
    }
}

