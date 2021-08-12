package com.placement.example;

//https://www.geeksforgeeks.org/rearrange-characters-form-palindrome-possible/
public class PallindromeMakingGFG
{
    static String isPossible (String S)
    {
        int a[] = new int[256];
        
        //RACRCAR
        //ABAA
        
        for(int  i = 0 ; i < S.length() ; i++){
            a[S.charAt(i)]++;
        }
        
        int oddCount = 0 ;
        char oddChar = '\0';
   
        
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != 0){
      
                if((a[i] % 2 != 0)){
                   oddCount++ ;
                   oddChar = (char)i;
                }
                
                if(oddCount > 1)
                {
                    return "NOT POSSIBLE";
                }
            }
        }
       
        String first = "";
        String last = "";
        
        //RACECAR
        
        for(int i = 0 ; i < a.length ; i++){
        	if(a[i] != 0) {
        		 String ss = "";
        		for (int j = 0; j < a[i]/2; j++) {
					ss = ss + (char)i;
				}
        		
        		first = first + ss;
        		last = ss + last;
        	}
        }
        
        
        System.out.println(first +oddChar +last);
        
        return "YES";
    }
    
    public static void main(String[] args) {
		System.out.println(isPossible("MAADM"));
	}
}


















