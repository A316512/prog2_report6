package jp.ac.uryukyu.ie.e215613;

public class Model {
    private int num1;
    private int num2;
    private String operation;
    private String[] operationArray;
    private boolean errFlag;
    private int result;
    
    
    Model(){
        this.num1 = 0;
        this.num2 = 0;
        this.operationArray = new String[]{"tasu", "hiku", "kake", "waru"};
        this.errFlag = false;
    }

    public int getNum1(){
        return this.num1;
    }

    public int getNum2(){
        return this.num2;
    }

    public String getOperation(){
        return this.operation;
    }

    public String[] getOperationArray(){
        return this.operationArray;
    }

    public boolean getErrFlag(){
        return this.errFlag;
    }

    public int getResult(){
        return this.result;
    }

    public void setNum1(int value){
        this.num1 = value;
    }

    public void setNum2(int value){
        this.num2 = value;
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setErrFlag(boolean flag){
        this.errFlag = flag;
    }

    public void setResult(int value){
        this.result = value;
    }

}
