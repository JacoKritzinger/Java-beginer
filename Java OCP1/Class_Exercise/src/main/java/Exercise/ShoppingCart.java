package exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
      Item item1, item2;
      item1 = new Item();
      item2 = new Item();
      
 
    item1.desc = "shirt";
      item2.desc = "Pants";
    
    item1 = item2;
    System.out.println("item1: "+ item1.desc);
    System.out.println("item2: "+ item2.desc);
    
    
    }
}
