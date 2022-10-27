package by.epam.jonline.javaclass.associationclass.Task_3_State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateDataBase {
    public static List<Region> regions = Arrays.asList(
            new Region("Gomelskaya", 40400, Arrays.asList(

                    new District("Retchitskiy", Arrays.asList(
                            new City("Retcitsa", false,false),
                            new City("Zaspa", false, false))),

                    new District("Mozirskiy", Arrays.asList(
                            new City("Mozir", false,false),
                            new City("Sloboda", false,false))),

                    new District("Gomelskiy", Arrays.asList(
                            new City("Gomel", true, false),
                            new City("Kostukovka", false, false)))
                    )
            )
    );

}
