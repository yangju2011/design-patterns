package factory.heroAbstractFactoryV2;

import factory.heroAbstractFactory.Boots;
import factory.heroAbstractFactory.HeroBuildFactory;
import factory.heroAbstractFactory.Item;
import factory.heroAbstractFactory.Position;
import factory.heroAbstractFactory.PowerTreads;
import factory.heroAbstractFactory.SafeLanePosition;
import factory.heroAbstractFactory.ShadowBladeWeapon;
import factory.heroAbstractFactory.TangoItem;
import factory.heroAbstractFactory.Weapon;
import factory.heroAbstractFactory.WraithBandItem;

import java.util.ArrayList;

public class OffLaneHeroBuildFactory implements HeroBuildFactory {
    @Override
    public Position createPosition() {
        return new OffLanePosition();
    }

    @Override
    public Boots createBoosts() {
        return new PhaseBoots();
    }

    @Override
    public Weapon createWeapon() {
        return new RadianceWeapon();
    }

    @Override
    public ArrayList<Item> createStartItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new TangoItem());
        items.add(new IronBranchItem());
        items.add(new EnchantedMangoItem());
        return items;
    }

}
