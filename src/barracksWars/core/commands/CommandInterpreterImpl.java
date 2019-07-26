package barracksWars.core.commands;

import barracksWars.interfaces.CommandInterpreter;
import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter {
    private static final String COMMANDS_PACKAGE_PATH = "barracksWars.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        Executable executable = null;

        commandName = Character.toUpperCase(commandName.charAt(0)) +
                commandName.substring(1);

        try {
            Class<? extends Executable> clazz = (Class<? extends Executable>)
                    Class.forName(COMMANDS_PACKAGE_PATH + commandName);

            Constructor<? extends Executable> constructor =
                    clazz.getDeclaredConstructor(
                            String[].class, Repository.class, UnitFactory.class);

            constructor.setAccessible(true);

            executable = constructor.newInstance
                    (data, this.repository, this.unitFactory);

        } catch (ClassNotFoundException
                | NoSuchMethodException
                | InstantiationException
                | IllegalAccessException
                | InvocationTargetException e) {

            e.printStackTrace();
        }

        return executable;
    }
}
