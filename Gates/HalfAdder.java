package HalfAdder.Gates;

public class HalfAdder{
        XorGate xorgate = new XorGate();
        AndGate andgate = new AndGate();
        OrGate orgate = new OrGate();

        Gate[] gate = {xorgate, andgate};
        
        public boolean[] add(boolean a, boolean b){
            boolean s = gate[0].evaluate(a, b);
            boolean c = gate[1].evaluate(a,b);
            return new boolean[]{s,c};
        }

      public void info(){
           for(Gate g: gate){
               g.table();
               System.out.println();
           }


        }
        
}