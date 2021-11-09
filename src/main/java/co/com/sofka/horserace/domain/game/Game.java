package co.com.sofka.horserace.domain.game;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.horserace.domain.game.values.GameId;
import co.com.sofka.horserace.domain.game.values.Podium;
import co.com.sofka.horserace.domain.game.values.StateGame;

import java.util.Set;

public class Game extends AggregateEvent<GameId> {

    protected Track track;
    protected Set<Player> players;
    protected Podium podium;
    protected StateGame stateGame;


    public Game(GameId entityId) {
        super(entityId);
    }
}
