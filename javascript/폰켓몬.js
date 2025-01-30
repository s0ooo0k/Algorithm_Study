function solution(nums) {
  const pokemon = new Set();
  for (let n of nums) {
    pokemon.add(n);
  }
  return Math.min(nums.length / 2, pokemon.size);
}
