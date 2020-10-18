package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class MultiplicationResultAttempt {
    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;

    /*public MultiplicationResultAttempt(User user, Multiplication multiplication, int resultAttempt) {
        this.user = user;
        this.multiplication = multiplication;
        this.resultAttempt = resultAttempt;
    }*/

    public MultiplicationResultAttempt() {
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }

    /*public User getUser() {
        return user;
    }

    public Multiplication getMultiplication() {
        return multiplication;
    }

    public int getResultAttempt() {
        return resultAttempt;
    }

    @Override
    public String toString() {
        return "MultiplicationResultAttempt{" +
                "user=" + user +
                ", multiplication=" + multiplication +
                ", resultAttempt=" + resultAttempt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationResultAttempt attempt = (MultiplicationResultAttempt) o;
        return resultAttempt == attempt.resultAttempt &&
                Objects.equals(user, attempt.user) &&
                Objects.equals(multiplication, attempt.multiplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, multiplication, resultAttempt);
    }*/
}
