package javaocp.Siniflar.Asansor;

public interface Floor {
    Elevator callElevator(Direction direction);
    int getId();
    String getName();
    void move(Floor floor);
}
