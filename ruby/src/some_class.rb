
class SomeClass
  def self.someMethod
    myRandomFlag = ''

    if ((thingOne || (!thingOne && thingTwo)) && thingThree)
        myRandomFlag = "Bacon";
    else
        myRandomFlag = "Tofu";
    end

    myRandomFlag

  end

  def self.thingOne
    return [true, false].sample
  end

  def self.thingTwo
    return [true, false].sample
  end

  def self.thingThree
    return [true, false].sample
  end
end
