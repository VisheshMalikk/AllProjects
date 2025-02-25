package staticImports;

//import static staticImports.A.add;
//import static staticImports.A.sub;
//import static staticImports.A.show;
// Or we can use below import to add only static members from Class A
import static staticImports.A.*;


public class Runner {

	public static void main(String[] args) {
		show();
		add();
		sub();
	}
	
}
