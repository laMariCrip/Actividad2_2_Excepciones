public class Dividir {
    public int dividir(int a, int b) throws NumeroNegativoException {
        if (b < 0) {
            throw new NumeroNegativoException("División por negativo");
        }
        return a/b;
    }
}
