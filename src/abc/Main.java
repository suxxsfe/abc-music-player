package abc;

public class Main{
	public static void main(String argv[]){
        String abc = "X:1\n"
            		+"T:Piece No.1\n"
            		+"M:4/4\n"
            		+"L:1/4\n"
            		+"Q:1/4=140\n"
            		+"K:C\n"
            		+"C C C C C | E3/4 D/4 E3/4 F/4 G2 |]\n";
        String abc2 = "C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 |]";
        
        AbcMusic sample = AbcMusic.parse("C C C");
	}
}

