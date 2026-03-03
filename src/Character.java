public class Character {
    private String name;
    private Integer power;
    private Integer agility;
    private Integer intellect;
    private Integer health_point;
    public Character(String cname){
        this.name = cname;
        this.power = 5;
        this.agility = 5;
        this.intellect = 5;
        this.health_point = 100;
    }
    public Character(String cname, Integer cpower, Integer cagility, Integer cintellect){
        this.name = cname;
        this.power = cpower;
        this.agility = cagility;
        this.intellect = cintellect;
        this.health_point = 100;
    }
    public Integer getAgility(){
        return agility;
    }
    public Integer getPower(){
        return power;
    }
    public void attack(Character opponent){
    }
    public void setHealth_point(Character opponent, Integer damage){
        if (opponent.health_point-damage < 0){
            opponent.health_point = 0;
        } else {
            opponent.health_point -= damage;
        }
    }
}
