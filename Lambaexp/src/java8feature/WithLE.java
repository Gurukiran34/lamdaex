package java8feature;
interface addition1
{
	int sum(int x,int y);
}

public class WithLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      addition1 a1=(x,y)->(x+y);
      System.out.println(a1.sum(100,20));
	}

}

