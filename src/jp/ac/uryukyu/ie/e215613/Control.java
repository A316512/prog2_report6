package jp.ac.uryukyu.ie.e215613;

import java.util.Scanner;

public class Control {
    private Model model;
    private View view;
    private Scanner scanner;

    Control(Model model){
        this.model = model;
        this.view = new View(model);
        this.scanner = new Scanner(System.in);
    }

    public void inputArgs(){
        System.out.print("式を入力 > ");
    
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
    
        if (input1 == "" || input2 == "" || input3 == ""){
            view.dispInputArgsErrorMessage();
        }else{
            this.inputNum(Integer.parseInt(input1),Integer.parseInt(input3));
            this.inputOperation(input2);
        }
    }

    public void calc(){
        int result = 0;

        switch (model.getOperation()){
            case "tasu":
                result = model.getNum1() + model.getNum2();
                break;
            case "hiku":
                result = model.getNum1() - model.getNum2();
                break;
            case "kake":
                result = model.getNum1() * model.getNum2();
                break;    
            case "waru":
                if (model.getNum2() == 0){
                    view.dispNumZeroErrorMessage();
                }
                result = model.getNum1() / model.getNum2();
                break;
            default:
                view.dispCalcErrorMessage();
                break;
        }

        model.setResult(result);
        view.dispResult();
    }

    public void exit(){
        scanner.close();
    }

    private void inputNum(int num1, int num2){
        try{
            model.setNum1(num1);
            model.setNum2(num2);
        } catch (NumberFormatException e){
            view.dispInputNumErrorMessage();
        }
    }

    private void inputOperation(String operation){
        String opeStr[] = model.getOperationArray();

        for (int i = 0; i < 4; i++){
            if (operation.equals(opeStr[i])){
                model.setOperation(operation);
            }
        }
        
        if (model.getOperation() == null){
            view.dispInputOperationErrorMessage();
        }
        
    }
}
