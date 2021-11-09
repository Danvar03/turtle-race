package co.com.sofka.horserace.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class LimitDistance implements ValueObject<Integer> {

    private final Integer value;

    public LimitDistance(Integer value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.toString().isBlank()){
            throw new IllegalArgumentException("EL limite de la pista no puede estar vacio");
        }

        if(this.value<0 || this.value>1000){
            throw new IllegalArgumentException("El limite de distancia no puede ser negativo ni mayor a 1000 KM");
        }

    }

    @Override
    public Integer value() {
        return value;
    }
}
