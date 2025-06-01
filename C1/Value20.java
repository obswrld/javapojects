public class Value20{
	public static void main(String[] args){
	int var1 = 10;
	int var2 = 15;	
	int var3 = 20;
	int temp = 0;
	int temp2 = 0;
	int temp3 = 0;

	temp = var1;
	temp2 = var2;
	temp3 = var3;

	var1 = temp2;
	var2 = temp3;
	var3 = temp;

	
	
	
	System.out.println("var1 = " + var1);
	System.out.println("var2 = " + var2);
	System.out.println("var3 = " + var3);

	}
}