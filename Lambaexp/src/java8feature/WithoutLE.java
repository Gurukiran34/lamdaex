package java8feature;
	
interface addition
{
	int add(int a,int b);
}
class imple implements addition
{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
public class WithoutLE {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         imple i = new imple();
         System.out.println(i.add(10,20));
      
	}

}
