public class Memory {
    private double value;
    public void addMemory(double newvalue) {
        value +=newvalue;
    }
    public double recallMemory(){
        return value;
    }
    public double clearMemory(){
        return 0.0;
        //value=0.0;
    }

}
