package JavaCore.Sixth.Train;

public interface Named {
    default String getName() { return getClass().getName() + " " + hashCode();}
}
