package co.com.sofka.horserace.domain.lane;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.horserace.domain.game.values.GameId;
import co.com.sofka.horserace.domain.game.values.LaneId;
import co.com.sofka.horserace.domain.game.values.Position;
import co.com.sofka.horserace.domain.game.values.StateLane;

public class Lane extends AggregateEvent<LaneId> { // Carril.

    protected Horse horse;
    protected GameId gameId;
    protected Position position;
    protected StateLane stateLane;

    public Lane(LaneId entityId) {
        super(entityId);
    }



}
