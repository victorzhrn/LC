
public class solution {
	public static String licenseKeyFormatting(String S, int K) {
		S = S.replace("-", "");
		
		int l = S.length();
		if (l==0) return "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<l; i++){
			sb.insert(0, Character.toUpperCase(S.charAt(l-i-1)));
			if((i+1)%(K)==0 && i+1 != l){
				System.out.println(i);
				sb.insert(0, '-');
			}
			
		}
        return sb.toString();
        
        
    }
}
