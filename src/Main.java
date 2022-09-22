public class Main {
    public static void main(String[] args) {
        System.out.println("Enter item price!");
        double itemprice = 99.50;
        double shipping = itemprice*0.02;
        double totalprice = shipping + itemprice;

    if (itemprice >= 100)
    System.out.println("your total price is " + "$" + itemprice);
    else {
        System.out.print("your total price is " + "$" + totalprice);
    }



    }
}