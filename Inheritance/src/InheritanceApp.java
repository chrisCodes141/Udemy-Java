public class Product {
    //Attributes (state) (details of object)
    //setters and getters required for private
    private int Product_ID, price;
    private String name;

    //Constructor
//    Product(int Product_ID, int price, String name{
//        this.Product_ID = Product_ID;
//        this.price = price;
//        this.name = name;
//    }
    // OR
    Product(){
        System.out.println("Product object created");
    }
    // AND
    void setProdcutDetails(int Product_ID, int price, String name){
        this.Product_ID = Product_ID;
        this.price = price;
        this.name = name;
        System.out.println("Data written to Product object");
    }

    class Mobile extends Product{// IS-A relation, Mobile IS-A Product, mobile is child, product is parent
        Mobile(){//mobile object constrcutor

        }
    }
    Mobile mobile = new Mobile();
    mobile.set
    public static void main(String[] args) {

    }
}

public class InheritanceApp{
    public static void main(String[] args) {
        //Create an Object: Product
        Product product = new Product();
        //product is not an object its a ref var that holds hashcode of obj in hexadecimal notation

        //Writing data to object
        product.setProdcutDetails(101, 70000, "iphone");
    }
}