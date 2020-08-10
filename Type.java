public enum Type {
    TrabzonBread, Multigrain_Bread, Rye_Bread,Corn_Bread,
    Wholemeal_Bread,Buckwheat_Bread;
    public String toString() {
        switch(this) {
            case TrabzonBread: return "TrabzonBread";
            case Multigrain_Bread: return "Multigrain_Bread";
            case Rye_Bread: return "Rye Bread";
            case Corn_Bread: return "CornBread";
            case Wholemeal_Bread: return "Wholemeal Bread";
            case Buckwheat_Bread: return "Buckwheat Bread";
            default: return "unspecified";
        }
    }
}