package vinjuyi;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//- See more at: http://www.java2novice.com/java-interview-programs/duplicate-string-character-count/#sthash.gw6nmPNZ.dpuf
public class VinrepeatChar {
    public void findDuplicateChars(String str){
        
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        //System.out.println();
        char[] chrs = str.toCharArray();
        System.out.println(chrs);
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
            	//System.out.println(ch);
                dupMap.put(ch, dupMap.get(ch)+1);
               // System.out.println((ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        //System.out.println(keys);
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){

               //System.out.println(dupMap.get(ch));
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VinrepeatChar dcs = new VinrepeatChar();
	        dcs.findDuplicateChars("javaessential");
	
	}

}
