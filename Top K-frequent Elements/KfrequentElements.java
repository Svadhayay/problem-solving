  Map<Integer, Integer> countMap = new HashMap<>();

    int maxFreq = 0;
    for(int i = 0; i < nums.length; i++) 
        {
            int freq = countMap.getOrDefault(nums[i],0)+1;         
            countMap.put(nums[i], freq);  
            maxFreq = Math.max(maxFreq, freq);            
          }
    List<Integer>[] bucket = new ArrayList[maxFreq + 1];
    for(int n : countMap.keySet()) 
    {
        int freq = countMap.get(n);
        if(bucket[freq]==null)
        bucket[freq] = new ArrayList<>();
        bucket[freq].add(n);
    }
    int[] resultArr = new int[k];
    int count = 0;

    for(int i = bucket.length-1; i >= 0; i--) {
    if(bucket[i]!=null){
    for (int n : bucket[i]) {
    resultArr[count++] = n;
    if (count == k)  
    return resultArr;
    }
 }
}
return resultArr;