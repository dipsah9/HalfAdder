package HalfAdder.Gates;

public class NotGate extends Gate{

    public NotGate(){
        super("Not");
    }

    @Override 
    public boolean evaluate(boolean a, boolean b){
        return !a;  
    }
}