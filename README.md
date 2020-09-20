# UNMSM - UPG-FISI - Maestría en Ingeniería de Software<br/>Examen Final - Diseño y Construcción de Software - 2020-1

## Indicaciones

```
Realizar un fork de este repositorio para desarrollar su examen.
```

## Pregunta 1. Completar al 100% la pregunta del examen parcial (6 puntos)


Respuesta: https://github.com/marzapalo/examen-parcial-dcs-2020-1.git
postman: sales-unmsm.postman_collection.json
```
Construya el back-end/API con base a los drivers arquitecturales de ADDv3.
Subir sus requests de Postman u otra herramienta utilizada.
```

```
1. Propósito del diseño.- Descrito a criterio del arquitecto.
```

```
2. Funcionalidad primaria.-
  2.1. Place an Order (Sales Bounded Context).
  2.2. Bill an Order (Billing Bounded Context) - Simular si falla el pago.
  2.3. Ship an Order (Shipping Bounded Context).
  2.4. Order History Report.
  2.5. Order List Report.
```

```
3. Atributos de calidad.- Descrito a criterio del arquitecto.
```

```
4. Restricciones.- Utilizar los siguientes conceptos de diseño:
  4.1. Event Driven Architecture.
  4.2. DDD.
  4.3  Event Sourcing.
  4.4. CQRS.
  4.5. Saga.
  4.6. Axon Framework.
  4.7. Projections.
```

```
5. Preocupaciones arquitecturales.- Descrito a criterio del arquitecto.
```

## Pregunta 2 (3 puntos)

Aplicar el patrón Abstract Factory.

```java
public Vehicle getVehicle(String type, String subType) {
  Vehicle vehicle = null;
  if (type.equals("car")) {
    switch (subType) {
      case "compact": vehicle = new CompactCar(); break;
      case "sedan": vehicle = new SedanCar(); break;
    }
  } else if(type.equals("motorcycle")) {
    switch (subType) {
      case "scooter": vehicle = new Scooter(); break;
      case "sportbike": vehicle = new SportBike(); break;
    }
  }
  return vehicle;
}

Vehicle vehicle = getVehicle("car", "sedan");
vehicle.doSomething();
```

## Pregunta 3 (3 puntos)

Aplicar el patrón Bridge.

```java
Circle circle = new BlueCircle();
Circle blackCircle = new BlackCircle();
Square square = new RedSquare();
Square greenSquare = new GreenSquare();

circle.applyColor();
blackCircle.applyColor();
square.applyColor();
greenSquare.applyColor();
```

## Pregunta 4 (4 puntos)

Aplicar el patrón Decorator sabiendo que a un sandwich se le puede agregar cualquier combinación de: Egg, Chicken, Beef, Bacon, Turkey.

```java
Sandwich smallBreadSandwich = new SmallBreadSandwich();
System.out.println(smallBreadSandwich.make());

Sandwich largeBreadSandwich = new LargeBreadSandwich();
System.out.println(largeBreadSandwich.make());
```

## Pregunta 5 (4 puntos)

Aplicar el patrón Strategy.

```java
public void kick(String type) {
  if (type.equals("lightning")) {
    System.out.println("This is a Lightning Kick");
  } else if (type.equals("tornado")) {
    System.out.println("This is a Tornado Kick");
  } else if (type.equals("butterfly")) {
    System.out.println("This is a Butterfly Kick");
  }
}

public void jump(String type) {
  if (type.equals("long")) {
    System.out.println("This is a Long Jump");
  } else if (type.equals("short")) {
    System.out.println("This is a short Jump");
  }
}

Fighter fighter = new Paul();

fighter.kick("butterfly");
fighter.jump("long");

fighter.kick("tornado");
fighter.jump("short");

fighter.kick("butterfly");
fighter.jump("short");

fighter.kick("tornado");
fighter.jump("long");
```
