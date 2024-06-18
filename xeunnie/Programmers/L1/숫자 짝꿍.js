function solution(X, Y) {

    const countX = {};
    const countY = {};

    for (let char of X) {
        countX[char] = (countX[char] || 0) + 1;
    }

    for (let char of Y) {
        countY[char] = (countY[char] || 0) + 1;
    }

    const commonDigits = [];
    for (let digit in countX) {
        if (countY[digit]) {
            const minCount = Math.min(countX[digit], countY[digit]);
            for (let i = 0; i < minCount; i++) {
                commonDigits.push(digit);
            }
        }
    }

    if (commonDigits.length === 0) {
        return "-1";
    }

    commonDigits.sort((a, b) => b - a);
    const result = commonDigits.join('');

    if (result[0] === '0') {
        return "0";
    }

    return result;
}