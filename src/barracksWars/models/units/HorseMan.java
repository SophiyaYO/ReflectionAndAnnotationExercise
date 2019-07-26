package barracksWars.models.units;

public class HorseMan extends AbstractUnit {

    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public HorseMan() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
