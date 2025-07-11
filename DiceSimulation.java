public class DiceSimulation extends Thread {
    static int b = 0, i = 0;

    @Override
    public void run() {
        int x = (int) (Math.random() * (6 - 1 + 1) + 1);
        b = b + x;
        System.out.println("Rolls Result of " + (i + 1) + " Dice : " + x);
        i++;
    }

    static void print() {
        System.out.println("Sum Total of the Rolls Result :" + b);
    }

    @SuppressWarnings("CallToThreadRun")
    public static void main(String A[]) {
        DiceSimulation d1 = new DiceSimulation();
        DiceSimulation d2 = new DiceSimulation();
        DiceSimulation d3 = new DiceSimulation();
        DiceSimulation d4 = new DiceSimulation();
        DiceSimulation d5 = new DiceSimulation();
        DiceSimulation d = new DiceSimulation();
        d1.run();
        d2.run();
        d3.run();
        d4.run();
        d5.run();
        DiceSimulation.print();
    }
}
/*
output:
Rolls Result of 1 Dice : 1
Rolls Result of 2 Dice : 6
Rolls Result of 3 Dice : 1
Rolls Result of 4 Dice : 1
Rolls Result of 5 Dice : 5
Sum Total of the Rolls Result :14
 */