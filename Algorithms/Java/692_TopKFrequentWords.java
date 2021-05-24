class Solution {    //  11 ms   38.6 MB
    public List<String> topKFrequent(String[] words, int k) {
        var map = new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i]) == false){
                map.put(words[i],1);
            }
            else{
                map.replace(words[i],(map.get(words[i])+1));
            }
        }

        var list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                if(o1.getValue() == o2.getValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return (o2.getValue()-o1.getValue());
            }
        });

        var result = new ArrayList<String>();

        for (Map.Entry<String, Integer> mapping : list) {
            result.add(mapping.getKey());
        }

        result = new ArrayList<String>(result.subList(0,k));
        return result;
    }
}