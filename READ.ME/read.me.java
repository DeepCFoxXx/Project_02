Jurassic Park

Jurassic Park
Goal: Practice OO modelling in Java (unit tests, no UI)

You have been asked to create an app to manage the dinosaur population and visitor tracking of Jurassic Park. (No expense spared)

MVP
The user must be able to:

Add/remove paddocks to the park
Add/remove dinosaurs to the paddocks
Feed the dinosaurs appropriate food depending on whether they are herbivore or carnivore
Transfer herbivore dinosaurs between paddocks
Transfer carnivore dinosaurs between paddocks

Project Extensions
Dinosaurs marked as herbivores can live in the same paddock but those marked as carnivores can only be placed with dinosaurs of the same type.
Dinosaurs can randomly rampage and break out of their paddocks.
Visitors can enter / exit the park if the dinosaurs are not rampaging.
View the number of visitors in the prison at a given time.
Anything else you can dream up!

//
public void transferToPaddock(HerbivoreDinosaur herbivoreDinosaur, HerbivorePaddock newPaddock) {
    int index = herbivorePaddock.indexOf(herbivoreDinosaur);
    HerbivoreDinosaur dinosaurToRemove = this.herbivorePaddock.remove(index);
    newPaddock.addToPaddock(dinosaurToRemove);
}
//

The project was one of six options plus the option to create your own if needed.
The reason that I chose to do Jurassic Park was because I felt i needed a better understanding
of Java class relationships and the overall structure of Java also I wanted to consolidate
what I had learned so far into one application.
At the end of the project I felt that I had achieved those goals.

https://github.com/DeepCFoxXx/Project_02  
