//string a="aabcadbbbca";

import java.util.HashMap;
import java.util.Map;

class CountOccurencesOfWord {
    public static void main(String ar[]) {
        String a = "aabcadbbbca";
        int count = 0;

		/*for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			// counting done
			//-----------------------------
			for(int j=0;j<a.length();j++)
			{
				if(c==a.charAt(j))
				{
					count++;
				}
			}
			// counting print but unique
			
		
				System.out.println(c+" total : "+count);
				count=0;
			
		}*/

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char c[] = a.toCharArray();
        for (char c1 : c) {
            if (hm.containsKey(c1)) {
                hm.put(c1, hm.get(c1) + 1);
            } else {
                hm.put(c1, 1);
            }
        }
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
/*
output :
a-4
b-4
c-2
d-1
*/