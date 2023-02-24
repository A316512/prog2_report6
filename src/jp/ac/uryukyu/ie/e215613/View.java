package jp.ac.uryukyu.ie.e215613;

public class View {
    private Model model;

    View(Model model){
        this.model = model;
    }

    public void dispResult(){
        int num1 = model.getNum1();
        int num2 = model.getNum2();
        String ope = model.getOperation();
        int result = model.getResult();

        System.out.println("入力された式は " + num1 + " " + ope + " " + num2 + " です");
        System.out.println("計算結果は " + result + " です");
    }

    public void dispInputArgsErrorMessage(){
        errDisp("引数は3つ入力してください");
    }

    public void dispInputNumErrorMessage(){
        errDisp("数値を入力してください");
    }

    public void dispInputOperationErrorMessage(){
        errDisp("演算子は tasu hiku kake waru の4つです");
    }

    public void dispNumZeroErrorMessage(){
        errDisp("0では割れません");
    }

    public void dispCalcErrorMessage(){
        errDisp("計算エラーです");
    }
    
    private static void errDisp(String errStr){
        System.out.println("入力内容 : java Main.java 数値 演算子 数値");
        System.out.println(errStr);
        System.exit(0);  /* プログラムを終了する */
    }
}