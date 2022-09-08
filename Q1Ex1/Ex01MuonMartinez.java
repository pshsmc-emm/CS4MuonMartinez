/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.muon.Q1Ex1;

/**
 *
 * @author MUON
 */
public class Ex01MuonMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarating variables for CS Bakery
        String store1 = "CS Bakery";
        String bestseller1 = "Sticky Rice Cakes";
        int foodRanking1 = 7;

        //outputting variables for CS Bakery
        System.out.println("Store 1");
        System.out.println("Name: " + store1);
        System.out.println("Bestseller: " + bestseller1);
        System.out.println("Food Shop Ranking For August: " + foodRanking1 + "\n");

        //declarating variables for ADT Store
        String store2 = "ADT Store";
        String bestseller2 = "Fried Tofu";
        int foodRanking2 = 2;

        //outputting variables for ADT Store
        System.out.println("Store 2");
        System.out.println("Name: " + store2);
        System.out.println("Bestseller: " + bestseller2);
        System.out.println("Food Shop Ranking For August: " + foodRanking2 + "\n");

        //declarating variables for VE Eatery
        String store3 = "VE Eatery";
        String bestseller3 = "Fruit Salad";
        int foodRanking3 = 10;

        //outputting variables for VE Eatery
        System.out.println("Store 3");
        System.out.println("Name: " + store3);
        System.out.println("Bestseller: " + bestseller3);
        System.out.println("Food Shop Ranking For August: " + foodRanking3 + "\n");

        //calculating and printing mean of rankings
        int rankingSum = foodRanking1 + foodRanking2 + foodRanking3;
        int aveRanking = rankingSum / 3;
        System.out.print("The three shops have a mean ranking of " + aveRanking + ".");
        System.out.println(" // operation: addition and division");
      
        //comparing food rankings
        if(foodRanking1 < foodRanking2) {
          System.out.print("CS Bakery has a higher food ranking than ADT Store.");
        } else if(foodRanking1 > foodRanking2) {
          System.out.print("CS Bakery has a lower food ranking than ADT Store.");
        } else {
          System.out.print("CS Bakery and ADT Store have equal food rankings.");
        }
        System.out.println(" // operation: comparison");

        //comparing bestsellers
        if(bestseller2 == bestseller3) {
          System.out.print("ADT Store and VE Eatery have the same bestseller.");
        } else {
          System.out.print("ADT Store and VE Eatery do not have the same bestseller.");
        }
        System.out.println(" // operation: comparison");
          
        System.out.println("\nPlease come again next time!");
    }
}