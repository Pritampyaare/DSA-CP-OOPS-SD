class RandomizedSet {
    private HashMap<Integer, Integer> valToIdxMap;
    private ArrayList<Integer> valueList;
    private Random rand;
    public RandomizedSet() {
        valToIdxMap = new HashMap<>();
        valueList = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(valToIdxMap.containsKey(val)) return false;
        valToIdxMap.put(val, valueList.size());
        valueList.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!valToIdxMap.containsKey(val)) return false;
        int idx = valToIdxMap.get(val);
        int lastElement = valueList.get(valueList.size()-1);
        valueList.set(idx, lastElement);
        valToIdxMap.put(lastElement, idx);
        valueList.remove(valueList.size()-1);
        valToIdxMap.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(valueList.size());
        return valueList.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */