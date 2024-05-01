package HalfAdder.Gates;

public class AndGate extends Gate{

    public AndGate(){
        super("And");
    }

    @Override
    public boolean evaluate(boolean a, boolean b){
        return a & b;
    }
}