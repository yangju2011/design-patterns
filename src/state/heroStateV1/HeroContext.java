package state.heroStateV1;

public class HeroContext {
    final static int ALIVE = 0;
    final static int DEAD = 1;
    final static int SILENCED = 2;

    int state = ALIVE;
    int hp = 0;

    public HeroContext(int hp) {
        this.hp = hp;
        if (hp == 0) {
            state = DEAD;
        }
    }

    public void attack() {
        if (state == ALIVE) {
            System.out.println("\n...Hero is attacking others.");
        } else if (state == SILENCED) {
            System.out.println("\n...Hero is silenced and cannot attack others.");
        } else {
            System.out.println("\n...Hero is dead, and cannot attack others.");
        }
    }

    public void attacked(int damage) {
        if ((state == ALIVE) || (state == SILENCED)) {
            System.out.println("\n...Hero is being attacked with damage: " + damage);
            hp -= damage;
            if (hp <= 0) {
                hp = 0;
                state = DEAD;
            }
        } else {
            System.out.println("\n...Hero is dead, and cannot be attacked.");
        }
    }

    public void silenced() {
        if (state == ALIVE) {
            System.out.println("\n...Hero is being silenced.");
            state = SILENCED;
        } else if (state == SILENCED) {
            System.out.println("\n...Hero is already silenced and cannot be silenced again.");
        } else {
            System.out.println("\n...Hero is dead, and cannot be silenced.");
        }
    }

    public void recovered() {
        if (state == SILENCED) {
            System.out.println("\n...Hero is being recovered.");
            state = ALIVE;
        } else if (state == ALIVE) {
            System.out.println("\n...Hero is already recovered, and cannot be recovered.");
        } else {
            System.out.println("\n...Hero is dead, and cannot be recovered.");
        }
    }

    public void revived(int hp) {
        if (state == DEAD) {
            System.out.println("\n...Hero is being revived.");
            this.hp = hp;
            state = ALIVE;
        } else if (state == ALIVE) {
            System.out.println("\n...Hero is already alive, and cannot be revived.");
        } else {
            System.out.println("\n...Hero is already alive but silenced, and cannot be revived.");
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nHero Context\n================");
        result.append("\nHero HP " + hp);
        result.append("\nHero is ");
        if (state == ALIVE) {
            result.append("alive");
        } else if (state == SILENCED) {
            result.append("silenced");
        } else if (state == DEAD) {
            result.append("DEAD");
        }
        return result.toString();
    }
}
