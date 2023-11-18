package ch09;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer computer1 = new Computer();
        Computer computer= new Desktop();
        computer.display();
        computer.turnOff();

        Notebook notebook = new MyNotebook();
    }
}
