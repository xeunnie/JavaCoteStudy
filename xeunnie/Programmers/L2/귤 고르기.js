function solution(k, tangerine) {
    const countMap = new Map();

    for (let size of tangerine) {
        countMap.has(size) ?
        countMap.set(size, countMap.get(size) + 1):
        countMap.set(size, 1);
    }

    const counts = Array.from(countMap.values());
    
    counts.sort((a, b) => b - a);
    
    let totalKinds = 0;
    let totalTangerines = 0;
    
    for (let count of counts) {
        totalTangerines += count;
        totalKinds++;
        if (totalTangerines >= k) {
            break;
        }
    }
    
    return totalKinds;
}
