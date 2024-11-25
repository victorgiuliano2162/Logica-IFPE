package cartaxo.ef09.ex04;

public class Triangle extends DimensoesInvalidasException {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    Triangle() {}

    Triangle(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    private void validarLados(double ladoA, double ladoB, double ladoC) throws DimensoesInvalidasException {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0 || ladoA >= ladoB + ladoC ||
                ladoB >= ladoA + ladoC || ladoC >= ladoA + ladoB ||
                ladoA <= Math.abs(ladoB - ladoC) || ladoB <= Math.abs(ladoA - ladoC)
                || ladoC <= Math.abs(ladoA - ladoB)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para um triângulo.");
        }
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }



}
