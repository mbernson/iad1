package iiad.les2.Polymorfisme_Dynamic_Binding;

public abstract class PersoonImpl implements Persoon {
    public String getRol() {
        return getClass().getSimpleName().toLowerCase();
    }
}
