package barracksWars.core.commands;

import barracksWars.interfaces.Executable;

public abstract class Command implements Executable {
   private String[] data;
//   private Repository repository;
//   private UnitFactory unitFactory;

//    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
//        this.data = data;
//        this.repository = repository;
//        this.unitFactory = unitFactory;
//    }

    public Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return this.data;
    }

//    protected Repository getRepository() {
//        return this.repository;
//    }

//    protected UnitFactory getUnitFactory() {
//        return this.unitFactory;
//    }
}
