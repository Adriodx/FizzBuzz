public class FizzBuzz {

    private void runFizzBuzz() {
        for (int i = 1; i < 101; i++) {
            var p3 = i % 3 == 0;
            var p5 = i % 5 == 0;

            System.out.println(p3 && p5 ? "FizzBuzz" : p3 ? "Fizz" : p5 ? "Buzz" : i);
        }
    }

    public void run() {
        runFizzBuzz();
    }
}