class Tostring
{
	/*int roll;
	String name;
	Tostring(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public String toString()
	{
		return roll+""+name;
	}
	public static void main(String args[])
	{
		Tostring s1=new Tostring(101,"asha");
		Tostring s2=new Tostring(102,"shinde");
		System.out.println(s1);
		System.out.println(s2);
	}*/
	/*public static void main(String args[])
	{	String str="this is asha";
		String words[]=str.split("\\s");  
		String revWord=""; 
		
		for(String w:words)
		{  	
			String rev="";
			int len=w.length();
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+w.charAt(i);
			}
			revWord=revWord+rev+" ";  
		}   
		System.out.println(revWord); 
    }*/
	public static void referenceCheck(Object x, Object y) {  
        if (x == y) {  
            System.out.println("Both pointing to the same reference");  
   
        } else {  
            System.out.println("Both are pointing to different reference");  
        }  
    }  
    public static void main(String[] args) {  
        String st1 = "Java";  
        String st2 = "Java";  
        System.out.println("Before Modification in st1");  
        referenceCheck(st1, st2);  
        st1 += "ava";  
		System.out.println(st1);
        System.out.println("After Modification");  
        referenceCheck(st1, st2);  
    }  

}