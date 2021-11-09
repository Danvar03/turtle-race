package co.com.sofka.horserace.domain.game;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.horserace.domain.game.values.LaneId;
import co.com.sofka.horserace.domain.game.values.LimitDistance;
import co.com.sofka.horserace.domain.game.values.TrackId;

public class Track extends Entity<TrackId> { //PISTA

    private final LimitDistance limitDistance;
    private final LaneId laneId;

    public Track(TrackId entityId, LimitDistance limitDistance, LaneId laneId) {
        super(entityId);
        this.limitDistance = limitDistance;
        this.laneId = laneId;
    }

    public LimitDistance limitDistance() {
        return limitDistance;
    }

    public LaneId laneId() {
        return laneId;
    }
}
