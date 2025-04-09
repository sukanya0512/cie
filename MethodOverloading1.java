public class MethodOverloading1 {    
      
      static void display(int a) {  
          System.out.println("Value of a is: " + a);  
      }  
  
       
      void display(int a, int b) {  
          System.out.println("Value of a and b is: " + a + " and " + b);  
      }  
  
     
      public static void main(String[] args) {  
          display(5);  
  
          MethodOverloading1 obj = new MethodOverloading1();  
          obj.display(5, 7); 
      }  
  }
  