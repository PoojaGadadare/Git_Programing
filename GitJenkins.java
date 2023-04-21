package day4;

public class GitJenkins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char  k='A';
    for(int i=1;i<=5;i++)
    {
	  k='A';
      for(int j=5;j>=i;j--)
        {
	     System.out.print(" "+ k++);
        }
     System.out.println();
     }
  }
}