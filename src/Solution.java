
public class Solution {
	public int singleNumber(int[] nums){
		int result = 0;
		int l = nums.length;
		
		for(int i = 0; i < l; i++ ){
			result = result ^ nums[i];
		}
		
		return result;
	}

}
