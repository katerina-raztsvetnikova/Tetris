package figures;
import manager.GameBoard;

public abstract class Figure implements Figures {
    public TypeFigure type;
    public GameBoard board;
    public Coordinates[] coordinates;
    public FigureRotation rotation;
    public static final int COORDINATES_NUMBER = 4;

    public Figure(TypeFigure type, GameBoard board) {
        this.type = type;
        this.board = board;
        this.coordinates = new Coordinates[COORDINATES_NUMBER];
        this.rotation = FigureRotation.ANGLE_0;
    }

    @Override
    public void display() {
        for (int i = 0; i < coordinates.length; i++) {
            this.board.setFigure(coordinates[i].rowCoordinate, coordinates[i].colCoordinate);
        }
    }

    public abstract void rotation(Coordinates[] coordinates);

}
