# Polymorphism in Java
This brief example shows Polymorphism which is the ability of objects to take different forms.

 In this example we are exploring dangerous plant species - namely _Cactus_, _Tree_ and _FloweringPlant_. These species are all a subclass of the abstract class _Plant_. 
 In the wild we don't observe abstract Plants, but different types or incarnations of plants. 
 
 To complicate things further, we have the interface _Danger_. Which contains two methods: _canHurtYou()_ (returns a boolean) and _getTypeOfHurting()_ (describes how a class can hurt you).
 When classes, such as our sub-classes of Plants, implement the interface _Danger_, we have to implement these two methods, but
 by putting in an interface, we can make other things dangerous such as Animals, Cars and people without having to rewrite the "danger methods".
 
 
 
 Some plants have spines, some have poisonous fruits and others are poisonous themselves. By using polymorphism we can treat them all as "Plants" despite their varying implementations.


