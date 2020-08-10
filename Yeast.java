public enum Yeast {
    IncludingYeast, notIncludingYeast;
    public String toString() {
        switch(this) {
            case IncludingYeast: return "Your Bread Including Yeast";
            case notIncludingYeast: return "Your Bread notIncluding Yeast";
            default: return "unspecified";
        }
    }
}
