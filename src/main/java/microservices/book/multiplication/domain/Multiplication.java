package microservices.book.multiplication.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Objects;

/**
 * This class represents a Multiplication of application
 */

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {
    //both factors
    private final int factorA;
    private final int factorB;

    Multiplication() {
        this(0,0);
    }

    //the result of operation A*B
    //private int result;

    /*public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        //this.result = factorA * factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    //public int getResult() {
    //    return result;
    //}

    @Override
    public String toString() {
        return "Multiplication{" +
                "factorA=" + factorA +
                ", factorB=" + factorB + +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multiplication that = (Multiplication) o;
        return factorA == that.factorA &&
                factorB == that.factorB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factorA, factorB);
    }*/
}
