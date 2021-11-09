package co.com.sofka.horserace.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {
    private final String  value;

    public Name(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }


    @Override
    public String value() {
        return null;
    }
}
