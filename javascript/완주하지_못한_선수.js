function solution(participant, completion) {
  const part = new Map(); // 배열을 map을 바꿔서 사람의 횟수를 체크해줌줌

  for (let p of participant) {
    // participant의 값을 map으로 저장
    if (part.has(p)) {
      // ex [leo, leo, sook, jay] 의 경우 leo : 2, sook : 1, jay :1 형식으로 저장(동명이인이 있을 수 있으므로로)
      part.set(p, part.get(p) + 1);
    } else {
      part.set(p, 1);
    }
  }

  for (let c of completion) {
    // completion의 값과 비교하여 값이 있으면 1씩 빼줌
    if (part.get(c) === 1) {
      // 만약 원래 part의 값이 1이라면 모두 완주했으므로 0
      part.delete(c);
    } else {
      part.set(c, part.get(c) - 1);
    }
  }

  return [...part.keys()][0]; // 첫 번째 키를 반환 (완주하지 못한 선수)
}

// 테스트
console.log(solution(["leo", "kiki", "eden"], ["eden", "kiki"])); // "leo"
console.log(solution(["mike", "mike", "john"], ["mike", "john"])); // "mike"
