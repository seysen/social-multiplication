package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

/**
 * Creates a Multiplication object with two randomly-generated
 factors
 * between 11 and 99.
 *
 * @return a Multiplication object with random factors
 */
public interface MultiplicationService {
    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
