class Palindrome-Check{
  public static boolean isPalindrome(String str) {
    // Write your code here.
		if (str.length() == 1){
			return true;
		}
		int start   = 0;
		int ends = str.length() - 1;
		while (start < ends){
			if (str.charAt(start) != str.charAt(ends)){
				return false;
			}
			start++;
			ends--;
		}
    return true;
  }
}
