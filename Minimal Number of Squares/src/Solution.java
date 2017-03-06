
public class Solution {
	
	public static int cutHelper(int width, int length){
		if (width==0 || length==0){
			return 0;
		}else{
			if (width>=length){
				return 1+cutHelper(width-length,length);
			}else{
				return 1+ cutHelper(width,length-width);
			}
		}
	}

}
