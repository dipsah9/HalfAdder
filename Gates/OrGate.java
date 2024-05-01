package HalfAdder.Gates;
public class OrGate extends Gate{

    public OrGate(){
        super("Or ");
    }
    @Override
    public boolean evaluate(boolean a, boolean b){
       return a || b;
    }
}