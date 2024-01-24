class cgpa{
public static void main (String[]args){
	System.out.println("NAME - ADITYA TUTEJA");
	System.out.println("SAP ID - 500091726");
	System.out.println("Marks in JAVA--->"+args[0]);
	System.out.println("Marks in PYTHON--->"+args[1]);
	System.out.println("Marks in STATS--->"+args[2]);
	Float java,python,stats,avg,cgpa;
	java=Float.parseFloat(args[0]);
	python=Float.parseFloat(args[1]);
	stats=Float.parseFloat(args[2]);
	if(java <100 && java>=85)
	{	
		System.out.println("You got an O grade in JAVA");
	}
	else if(java <84 && java>=70)
	{
		System.out.println("You got an A grade in JAVA");
	}
	else if(java <69 && java>=55)
	{
		System.out.println("You got an B grade in JAVA");
	}
	else if(java <54 && java>=35)
	{
		System.out.println("You got an C grade in JAVA");
	}
	else if(java<35)
	{
		System.out.println("You are failed in JAVA");
	}

	if(python <100 && python>=85)
	{
		System.out.println("You got an O grade in PYTHON");
	}
	else if(python <84 && python>=70)
	{
		System.out.println("You got an A grade in PYTHON");
	}
	else if(python <69 && python>=55)
	{
		System.out.println("You got an B grade in PYTHON");
	}
	else if(python <54 && python>=35)
	{
		System.out.println("You got an C grade in PYTHON");
	}
	else if(python<35)
	{
		System.out.println("You are failed in PYTHON");
	}

	if(stats <100 && stats>=85)
	{	
		System.out.println("You got an O grade in STATS");
	}
	else if(stats <84 && stats>=70)
	{
		System.out.println("You got an A grade in STATS");
	}
	else if(stats <69 && stats>=55)
	{
		System.out.println("You got an B grade in STATS");
	}
	else if(stats <54 && stats>=35)
	{
		System.out.println("You got an C grade in STATS");
	}
	else if(stats<35)
	{
		System.out.println("You are failed in STATS");
	}
	avg=(java+python+stats)/3;
	cgpa=avg/10;
	if(cgpa<3.5)
	{
		System.out.println("CGPA not generated");
	}
       	else
	{
		System.out.println("CGPA is:"+cgpa);
	}
}
}