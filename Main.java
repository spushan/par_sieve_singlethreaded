class Main { 
    
    public static void sieve(int n) {
        
        boolean pArray[] = new boolean[n+1]; 
        
        for(int i=0; i < n; i++) {
            pArray[i] = true; 
        }
        
        for(int i = 2; i*i <=n; i++) { 
            if(pArray[i] == true) { 
                for(int j=i*i; j <= n; j += i) 
                    pArray[j] = false; 
            } 
        } 
          
         for(int i=2; i <= n; i++) { 
             if(pArray[i] == true) 
                 System.out.println(i); 
         } 
    } 
      
    public static void main(String args[]) { 
        int n = 1000000; 
        long start = System.currentTimeMillis();
        sieve(n);
        long end = System.currentTimeMillis();
        System.out.println("Time of execution: " + (end-start) + " milisecond"); 
    } 
} 
  
