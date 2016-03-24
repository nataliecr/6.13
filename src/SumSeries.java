import java.util.Scanner;

public class SumSeries {
  public static void main(String[] args){
    System.out.println("i             m(i)");
    System.out.println("--------------------------");
    
    for(int i = 1; i <= 20; i++){
      System.out.printf("%-10d", i);
      System.out.printf("%11.4f", ComputeSeries(i));
      System.out.println();
    }
  } // main
  
  static double ComputeSeries(int num){
    double sum = 0;
    
    for (double i = 1.0; i <= num; i++)
      sum += (i / (i+1)); 
    
    return sum;
  } // ComputeSeries
} // SumSeries
