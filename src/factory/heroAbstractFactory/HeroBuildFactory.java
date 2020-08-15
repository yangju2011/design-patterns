package factory.heroAbstractFactory;

import java.util.ArrayList;

public interface HeroBuildFactory {
    Position createPosition();
    ArrayList<Item> createStartItems();
    Boots createBoosts();
    Weapon createWeapon();
}
