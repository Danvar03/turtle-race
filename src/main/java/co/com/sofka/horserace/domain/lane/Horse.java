package co.com.sofka.horserace.domain.lane;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.horserace.domain.game.values.HorseId;
import co.com.sofka.horserace.domain.game.values.NameHorseRider;
import co.com.sofka.horserace.domain.game.values.TypeHorse;

public class Horse extends Entity<HorseId> {

    private final TypeHorse typeHorse;
    private final NameHorseRider nameHorseRider;

    public Horse(HorseId entityId, TypeHorse typeHorse, NameHorseRider nameHorseRider) {
        super(entityId);
        this.typeHorse = typeHorse;
        this.nameHorseRider = nameHorseRider;
    }

    public TypeHorse getTypeHorse() {
        return typeHorse;
    }

    public NameHorseRider getNameHorseRider() {
        return nameHorseRider;
    }
}
