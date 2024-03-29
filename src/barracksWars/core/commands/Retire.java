package barracksWars.core.commands;

import barracksWars.annotations.Inject;
import barracksWars.interfaces.Repository;

public class Retire extends Command {
    @Inject
    private Repository repository;

    public Retire(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1] ;
        String result ;

        try {
            this.repository.removeUnit(this.getData()[1]);
            result = unitType + " retired!";
        } catch (IllegalArgumentException exception) {
            result = exception.getMessage();
        }

        return result;
    }
}
