class Solution {
    static int setBits(int N) {
        
        // Basicaly Binary numbers is in from of 0 and 1 represents the value 8s , 4s , 2s , 1s 
        //  1st Brustforc approach 
        
        // for number less then 15;
        
        // if(N>15) return 4;
        // while(N<15){
        // if(N==1 || N==2 || N == 4 || N==8 ) 
        //     return 1;
        // else if(N==7 || N==11 || N==13 || N==14)
        //     return 3;
        
        // else
        //     return 2;
        // }
        // return 0;
        
        // 2nd Approch let's add the N into string and than check its's setbit and return 
        
        // converting the decimal to Binary form  storing into the String
        
        String bits = Integer.toBinaryString(N);
        
        int setbits=0;
        
        // iterating over the String and checking each index val if it mathc than doing setbits++ 
       for(int i=0;i<bits.length();i++){
           if(bits.charAt(i)=='1')
           setbits++;
       }
       return setbits;
    }
}