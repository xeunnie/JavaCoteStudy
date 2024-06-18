function isValidBracketString(s) {
    const stack = [];
    const matchingBrackets = {
        ')': '(',
        ']': '[',
        '}': '{'
    };
    
    for (let char of s) {
        if (char === '(' || char === '[' || char === '{') {
            stack.push(char);
        } else {
            if (stack.length === 0 || stack[stack.length - 1] !== matchingBrackets[char]) {
                return false;
            }
            stack.pop();
        }
    }
    return stack.length === 0;
}

function solution(s) {
    let count = 0;
    const n = s.length;
    
    for (let i = 0; i < n; i++) {
        if (isValidBracketString(s)) {
            count++;
        }
        s = s.slice(1) + s[0];  // Rotate string by moving first character to the end
    }
    
    return count;
}