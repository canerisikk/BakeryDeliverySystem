public class Breadx {
    private Type type;
    private Yeast yeast;
    private Sliced sliced;

    public Breadx( Type type,Yeast yeast,Sliced sliced) {

        this.type = type;
        this.yeast = yeast;
        this.sliced = sliced;
    }

    public Yeast getYeast() {
        return yeast;
    }

    public Sliced getSliced() {
        return sliced;
    }

    public Type getType() {
        return type;
    }
}
