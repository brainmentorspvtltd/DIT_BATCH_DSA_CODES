public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<Pair<Integer, Integer>>> map = new TreeMap<>();
        List<List<Integer>> li = new ArrayList<>();
        verticalOrder(map, root, 0, 0);
             for(int key : map.keySet()){
            List<Pair<Integer, Integer>> temp = map.get(key);
            temp.sort((a,b) -> a.getKey().compareTo(b.getKey())== 0? a. getValue().compareTo(b.getValue()) : a.getKey().compareTo(b.getKey()));
            List<Integer> list = new ArrayList<>();
            for(Pair<Integer, Integer> pair : temp){
                list.add(pair.getValue());
            }
            li.add(list);
        }
        
        return li;
    }
    private void verticalOrder(TreeMap<Integer, List<Pair<Integer, Integer>>> map,
        TreeNode root, int level, int distance){
        if(root == null) return;
        if(map.get(distance)==null){
            map.put(distance, new ArrayList<>());
        }
        map.get(distance).add(new Pair(level, root.val));
        verticalOrder(map, root.left, level + 1, distance - 1);
        verticalOrder(map, root.right, level + 1, distance + 1);
    }
