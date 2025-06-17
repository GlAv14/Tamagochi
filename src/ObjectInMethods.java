public class ObjectInMethods {
    public static void main(String[] args) {
Skeleton skeleton = new Skeleton("Shkilet",7,8);
Zombie zombie = new Zombie("Bob",5,10);
zombie.fight(zombie,skeleton);
skeleton.fight(zombie,skeleton);
    }
}
abstract class Monster {
    String name;
     int hp;
     int force;
    public Monster(String name,int hp, int force){
        this.name=name;
        this.hp = hp;
        this.force=force;
    }
    public abstract void fight(Zombie zombie,Skeleton skeleton);
}

class Zombie extends Monster{
    public Zombie(String name,int hp,int force){
        super(name + " the Zombie", hp, force);
    }

    @Override
    public void fight(Zombie zombie,Skeleton skeleton) {
        System.out.println(zombie.name+" attack, his damage is "+zombie.force);
        skeleton.hp-=zombie.force;
        System.out.println("Skeleton was damaged his hp is "+skeleton.hp);
    }
}

class Skeleton extends Monster{
    public Skeleton(String name,int hp,int force){
        super(name, hp, force);
    }

    @Override
    public void fight(Zombie zombie,Skeleton skeleton) {
        System.out.println(skeleton.name+" the skeleton attack, his damage is "+skeleton.force);
        zombie.hp-=skeleton.force;
        System.out.println("Zombie was damaged his hp is "+zombie.hp);
    }
}
