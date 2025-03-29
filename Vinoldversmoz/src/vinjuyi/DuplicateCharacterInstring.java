package vinjuyi;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInstring {
		static void duplicateCharCounting (String inputString){
		Map <Character , Integer> charCountMap = new HashMap <Character , Integer>();
		 char [] strArray = inputString.toCharArray();
   System.out.println(strArray);
	System.out.println("Duplicate Character in above entered string are below "+inputString);
		for (Character c:strArray){
			if (charCountMap.containsKey(c)){
				charCountMap.put(c, charCountMap.get(c)+1);
			} 
			else {
				charCountMap.put(c, 1);
			     }
                                  }		
	Set<Character> charInString=charCountMap.keySet();
	System.out.println(charCountMap.keySet());
for (Character ch:charInString)
{
	if(charCountMap.get(ch)>1){
		System.out.println(ch+":"+charCountMap.get(ch));
	}
}
			}
	public static void main(String[] args) {

		DuplicateCharacterInstring dcs = new DuplicateCharacterInstring();
	        dcs.duplicateCharCounting("vinnitinni");

	}

}
