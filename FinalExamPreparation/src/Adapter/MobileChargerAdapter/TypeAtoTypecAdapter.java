package Adapter.MobileChargerAdapter;

public class TypeAtoTypecAdapter implements TypeACharger{
    protected TypeCCharger charger;

    public TypeAtoTypecAdapter(TypeCCharger charger){
        this.charger =  charger;
    }
    @Override
    public void charge() {
        charger.chargeWithTypeC();
    }
}
