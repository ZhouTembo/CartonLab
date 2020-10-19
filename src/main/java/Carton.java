public class Carton {
    public int packageN (int candybars){
        int cartons=24;
        if(candybars%cartons!=0){

            System.out.println(candybars/cartons+1+" cartons needed for "+candybars+" candy bars");
            return candybars/cartons+1;
        }
        System.out.println(candybars/cartons+" cartons needed for " + candybars + " candy bars");
        return candybars/cartons ;

    }
}
