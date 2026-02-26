package abstraction;

abstract class AbstractExampleBank {
    String Branch;

    AbstractExampleBank(String Branch)
    {
        this.Branch=Branch;
        System.out.println("Inside parent constructor: "+Branch);
    }
    abstract void calculateInterest();
}

class hdfcbank extends AbstractExampleBank{

    hdfcbank(String Branch)
    {
        super(Branch);

        System.out.println("inside HDFC constructor: "+Branch);

    }

    void calculateInterest(){
        System.out.println("Interest is: 10%");
    }
}

class Bank{
    public static void main(String[] args) {
        hdfcbank hdfc=new hdfcbank("Manjunathnagar");

        hdfc.calculateInterest();
    }
}


