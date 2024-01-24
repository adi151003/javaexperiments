class p
{
	private int a = 10;
	int c= 3;
	void d()
	{
		System.out.println("I am parent");
}
}

class c extends p
{
	int b = 2;
	public static void main(String args[]){
	c obj =  new c();
	System.out.println(obj.a);
	System.out.println(obj.c);
}
}