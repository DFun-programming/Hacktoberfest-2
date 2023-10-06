class Hactober{
    static boolean isAnagram(String a, String b) {
        
        // Complete the function
        int aN = a.length();
        int bN = b.length(); 
        if(aN != bN)
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] first = new int[26];
        int[] second = new int[26];
        for(int i = 0 ; i<aN;i++)
        {
            char c = a.charAt(i);
            int index = c - 'a';
            first[index]++; 
        }
         for(int i = 0 ; i<bN;i++)
        {
            char c = b.charAt(i);
            int index = c - 'a';
            second[index]++; 
        }
        for(int i = 0; i<first.length;i++)
        {
            if(first[i]>0 || second[i]>0)
            {
                if(first[i] != second[i])
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}
