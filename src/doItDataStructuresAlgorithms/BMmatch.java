package doItDataStructuresAlgorithms;

public class BMmatch {
	
	private static int bmMatch(String txt, String pat) {
		int pt; // text
		int pp; // pattern
		int txtLen = txt.length();
		int patLen = pat.length();
		int[] skip = new int[Character.MAX_VALUE + 1]; // skip table
		
		for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patLen;
		}
		
		for (pt = 0; pt < patLen - 1; pt++) {
			skip[pat.charAt(pt)] = patLen - pt - 1;
		}
		
		while (pt < txtLen) {
			pp = patLen - 1;
			
			while (txt.charAt(pt) == pat.charAt(pp)) {
				if (pp == 0) {
					return pt;
				}
				pp--;
				pt--;
			}
			pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
		}
		return -1;
	}

	public static void main(String[] args) {
		String txt = "ABABCDEFGHA";
		String pattern = "ABC";
		System.out.println(bmMatch(txt, pattern));
	}

}
