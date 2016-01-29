class SomeClass {

    Random random = new Random()

    public String someMethod() {
    String myRandomFlag = ''
        if ((this.thingOne() || (!this.thingOne() && this.thingTwo())) && this.thingThree()) {
            myRandomFlag = 'Bacon'
        } else {
            myRandomFlag = 'Tofu'
        }
    }

    public thingOne() {
        random.nextBoolean()
    }
    public boolean thingTwo() {
        random.nextBoolean()
    }
    public boolean thingThree() {
        random.nextBoolean()
    }

}
