package first;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			   String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
			    String[] arrSplit = strMain.split(", ");
			    for (int i=0; i < arrSplit.length; i++)
			    {
			      System.out.println(arrSplit[i]);
			    }
			    String strMain1 = "Alpha, Beta, Delta, Gamma, Sigma";
			    String[] arrSplit_2 = strMain1.split(", ", 2);
			    for (int i=0; i < arrSplit_2.length; i++){
			      System.out.println(arrSplit_2[i]);
			  }
			    String strMain2 ="Welcome to Guru99"; 
			    String[] arrSplit_3 = strMain2.split("\\s");
			        for (int i=0; i < arrSplit_3.length; i++){
			          System.out.println(arrSplit_3[i]);
			        }

			        String str = "geekss@for@geekss";
			        String[] arrOfStr = str.split("@", 2);
			        for (String a : arrOfStr)
			            System.out.println(a);
	
			        String str1 = "468-567-7388";
			        String[] arrOfStr1 = str1.split("8",2); 
			        System.out.println("Output when limit is +ve");
			         System.out.println("Number of substrings: "+arrOfStr1.length);
			        
			         for(int i=0; i<arrOfStr1.length; i++)
			         {
			             System.out.println("str["+i+"] : "+arrOfStr1[i]);
			         }
			 
			         String[] arrOfStr2 = str1.split("8",-3); 
			         System.out.println("nOutput when limit is -ve");
			         System.out.println("Number of substrings: "+arrOfStr2.length);
			          
			         for(int i=0; i<arrOfStr2.length; i++)
			         {
			             System.out.println("str["+i+"] : "+arrOfStr2[i]);
			         }
			         String[] arrOfStr3 = str1.split("8",0); 
			         System.out.println("nOutput when limit is 0");
			         System.out.println("Number of substrings: "+arrOfStr3.length);
			          
			         for(int i=0; i<arrOfStr3.length; i++)
			         {
			             System.out.println("str1["+i+"] : "+arrOfStr3[i]);
			         }
	}
	
	}

