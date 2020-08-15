package factory.heroAbstractFactory;

import java.util.ArrayList;

public class CarryHeroBuildFactory implements HeroBuildFactory {
    @Override
    public Position createPosition() {
        return new SafeLanePosition();
    }

    @Override
    public Boots createBoosts() {
        return new PowerTreads();
    }

    @Override
    public Weapon createWeapon() {
        return new ShadowBladeWeapon();
    }

    @Override
    public ArrayList<Item> createStartItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new TangoItem());
        items.add(new WraithBandItem());
        return items;
    }

}
