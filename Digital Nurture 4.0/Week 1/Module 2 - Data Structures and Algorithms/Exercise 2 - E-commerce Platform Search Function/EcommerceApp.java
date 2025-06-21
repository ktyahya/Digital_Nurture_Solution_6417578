import java.util.*;
public class EcommerceApp{
    public static void main(String args[]){
        List<Product> products = new ArrayList<>();

    
        products.add(new Product(1, "Product 1", "Rat 1"));
        products.add(new Product(2, "Product 2", "cat 2"));
        products.add(new Product(3, "Product 3", "mouse 3"));
        products.add(new Product(4, "Product 4", "rabbit 4"));
        products.add(new Product(5, "Product 5", "dog 5"));

      
        
   
        Product prodWithId5 = linearSearchByProdID(5, products);
        printResult(prodWithId5);

       
        Product prodWithId10 = linearSearchByProdID(10, products);
        printResult(prodWithId10);

       
        prodWithId5 = binarySearchByID(5, products);
        printResult(prodWithId5);

       
        prodWithId10 = binarySearchByID(10, products);
        printResult(prodWithId10);

    }

    
    public static Product linearSearchByProdID(int productID, List<Product> products){
        for(Product k : products){
            if(k.productID == productID) return k;
        }
        return null;
    }

    public static Product linearSearchByProdName(String productName, List<Product> products){
        for(Product k : products){
            if(k.productName.equalsIgnoreCase(productName)) return k;
        }
        return null;
    }


    public static Product binarySearchByID(int productID, List<Product> products){
        int n = products.size();
        int l = 0, r = n-1;
        int mid = 0;

        while(l <= r){
            mid = (int)(l+r)/2;
            Product curr = products.get(mid);
            if(curr.productID == productID) return curr;
            else if(curr.productID < productID) l=mid+1;
            else r = mid-1;
        }

        return null;
    }

  
    public static void printResult(Product prod){
        if(prod != null){
            System.out.println("Product found!");
            System.out.println(prod);
        }
        else{
            System.out.println("Product Didnt Exist");
        }
        System.out.println();
    }
}
class Product{
   
    int productID;
    String productName;
    String category;

    Product(int productID, String productName, String category)
    {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString(){
        return "Product Id: " + String.valueOf(productID) + "\n" + "Product Name: " + productName + "\n" + "Product Category: " + category ; 
    }
}

