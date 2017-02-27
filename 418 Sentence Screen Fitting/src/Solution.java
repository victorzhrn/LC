import java.util.LinkedList;

public class Solution {
	
	private static int depth = 0; 
	
	public static int wordsTyping(String[] sentence, int rows, int cols) {
		System.out.println(sentence.length);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (String s: sentence) queue.add(s.length());
		try{
			int count = helper(queue,cols,rows,rows,cols);
		}catch (StackOverflowError e) {  
            System.err.println(e);
            System.out.println("StackDepth.main() = " + e.getStackTrace().length);
        } finally {  
            System.out.println("Stack depth: " + depth);  
            
        } 
		int count=0;
		return count/queue.size();
	}
	
	public static int helper(LinkedList<Integer> queue,int currentCol, int currentRow,int rows, int cols){
		depth++;
		int newLength = queue.peek();
		if (currentRow ==0 && currentCol < newLength+1) return 0;
		if (currentCol== newLength){
			queue.remove();
			queue.add(newLength);
			return helper(queue,cols,currentRow-1,rows,cols)+1;
		}
		else if (currentCol < newLength){
			return helper(queue,cols,currentRow-1,rows,cols);
		}
		else {
			queue.remove();
			queue.add(newLength);
			return helper(queue,currentCol-newLength-1, currentRow,rows,cols)+1;
		}
	}


}
