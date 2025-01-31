function solution(record) {
  const mem = new Map();
  let message = [];

  for (let r of record) {
    const part = r.split(" ");

    if (part[0] === "Enter") {
      mem.set(part[1], part[2]);
    } else if (part[0] === "Change") {
      mem.set(part[1], part[2]);
    }
  }

  for (let r of record) {
    const part = r.split(" ");

    if (part[0] === "Enter") {
      message.push(`${mem.get(part[1])}님이 들어왔습니다.`);
    } else if (part[0] === "Leave") {
      message.push(`${mem.get(part[1])}님이 나갔습니다.`);
    }
  }

  return message;
}
