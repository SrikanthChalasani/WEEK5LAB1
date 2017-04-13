import java.util.ArrayList;
import java.util.List;


public class Order { 
      
      
      public static double calculateOrderCost(List<Book> books)
      {
    	  double cost=0;
    	  for(IBook book : books)
    	  {
    		  cost = cost + book.calculateCost();
    	  }
    	  return cost;
      }    
     
}
