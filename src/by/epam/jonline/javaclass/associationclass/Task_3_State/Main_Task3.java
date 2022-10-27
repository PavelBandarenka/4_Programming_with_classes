package by.epam.jonline.javaclass.associationclass.Task_3_State;

import java.util.List;
import java.util.Map;

public class Main_Task3 {

    /*
     *  Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
     *  столицу, количество областей, площадь, областные центры.
     */

    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();
        State state = new State("Belarus");

        state.getRegionList().add(StateDataBase.regions.get(0));

        Region Minskaya = new Region("Minskaya",39900);
        state.getRegionList().add(Minskaya);
        District Minskiy = new District("Minskiy");
        Minskaya.getDistrictList().add(Minskiy);
        City Minsk = new City("Minsk");
        Minskiy.getCityList().add(Minsk);

        Region Mogilevskaya = new Region("Mogilevskaya", 29100);
        state.getRegionList().add(Mogilevskaya);
        District Mogilevskiy = new District("Mogilevskiy");
        Mogilevskaya.getDistrictList().add(Mogilevskiy);
        City Mogilev = new City("Mogilev");
        Mogilevskiy.getCityList().add(Mogilev);

        Region Grodnenskaya = new Region("Grodnenskaya", 25100);
        state.getRegionList().add(Grodnenskaya);
        District Grodnenskiy = new District("Grodnenskiy");
        Grodnenskaya.getDistrictList().add(Grodnenskiy);
        City Grodno = new City("Grodno");
        Grodnenskiy.getCityList().add(Grodno);

        Region Brestskaya = new Region("Brestskaya", 32800);
        state.getRegionList().add(Brestskaya);
        District Brestskiy = new District("Brestskiy");
        Brestskaya.getDistrictList().add(Brestskiy);
        City Brest = new City("Brest");
        Brestskiy.getCityList().add(Brest);

        Region Vitebskaya = new Region("Vitebskaya", 40000);
        state.getRegionList().add(Vitebskaya);
        District Vitebskiy = new District("Vitebskiy");
        Vitebskaya.getDistrictList().add(Vitebskiy);
        City Vitebsk = new City("Vitebsk");
        Vitebskiy.getCityList().add(Vitebsk);

        stateMachine.countRegions(state);

        stateMachine.printArea(state);

        stateMachine.setRegionalCenter(Vitebsk);
        stateMachine.setRegionalCenter(Mogilev);
        stateMachine.setRegionalCenter(Brest);
        stateMachine.setRegionalCenter(Grodno);

        stateMachine.setCapital(Minsk);

        stateMachine.getCapital(state);

        stateMachine.printRegionalCenter(state);
    }
}
