class Array {
    public static void main(String[] args){
        int[] results = new int[3];
        results[0] = 78;
        results[1] = 89;
        results[2] = 90;

        int length = results.length; //自身の長さ（最大値）
        for(int i = 0;i < length;i++){
            System.out.println(results[i]);
        }
    }
}