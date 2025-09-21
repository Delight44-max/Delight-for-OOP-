import unittest
from car import Car

class TestCar(unittest.TestCase):
    def test_start_stop(self):
        car = Car(10)
        self.assertFalse(car.is_running())
        car.start()
        self.assertTrue(car.is_running())
        car.stop()
        self.assertFalse(car.is_running())

    def test_refuel(self):
        car = Car(10)
        car.refuel(30)
        self.assertEqual(car.get_fuel_level(), 30)
        car.refuel(25)
        self.assertEqual(car.get_fuel_level(), 50) 

    def test_drive_consumes_fuel(self):
        car = Car(10)  
        car.refuel(10)
        car.start()
        car.drive(50) 
        self.assertEqual(car.get_fuel_level(), 5)

if _name_ == "_main_":
    unittest.main()