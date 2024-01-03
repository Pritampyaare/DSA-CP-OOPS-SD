class Solution {
    public int numberOfBeams(String[] bank) {
        int totalBeams=0, prevBeam=0;
        for(int i=0; i<bank.length; i++){
            int curBeam = getNumberofBeamInFloor(bank[i]);
            if(curBeam>0){
                totalBeams += prevBeam*curBeam;
                prevBeam=curBeam;
            }
        }
        return totalBeams;
    }
    public int getNumberofBeamInFloor(String str){
        int count=0;
        for(int i=0; i<str.length(); i++) if(str.charAt(i)=='1') count++;
        return count;
    }
}