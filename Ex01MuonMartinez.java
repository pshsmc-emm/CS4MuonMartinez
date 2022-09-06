/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.muon.martinez;

/**
 *
 * @author MUON
 */
public class Ex01MuonMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String store1 = "CS Bakery";
        String bestseller1 = "Fried Tofu";
        int foodRanking1 = 7;
        
        String store2 = "ADT Store";
        String bestseller2 = "Sticky Rice Cakes";
        int foodRanking2 = 2;
        
        String store3 = "VE Eatery";
        String bestseller3 = "Fruit Salad";
        int foodRanking3 = 10;
        
        int rankingSum = foodRanking1 + foodRanking2 + foodRanking3;
        int aveRanking = rankingSum / 3;
        
        if(foodRanking1 == foodRanking2) {
            System.out.print("CS Bakery and ADT Store have equal rankings.");
        } if(foodRanking1 == foodRanking2) {
            System.out.print("CS Bakery and ADT Store have equal rankings.");
        }
        
        System.out.print("");
    }
    
}
