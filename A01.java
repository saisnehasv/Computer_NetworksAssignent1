public class A01 
  {
	public static boolean isValid(int []ip) 
	{
	  if (ip.length == 4)
	  { 
		for (int i : ip) 
		{
		    if ((i>=0) && (i<=255)) 
		    {
			   return true;
		    }
		    else 
		    	return false;
	    }
	  }
	  return false;
   }
	public static boolean  isPublicallyAssignable(int [] ip) 
	   {
		   int i,j = -1,k = -1,l = -1;
		    i=ip[0];
			   if((i>=1 && i<=9)||(i>=11 && i<=126)||(i>=128)&&(i<=239))
			   {
				   j=ip[1];
				   if((j>=0) && (j<=255))
				   {
					    k=ip[2];
					   if((k>=0) && (k<=255))
					   {
						    l=ip[3];
						   if((l>=1) && (l<=255))
							   return true;
					   }
				   }
			    }
			   else if(i==127)
				   if((j==0) && (k==0) && (l>=1) && (l<=255))
					   return true;
			   return false;
			   
		}
	

	public static void main(String[] args) {
		
		String ipaddress=args[0];
		
		String [] ipaddr = ipaddress.split("\\.");
		
	    int [] ip=new int [ipaddr.length];
		
		for(int i=0;i<ipaddr.length;i++)
			ip[i]=Integer.parseInt(ipaddr[i]);
		
		if(isValid(ip) )
      	{
      	  System.out.println(ipaddress+" is valid");
      	  if(isPublicallyAssignable(ip))
	        System.out.println(ipaddress+" is publically assignable");
	      else
	        System.out.println(ipaddress+" is not publically assignable");
      	}
       else
      	System.out.println(ipaddress+" is invalid");
     
}

}


