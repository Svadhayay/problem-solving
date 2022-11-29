        if(strs==null || strs.length==0)
            return new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();
        
        for(String s: strs)
        {
            char [] count = new char[26];
            for(char c : s.toCharArray())
                count[c-'a']++;
                String keyStr = String.valueOf(count);
                if(!map.containsKey(keyStr))
                {
                    map.put(keyStr , new ArrayList<>());
                }
                
                map.get(keyStr).add(s);
        }
        
        return new ArrayList<>(map.values());