public class Calculator {
    public Memory memory=new Memory();
    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double  multiplication(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
        double result =0.0;
        try{
           result =a/b;



        }catch(ArithmeticException e){
            System.out.println("ArithmeticException => " + e.getMessage());

        }
return result;

    }
    public static double square(double a){
        if(a<0){
            System.out.println("Numri eshte negativ.");
            return 0.0;
        }else{

           return Math.sqrt(a);

        }
    }
    public void addMemory(double value){
        memory.addMemory(value);
    }
    public void recallMemory(double value){
        memory.recallMemory();
    }
    public void clearMemory(double value){
        memory.clearMemory();

    }

}
