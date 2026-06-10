package Adapter.MobileChargerAdapter;

public class ChargerDemo {
    public static void main(String[] args) {
        TypeCCharger charger = new TypeCCharger();
        TypeAtoTypecAdapter adapter = new TypeAtoTypecAdapter(charger);

        adapter.charge();
    }
}
