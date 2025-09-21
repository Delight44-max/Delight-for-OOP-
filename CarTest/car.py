class Car:
    def _init_(self, fuel_efficiency):
       
    
        self.fuel_efficiency = fuel_efficiency
        self.fuel_level = 0
        self.running = False
        self.max_capacity = 50

    def start(self):
        if self.fuel_level > 0:
            self.running = True

    def stop(self):
        self.running = False

    def refuel(self, liters):
        
        self.fuel_level = min(self.fuel_level + liters, self.max_capacity)

    def drive(self, distance):
        
        if not self.running:
            raise Exception("Car must be started before driving")

        fuel_needed = distance / self.fuel_efficiency
        if fuel_needed > self.fuel_level:
            raise Exception("Not enough fuel to drive the distance")

        self.fuel_level -= fuel_needed

   
    def get_fuel_level(self):
        return self.fuel_level

    def is_running(self):
        return self.running