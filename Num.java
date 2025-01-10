class MathHere {
    public final double secret = 2;
}
class ComplexMaths extends MathHere {
    public final double secret = 4;
}
public class Num extends ComplexMaths {
    public final double secret = 8;

    public static void main(String[] numbers) {
        MathHere obj = new Num();
        System.out.print(obj.secret);
    }
}