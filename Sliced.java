public enum Sliced {
    Sliced, notSliced;
    public String toString() {
        switch(this) {
            case Sliced:return "sliced";
            case notSliced:return "not sliced";
            default: return "unspecified";
        }
    }
}