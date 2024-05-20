package T10_JavaExceptions;

public class t10_04 {

    private int op1;
    private int op2;

    public t10_04(int op1) {
        this.op1 = op1;
    }

    public t10_04(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public int sumar() {
        return op1 + op2;
    }

    public int restar() {
        return op1 - op2;
    }

    public int multiplicar() {
        return op1 * op2;
    }

    public int dividir() {
        if (op2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return op1 / op2;
    }

    public int potencia() {
        return (int) Math.pow(op1, op2);
    }

    public double raizCuadrada() {
        return Math.sqrt(op1);
    }

    public double raizCubica() {
        return Math.cbrt(op1);
    }
}

