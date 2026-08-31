class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
         HashMap<Integer, Integer> losses = new HashMap<>();

        HashSet<Integer> players = new HashSet<>();

        for (int[] match : matches) {

            int winner = match[0];

            int loser = match[1];

            players.add(winner);

            players.add(loser);

            losses.put(loser, losses.getOrDefault(loser, 0) + 1);

        }

        List<Integer> l1 = new ArrayList<>();

        List<Integer> l2 = new ArrayList<>();

        for (int player : players) {

            if (!losses.containsKey(player)) {

                l1.add(player);

            } else if (losses.get(player) == 1) {

                l2.add(player);

            }

        }

        Collections.sort(l1);

        Collections.sort(l2);

        List<List<Integer>> res = new ArrayList<>();

        res.add(l1);

        res.add(l2);
        return res;

    }
}