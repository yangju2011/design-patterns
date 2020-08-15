package factory.heroAbstractFactory;

import java.util.ArrayList;

public class SupportHeroBuildFactory implements HeroBuildFactory {
    @Override
    public Position createPosition() {
        return new HardSupportPosition();
    }

    @Override
    public Boots createBoosts() {
        return new TranquilBoots();
    }

    @Override
    public Weapon createWeapon() {
        return new ForceStaffWeapon();
    }

    @Override
    public ArrayList<Item> createStartItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new TangoItem());
        items.add(new ObserverWardItem());
        items.add(new ClarityItem());
        return items;
    }

}
