
public class Demo1 {

	public String n;
	
	public Demo1(String name)
	{
		n=name;
	}
	public static void main(String[] args)
	{
		String name[]= {"Sumit","Abhishek","Rajat","Anubhav"};
		findNamesStartingWithA(name);
	
	}
		public static void findNamesStartingWithA(String name[])
		{
            try {
			Demo1 ob1 = new Demo1(name[0]);
			Demo1 ob2 = new Demo1(name[1]);
			Demo1 ob3 = new Demo1(name[2]);
			Demo1 ob4 = new Demo1(name[3]);	
			
			String nameswithA[] = new String[4];
			int i=0;
		if(ob1.n.charAt(0)=='A')
		{
		   nameswithA[i]=ob1.n;
		   i++;
		}
		
		if(ob2.n.charAt(0)=='A')
		{
			nameswithA[i]=ob2.n;
			i++;
		}
		if(ob3.n.charAt(0)=='A')
		{
			nameswithA[i]=ob3.n;
			i++;
		}
		if(ob4.n.charAt(0)=='A')
		{
			nameswithA[i]=ob4.n;
			i++;
		}
		
		for(int j=0;j<nameswithA.length;j++)
		{   
			if(nameswithA[j]!=null)
			{
			System.out.println(nameswithA[j]);
			}
			
		}
		
           }//try
           
           catch(Exception e)
           {
        	   System.out.println(e);
           }
           finally
           {
        	   System.out.println("finally executed");
           }
		
	}

}

