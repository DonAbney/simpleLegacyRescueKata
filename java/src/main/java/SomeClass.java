import java.util.Random;

class SomeClass {

    Random random = new Random();


    public String someMethod() {

        String myRandomFlag = "";

        if ((this.thingOne() || (!this.thingOne() && this.thingTwo())) && this.thingThree()) {
            myRandomFlag = "Bacon";
        } else {
            myRandomFlag = "Tofu";
        }

        return myRandomFlag;
    }

    public boolean thingOne() {
        return random.nextBoolean();
    }

    public boolean thingTwo() {
      return random.nextBoolean();
    }

    public boolean thingThree() {
      return random.nextBoolean();
    }

}
