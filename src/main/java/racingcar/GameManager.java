package racingcar;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

  private List<Car> cars = new ArrayList<Car>();
  private int trialCount;
  private int currentCount;

  public void init() {
    System.out.println("초기화");
    View.printGameStart();
    List<String> inputedCars = View.inputCars();
    inputedCars.forEach(car -> cars.add(new Car(car)));

    View.printGameTrialCount();
    trialCount = View.inputGameTrialCount();
    currentCount = 0;
  }

  public void start() {
    System.out.println("시작");


  }

  public boolean isGameEnd() {
    return currentCount >= trialCount;
  }
}
