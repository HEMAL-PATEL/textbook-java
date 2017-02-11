class LearnIf {
    public static void main(String[] args){
        
        int aScore = 80;
        int bScore = 40;
        int cScore = 50; 

        int total = aScore + bScore + cScore;

        if (total >= 240){

            if (aScore >= 40 && bScore >= 40 && cScore >= 40){
                //合格
                System.out.println("passed");    
            } else {
                //不合格
            }

        }else{
            //不合格
        }
    }
}