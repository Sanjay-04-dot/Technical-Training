package Methods;

public class TypesOfConstructors {

    TypesOfConstructors(){
        System.out.println("this is a default constructor");
    }

    TypesOfConstructors(int a, int b){
        this();
        System.out.println("this is a Parametersied constructor, Sum: "+(a+b));
    }

    public static void main(String[] args) {
//    TypesOfConstructors con1 = new TypesOfConstructors();
    TypesOfConstructors con2 = new TypesOfConstructors(5,11);
    }
}

