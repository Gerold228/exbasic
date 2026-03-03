public class Archer extends Character{
    public Archer(String cname) {
        super(cname, 3, 10, 5);
    }
    @Override
    public void attack(Character opponent){
        setHealth_point(opponent, getAgility());
    }
}
