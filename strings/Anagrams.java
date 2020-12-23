package strings;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "aab";
		String b= "aba";
		int al[]= new int [256];
		//int bl[]= new int [256];
		boolean isAnagram=true;

		
		//		boolean visited[]=new boolean[b.length()];
//		if (a.length()==b.length()) {
//			for(int i=0; i<a.length(); i++) {
//				isAnagram= false;
//				char x= a.charAt(i);
//				for (int j=0 ; j<b.length();j++) {
//					if(x==b.charAt(j) && !visited[j]) {
//						visited[j]=true;
//						isAnagram=true;
//						break;
//					}
//				}
//				if (!isAnagram) {
//					break;
//				}
//			}
//		}
		
		for(char c: a.toCharArray()) {
			int index= (int)c;
			al[index]++;
		}
//		for(char c: b.toCharArray()) {
//			int index= (int)c;
//			bl[index]++;
//		}
//		for (int i=0; i<256 ; i++) {
//			if(al[i]!=bl[i]) {
//				isAnagram=false;
//				break;
//			}
//		}
//		
		for(char c: b.toCharArray()) {
			int index= (int)c;
			al[index]--;
		}
		for (int i=0; i<256 ; i++) {
			if(al[i]!=0) {
				isAnagram=false;
				
				break;
			}
		}
		
		if (isAnagram) {
			System.out.println("isAnagram");
			
		}else {
			System.out.println("Not Anagram");
		}

	}

}
