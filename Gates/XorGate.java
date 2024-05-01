package HalfAdder.Gates;
public class XorGate extends Gate{
        private AndGate andgate;
        private OrGate orgate;

        public XorGate(){
             super("xor");
            andgate = new AndGate();
            orgate = new OrGate();
           
        }

        @Override
        public boolean evaluate(boolean a, boolean b){
            boolean notA = !a;
            boolean notB = !b;

            boolean minTerm1 = andgate.evaluate(notA,b);
            boolean minTerm2 = andgate.evaluate(a, notB);

            return orgate.evaluate(minTerm1, minTerm2);
        }

}