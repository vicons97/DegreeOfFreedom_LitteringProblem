# Python Encapsulation
class SoftwareEngineer:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self._salary = 5000  # private
        #private int salary; in java
        self._num_bugs_solved=0 # private
    def code(self):
        self._num_bugs_solved+=1
    #getter function
    def get_salary(self):
        return self._salary
    #setter function
    def set_salary(self, base_value):
        self._salary = self._calculate_salary(base_value)
class Empsalary(SoftwareEngineer):
    def _calculate_salary(self, base_value):
        if self._num_bugs_solved<10:
            return base_value
        if self._num_bugs_solved<100:
            return base_value * 2
        return base_value * 3
class Empworking(SoftwareEngineer):
    def __init__(self, name):
        super().__init__(name, 0)
        #self.wage = 0
        self.wage = 0
        self.hr = 0
        self.total_wage = 0
        self.total_wage2 = 0
    def eesalary(self, wage, hr):
        self.total_wage = wage * hr
        print(self.total_wage)
        print(f"Total salary of {self.name} is", self.total_wage)
    def salexp(self, wage, hr):
        exp = int(input(f"How many years does {self.name} has of experience? "))
        if exp >= 15:
            print("pasa")
            self.total_wage2 = (wage * hr) + 1500
            print(f"good work {self.name}, your salary plus bonus is {self.total_wage2}")
        elif exp >= 8:
            self.total_wage2 = self.total_wage
            print(f"keep working {self.name}, you will get an increase soon")
        else:
            print("Wrong info.")
    def taxdec(self):
        tax1 = 0
        tax2 = 0
        print("This is the total wage without checking the worker´s experience: ")
        print(self.total_wage)
        print("This is the total wage while checking the worker´s experience: ")
        print(self.total_wage2)
        if self.total_wage > 0:
            tax1 = 0.13 * self.total_wage
            print(f"the tax generated is {tax1}")
        if self.total_wage2 > 0:
            tax2 = 0.13 * self.total_wage2
            print(f"the tax generated with the bonus is {tax2}")
# instance
es = Empsalary("Max", 25)
#se = SoftwareEngineer("Max", 25)
print(es.name, es.age)
for i in range(90):
    es.code()
es.set_salary(60)
print(es.get_salary())
ew =Empworking("John")
ew.eesalary(22, 40)
ew.salexp(22, 40)
ew.taxdec()
