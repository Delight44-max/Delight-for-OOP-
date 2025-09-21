class Car {
  constructor(fuelEfficiency) {
    this.fuelEfficiency = fuelEfficiency; 
    this.fuelLevel = 0;
    this.running = false;
    this.maxCapacity = 50;
  }

  start() {
    if (this.fuelLevel > 0) {
      this.running = true;
    }
  }

  stop() {
    this.running = false;
  }

  refuel(liters) {
    this.fuelLevel = Math.min(this.fuelLevel + liters, this.maxCapacity);
  }

  drive(distance) {
    if (!this.running) {
      throw new Error("Car must be started before driving");
    }

    const fuelNeeded = distance / this.fuelEfficiency;
    if (fuelNeeded > this.fuelLevel) {
      throw new Error("Not enough fuel to drive the distance");
    }

    this.fuelLevel -= fuelNeeded;
  }

  getFuelLevel() {
    return this.fuelLevel;
  }

  isRunning() {
    return this.running;
  }
}

module.exports = Car;