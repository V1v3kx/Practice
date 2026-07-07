<<<<<<< HEAD
package dailyPractice;

public class WeightedWordMapping {
	public static void main(String[] args) {
		String[] words= {"abcd","def","xyz"};
		int[] weights= {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
		System.out.println(mapWordWeights(words,weights));
	}
	
	public static String mapWordWeights(String[] words, int[] weights) {
		StringBuilder s=new StringBuilder();
		for(String word:words) {
			int totalweights=0;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				int index=ch-'a';
				totalweights=totalweights+weights[index];
			}
			int mod=totalweights%26;
			char mappedchar=(char)('z'-mod);
			s.append(mappedchar);
		}
		return s.toString();
    }
}
=======
package dailyPractice;

public class WeightedWordMapping {
	public static void main(String[] args) {
		String[] words= {"abcd","def","xyz"};
		int[] weights= {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
		System.out.println(mapWordWeights(words,weights));
	}
	
	public static String mapWordWeights(String[] words, int[] weights) {
		StringBuilder s=new StringBuilder();
		for(String word:words) {
			int totalweights=0;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				int index=ch-'a';
				totalweights=totalweights+weights[index];
			}
			int mod=totalweights%26;
			char mappedchar=(char)('z'-mod);
			s.append(mappedchar);
		}
		return s.toString();
    }
}
>>>>>>> 26803db (Movezeroes)
