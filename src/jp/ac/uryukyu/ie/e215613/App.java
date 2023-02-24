package jp.ac.uryukyu.ie.e215613;

public class App {
    public static void main(String[] args) throws Exception {
        Model model = new Model();
        Control control = new Control(model);

        control.inputArgs();
        control.calc();
        control.exit();
    }
}
