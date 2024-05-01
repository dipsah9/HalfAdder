package HalfAdder.Gates;
public class Gate{

    String symbol;

    public Gate(String symbol){
        this.symbol = symbol;
    }


    public boolean evaluate(boolean a, boolean b){
        return false;
    }


    public void table(){
        boolean result = false;
        System.out.println("|------|------|--------|");
        System.out.printf("|   a  |   b  |  %s   |\n", this.symbol);
        
        

        for(boolean value1: new boolean[]{false, true}){
            for(boolean value2: new boolean[]{false, true}){
                result = evaluate(value1,value2);
                int a = value1 ? 1: 0;
                int b = value2 ? 1: 0;
                int result_as_int = result ? 1: 0;
                
                System.out.println("|------|------|--------|");
                System.out.printf("|   %d  |   %d  |    %d   |\n", a, b , result_as_int);
            }

        }

        
    }

}