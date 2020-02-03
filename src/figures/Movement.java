package figures;
public enum Movement {
    LEFT, RIGHT;
    public static Movement getType(int i) {
        return values()[i];
    }
}
