package abst;

abstract class Animal {
    public abstract  void eat();
    public abstract void sleep();
}
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps on the ground.");
    }
}
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a cave or under trees.");
    }
}

class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }

    @Override
    public void sleep() {
    	 System.out.println("Tiger sleeps in a cave or under trees.");
    }



    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        lion.eat();
        lion.sleep();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();
    
}
    }

