package Encapsulation;

public class EncapsulationDemo {
    private String name;
    private int usn;

    EncapsulationDemo(String name,int usn){
        this.name=name;
        this.usn=usn;
    }

    void setName(String name){
        this.name=name;
    }

    void setusn(int usn){
        this.usn=usn;
    }

    String getName(){
        return name;
    }

    int getUsn(){
        return usn;
    }

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Name: "+usn);
    }



    public static void main(String[] args) {
        EncapsulationDemo demo=new EncapsulationDemo("sanjay",409);

        demo.Display();
        demo.setusn(123);
        demo.Display();
    }

}
