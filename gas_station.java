public class gas_station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length <=1){
           return ((gas[0] - cost[0]) >= 0 ) ? 0: -1;
        }
        int initial = 0;
        int check = 0;
        for(int i = 0; i < gas.length; i++){
            if((gas[i] > cost[i])){
                int new_check = gas[i] - cost[i];
                int j = 0;
                for(j = i + 1; j < gas.length; j++){
                    new_check += gas[j] - cost[j];
                    if(new_check < 0){
                        break;
                    }
                }
                if(j >= gas.length - 1){
                    return ((check + new_check) >= 0) ? i : -1;
                }
            }
            check += gas[i] - cost[i];
        }
       
        return -1;
        
    }
}
