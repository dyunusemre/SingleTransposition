public class SingleTransposition {
	public SingleTransposition() {
	}
    public String fixSinglePosition(String str1, String str2) {
        if(str1.length() == str2.length() 
            && letterTypeMatches(str1,str2)
            && fixPosition(str1,str2)) {
                str1 = str2; // commet from mine
        }
        return str1;
    }
    public boolean letterTypeMatches(String str1, String str2) {
        String temp = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if(str1.substring(i,i+1).equals(str2.substring(j, j+1))) {
                    temp += str1.substring(i,i+1);
                    break;
                }
            }
        }
        return str1.equals(temp) ? true : false;
    }
    public boolean fixPosition(String str1, String str2) {
    	for(int i = 0; i < str1.length()-1 ; i++) {
    		if(str1.substring(i, i+1).equals(str2.substring(i, i+1))) {
    			continue;
    		}else {
    			if(str1.substring(i, i+1).equals(str2.substring(i+1,i+2)) &&
    					str2.substring(i,i+1).equals(str1.substring(i+1, i+2))) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
}
