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
}
