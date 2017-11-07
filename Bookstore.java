package com;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

class Bookstore
{
  double budget = 0.0D; double initialPrice = 0.0D; double discount = 0.0D; double floor = 0.0D;
  Map<String, Double> books = new HashMap();
  double balance = 0.0D;
  
  Bookstore(double bud, double ini, double dis, double flo) {
    budget = (this.balance = bud);
    initialPrice = ini;
    discount = dis;
    floor = flo;
  }
  
  public static void main(String[] args) {
    try {
      double budget = Double.parseDouble(args[0]);
      double initialPrice = Double.parseDouble(args[1]);
      double discount = Double.parseDouble(args[2]);
      double floor = Double.parseDouble(args[3]);
      
      if (validateInputs(budget, initialPrice, discount, floor)) {
        Bookstore myStore = new Bookstore(budget, initialPrice, discount, floor);
        System.out.println(myStore.buyBooks());
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.toString() + " Please enter the required number of arguments.");
    }
    catch (NumberFormatException e) {
      System.out.println(e.toString());
    }
    catch (Exception e) {
      System.out.println(e.toString());
    }
  }
  
  public static boolean validateInputs(double bud, double ini, double dis, double flo) {
    if ((bud < 0.0D) || (bud > Math.pow(10.0D, 9.0D))) {
      System.out.println("Please retry with a valid Budget. Budget range: 0 < Budget < 10^9");
      return false; }
    if ((ini < 0.0D) || (ini > Math.pow(10.0D, 9.0D)))
    {
      System.out.println("Please retry with a valid Initial Price. Initial Price range: 0 < Initial Price < 10^9");
      return false; }
    if ((dis < 0.0D) || (dis > ini)) {
      System.out.println("Please retry with a valid Discount. 0 < Discount < Initial Price");
      return false; }
    if ((flo < 0.0D) || (flo > ini)) {
      System.out.println("Please retry with a valid Floor Price. 0 < FLoor Price <  Initial Price");
      return false;
    }
    return true;
  }
  
  public String buyBooks()
  {
    double bookPrice = initialPrice;
    int count = 0;
    
    while (balance >= bookPrice) {
      count++;
      books.put(count, Double.valueOf(bookPrice));
      
      balance -= bookPrice;
      
      if (bookPrice != floor)
      {

        if (bookPrice - discount < floor) {
          bookPrice = floor;
        } else {
          bookPrice -= discount;
        }
      }
    }
    DecimalFormat twoDForm = new DecimalFormat("#.##");
    String result = count + " Books, $" + twoDForm.format(balance) + " remaining";
    





















    return result;
  }
}