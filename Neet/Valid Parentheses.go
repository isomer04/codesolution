func isValid(s string) bool {
    stack := []rune{} // Initialize an empty stack to store opening brackets.

    for _, c := range s {
        if c == '(' || c == '[' || c == '{' {
            stack = append(stack, c) // Push opening brackets onto the stack.
        } else if c == ')' {
            // Check if the stack is empty or if the last element on the stack doesn't match '('.
            if len(stack) == 0 || stack[len(stack)-1] != '(' {
                return false // Invalid expression, return false.
            }
            stack = stack[:len(stack)-1] // Pop the matching opening bracket from the stack.
        } else if c == ']' {
            if len(stack) == 0 || stack[len(stack)-1] != '[' {
                return false
            }
            stack = stack[:len(stack)-1]
        } else if c == '}' {
            if len(stack) == 0 || stack[len(stack)-1] != '{' {
                return false
            }
            stack = stack[:len(stack)-1]
        }
    }

    return len(stack) == 0 // If the stack is empty after processing, it's valid.
}

/*
Explanation:

We initialize an empty stack to keep track of opening brackets (parentheses, square brackets, curly braces).

We loop through each character c in the input string s.

If c is an opening bracket ('(', '[', or '{'), we push it onto the stack using append.

If c is a closing bracket (')', ']', or '}'), we check if the stack is empty or if the last element on the stack matches the corresponding opening bracket. If not, we return false, indicating an invalid expression. Otherwise, we pop the matching opening bracket from the stack.

After processing all characters in the input string, we check if the stack is empty. If it is, the expression is valid because all opening brackets have matching closing brackets. If the stack is not empty, some brackets are unmatched, so we return false.


*/ 