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

  public Store(String storeName) {
    name = storeName;
    earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName() {
    return name;
  }

  public double getEarnings() {
    return earnings;
  }

  // checks if the index is within the size of the itemList
  public void sellItem(int index) {
    int totalItems = itemList.size();
    boolean found = false;

    for (Item j : itemList) {
      if (itemList.size() > index) {
        earnings += j.getCost();

        System.out.println("\n" + j.getName() + " was sold.");
        System.out.println("The sale is " + earnings + ".");

        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("\nThere are only " + totalItems + " items in the store.");
    }
  }

  // checks if an item with a given name exists in the store
  public void sellItem(String name) {
    boolean found = false;

    for (Item t : itemList) {
      if (t.getName().equals(name)) {
        earnings += t.getCost();

        System.out.println("\n" + t.getName() + " was sold.");
        System.out.println("The sale is " + earnings + ".");

        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("\nThe store doesn't sell it.");
    }
  }

  // checks if an item exists in the store
  public void sellItem(Item i) {
    boolean found = false;

    for (Item k : itemList) {
      if (itemList.contains(i)) {
        earnings += i.getCost();

        System.out.println("\n" + i.getName() + " was sold.");
        System.out.println("The sale is " + earnings + ".");

        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("\nThe store doesn't sell it.");
    }
  }

  // adds item to store's itemList
  public void addItem(Item i) {
    itemList.add(i);
  }

  // displays items of a certain type
  public void filterType(String type) {
    System.out.println("\nItems of the " + type + " type.");

    for (Item m : itemList) {
      if (m.getType().equals(type)) {
        System.out.println(m.getName());
      }
    }
  }

  // displays items with less than or equal cost to given
  public void filterCheap(double maxCost) {
    System.out.println("\nItems with costs lower or equal to " + maxCost + ".");

    for (Item c : itemList) {
      if (c.getCost() <= maxCost) {
        System.out.println(c.getName());
      }
    }
  }

  // displays items with greater than or equal cost to given
  public void filterExpensive(double minCost) {
    System.out.println("\nItems with costs higher or equal to " + minCost + ".");

    for (Item e : itemList) {
      if (e.getCost() >= minCost) {
        System.out.println(e.getName());
      }
    }
  }

  // displays name and earning for each store
  public static void printStats() {
    System.out.println("\nStore Stats:");

    for (Store s : storeList) {
      System.out.println("\nName: " + s.getName());
      System.out.println("Earnings: " + s.getEarnings());
    }
  }

}