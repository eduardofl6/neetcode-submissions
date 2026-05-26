class Solution {
    private String emptyKey = "7d7f8fd8bb240e09daaaaa249aacaabd";
    private String divKey = "7cc7dc190bcbbfdf270d7c44baae3ca2";


    public String encode(List<String> strs) {
        String string = "";

        if(strs.size() == 0){
            return null;
        }
        for(String s : strs){
            if(s.equals("")){
                string += s + emptyKey; // Empty.
            } else {
                string += s + divKey; // Actual division.
            }
        }

        return string;
    }

    public List<String> decode(String str) {
        if(str == null){
            return new ArrayList<String>();
        }
        
        List<String> list = new ArrayList<>();
        String[] strar = str.split(divKey);

        int emptyOccurences = 0;

        if(str.split(emptyKey).length == 0){
            emptyOccurences = (int) str.length() / (int) emptyKey.length();
            while(emptyOccurences > 0){
                list.add("");
                emptyOccurences--;
            }
            
            return list;
        }

        for(String element : strar){
            if(element.equals(emptyKey)){
                list.add("");
            } else if(element.contains(emptyKey)){
                String[] emptys = (element.replace(emptyKey, emptyKey + divKey)).split(divKey);
                for(String subelement : emptys){
                    if(subelement.equals(emptyKey)){
                        list.add("");
                    } else {
                        list.add(subelement);
                    }
                }
            }else {
                list.add(element);
            }
        }
            
        
        
        return list;
    }
}
