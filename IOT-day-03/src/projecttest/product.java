package projecttest;
class product{
    String productName;
    double price;

    static{
        System.out.println("Product Class loaded");
    }

    {
        System.out.println("Product Object created");
    }

    product(String productName, double price){
        this.productName=productName;
        this.price=price;
    }

    double calculateDiscount()
    {
        return price;
    }
}

class Electronics extends product{
    int warrantyYears;

    Electronics(String productName,double price,int warrantyYears){
        super(productName,price);
        this.warrantyYears=warrantyYears;
    }

    @Override
    double calculateDiscount(){
        double discount=10;
        double discountprice= price-(price*discount/100);
        return discountprice;
    }

}

class OnlineSHoppingSystem{
    public static void main(String[] args){
    product p =new Electronics("powerbank",250,2);

        double v = p.calculateDiscount();
        System.out.println(v);
    }
}