 if(s.length() != t.length())
        {
            return false;
        }
        
        int [] val = new int[26];
        
        for(int i = 0 ; i<s.length() ; i++)
            val[s.charAt(i)-'a']++;
        
        for(int j=0 ; j <t.length() ; j++)
        {
             val[t.charAt(j)-'a']--;
        }
        
        for(int i = 0 ;i<val.length ; i++)
        {
            if(val[i]!=0)
                return false;
        }
        
        return true;