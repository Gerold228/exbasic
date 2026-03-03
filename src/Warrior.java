public class Warrior extends Character{
    public Warrior(String cname) {
        super(cname, 10, 5, 3);
    }
    @Override
    public void attack(Character opponent){
        setHealth_point(opponent, getPower());
    }
}
