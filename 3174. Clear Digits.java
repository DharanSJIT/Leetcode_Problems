class Solution {
    public String clearDigits(String s) {
         Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                while (!stack.isEmpty() && Character.isLetter(stack.peek())) {
                    stack.pop();
                    break;  
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}