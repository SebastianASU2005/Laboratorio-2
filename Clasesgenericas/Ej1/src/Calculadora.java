public class Calculadora implements Operable<Integer>{
    @Override
    public Integer suma(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer resta(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer producto(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer division(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
}
