public class MethodDeclaration {

    public static void main(String[] args) {
        MethodDeclaration md = new MethodDeclaration();

        double randomOutput = md.random(50);

        System.out.printf("%.1f", randomOutput);
    }

    public double random(int x) {
        double randomValue = Math.random() * x;
        return randomValue;
    }
}
