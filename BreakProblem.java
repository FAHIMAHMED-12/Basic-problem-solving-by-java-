public class BreakProblem {
    public static void main(String[] args) {
        for (int i=1; i<=3;i++){
            for (int y=1;y<=3;y++){
                System.out.println(i+"-"+y);
                if (i==y){
                    break;
                }
    

            }
        }
    }
}