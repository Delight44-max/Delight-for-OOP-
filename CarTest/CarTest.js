
const Car = require("./car");

test("Car can start and stop", () => {
  const car = new Car(10);
  expect(car.isRunning()).toBe(false);
  car.start();
  expect(car.isRunning()).toBe(true);
  car.stop();
  expect(car.isRunning()).toBe(false);
});

test("Car can refuel", () => {
  const car = new Car(10);
  car.refuel(30);
  expect(car.getFuelLevel()).toBe(30);
  car.refuel(25);
  expect(car.getFuelLevel()).toBe(50); 
});

test("Driving consumes fuel", () => {
  const car = new Car(10);
  car.refuel(10);
  car.start();
  car.drive(50);
  expect(car.getFuelLevel()).toBe(5);
});