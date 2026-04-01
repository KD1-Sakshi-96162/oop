package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {

    static int counter = 0;

    // menu function
    public static int menuList() {
    	Scanner sc = new Scanner(System.in);
    	int choice;
    	System.out.println("---------------------------------------");
        System.out.println("0.Exit");
        System.out.println("1.Add Mango");
        System.out.println("2.Add Orange");
        System.out.println("3.Add Apple");
       System.out.println("4.Display fruit names");
      System.out.println("5.Display all fresh fruits");
        System.out.println("6.Display tastes of stale fruits");
       System.out.println("7.Mark fruit stale (by index)");
        System.out.println("8.Mark all sour fruits stale");
        System.out.print("Enter choice: ");
        choice=sc.nextInt();
        return choice;
        
    }

    // add functions
    public static void addMango(Fruit[] basket, int size) {
        if (counter < size)
            basket[counter++] = new Mango("Mango", "Yellow", 1.2);
        else
            System.out.println("Basket full!");
    }

    public static void addOrange(Fruit[] basket, int size) {
        if (counter < size)
            basket[counter++] = new Orange("Orange", 0.8,"Orange");
        else
            System.out.println("Basket full!");
    }

    public static void addApple(Fruit[] basket, int size) {
        if (counter < size)
            basket[counter++] = new Apple("Apple", 0.5,"Red");
        else
            System.out.println("Basket full!");
    }
    
    public static void displayCWT(Fruit[] basket,int size) {
    	for(Fruit f : basket) {
            if(f != null && f.isFresh())
                System.out.println(f + " Taste=" + f.taste());
        }
    }
    public static void displayStaleFruit(Fruit[] basket,int size) {
    	for(Fruit f : basket) {
            if(f != null && !f.isFresh())
                System.out.println(f.taste());
        }
    }
    
    public static void MarkStale(Fruit[] basket,int size) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter index: ");
        int index = sc.nextInt();

        if(index >= 0 && index < counter) {
            basket[index].setFresh(false);
        } else {
            System.out.println("Invalid index!");
        }
    }
    
    public static void MarkAllStale(Fruit[] basket,int size) {
    	for(Fruit f : basket) {
            if(f != null && f.taste().equals("sour")) {
                f.setFresh(false);
            }
        }
    }
    
    
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int size = sc.nextInt();

        Fruit[] basket = new Fruit[size];

        int choice;
   
           while((choice=menuList())!=0) {
            switch (choice) {
                case 1: addMango(basket, size);
                        break;
                case 2: addOrange(basket, size); 
                        break;
                case 3: addApple(basket, size); 
                         break;
                case 4:
                	for (Fruit fruit : basket) {
                		System.out.println(fruit);
                	}
                	break;
                		
                case 5:
                	displayCWT(basket,size);
                     break;
                case 6:
                	displayStaleFruit(basket,size);
                    break;
                    
                case 7:
                	MarkStale(basket,size);
                    break;
                    
                case 8:
                	MarkAllStale(basket,size);
                    break;
              
            }

          }
    }
}