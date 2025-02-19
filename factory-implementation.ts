// common interface
interface InterativeToy{
  interact():void;
}

// concrete implementations
class Barbie implements InterativeToy{
  public interact(){
    console.log('You can be what you want!')
  }
}

class HotWheels implements InterativeToy{
  public interact(){
    console.log('Turbo Mode!');
  }
}

class GenericToy implements InterativeToy{
  public interact(){
    console.log('Smile - Butterfly ♪♪');
  }
}

// factory interface
interface FactoryInterativeToy{
  create(): InterativeToy;
}

// factory implementations
class BarbieFactory implements FactoryInterativeToy{
  public create(){
    return new Barbie();
  }
}

class HotWheelsFactory implements FactoryInterativeToy{
  public create(){
    return new HotWheels();
  }
}

class GenericToyFactory implements FactoryInterativeToy{
  public create(){
    return new GenericToy();
  }
}


// use case

enum Preference{
  DOLLS,
  CARS,
  OTHER
}

const FACTORIES: Record<Preference, FactoryInterativeToy> = {
    [Preference.DOLLS]: new BarbieFactory(),
    [Preference.CARS]: new HotWheelsFactory(),
    [Preference.OTHER]: new GenericToyFactory(),
};

function makeAToy(preference: Preference = Preference.OTHER): InterativeToy{
  const matchFactory = FACTORIES[preference];

  return matchFactory.create();
}

// view console
makeAToy(Preference.OTHER).interact();
makeAToy(Preference.CARS).interact();
makeAToy(Preference.DOLLS).interact();

//defaults to OTHER preference
const toy = makeAToy();
toy.interact();
