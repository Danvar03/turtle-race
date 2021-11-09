package co.com.sofka.horserace.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class StateGame implements ValueObject<Boolean> {

    private final Boolean value;

    public StateGame(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return value;
    }
}
