/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05muonmartinez;
import java.util.*;

/**
 *
 * @author MUON
 */
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    name = "";
    earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print 
    //statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    int totalItems = itemList.size() + 1;
    if(itemList.size() < index ) {
        System.out.println("There are only " + totalItems + "items in the store.");
    } else {
        earnings += itemList.get(index);
        
        System.out.println("The sale is " + earnings + ".");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to 
    //loop over itemList) (if not, print statement that the store doesn't 
    //sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    
    if(itemList) {
        
    } else {
        System.out.println("The sale is " + earnings + ".");
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help 
    //with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    
    for(Item t: itemList) {
        if(t.getType().equals(type)) {
            System.out.println(t.getType());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal 
    //to the specified value
    
        for(Item j: itemList) {
            if(j.getCost() <= maxCost ){
                System.out.println(j.getCost());
            }
        }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or 
    //equal to the specified value

        for(Item j: itemList) {
            if(j.getCost() >= minCost ){
                System.out.println(j.getCost());
            }
        }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    
    for(Store k: storeList) {
        System.out.println("Name: " + k.name);
        System.out.println("Earnings: " + Store.earnings);
    }

  }
}

















