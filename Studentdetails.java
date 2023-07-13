import java.io.*; 
class Studentdetails{
	public static void main(String[]args){
		DataInputStream inp = new DataInputStream(System.in);
		try{
		int sno,m1,m2,m3,m4,m5;
		String sname;
		System.out.println("Enter the sno");
		sno = Integer.parseInt(inp.readLine());
		System.out.println("Enter the sname");
		sname = inp.readLine();
		System.out.println("Enter the mark1");
		m1 =  Integer.parseInt(inp.readLine());
		System.out.println("Enter the mark2");
		m2 =  Integer.parseInt(inp.readLine());
		System.out.println("Enter the mark3");
		m3 =  Integer.parseInt(inp.readLine());
		System.out.println("Enter the mark4");
		m4 =  Integer.parseInt(inp.readLine());
		System.out.println("Enter the mark5");
		m5 =  Integer.parseInt(inp.readLine());
		

		System.out.println("The Student Number is :"+ sno);
		System.out.println("The Student Name is :"+ sname);
		System.out.println("Tamil 	    :"+  m1);
		System.out.println("English 	    :"+  m2);
		System.out.println("Maths is 	    :"+  m3);
		System.out.println("Science	    :"+  m4);
		System.out.println("SocialScience  :"+  m5);
		System.out.println("                         "+"---------");
		System.out.println("Total Mark="+(m1+m2+m3+m4+m5)+"/500");
		System.out.println("                         "+"---------");
		System.out.println("Percentage is "+((m1+m2+m3+m4+m5)/5)+"%");		
		}catch(Exception e){
			System.out.println("Invaild Data");
		}
	}
}