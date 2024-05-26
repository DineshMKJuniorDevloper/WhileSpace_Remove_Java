package java_APP;

public class Remove_Whiltspc {

	public static void main(String[] args) {
	
		String s = "    I    am   New    in   java     ";
		
		boolean space= false;
		String emp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				emp = emp+s.charAt(i);
				space =true;
			}
			else if(space==true)
			{
				emp = emp+s.charAt(i);
				space=false;
			}
		}
		
		System.out.println(emp);
		String re = "";
		for(int i=0;i<emp.length()-1;i++)
		{
			re = re + emp.charAt(i);
		}
		System.out.println(re);
		
	}

}
