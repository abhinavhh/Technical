class Student:
    name = None
    mark1 = 0
    mark2 = 0
    def total(self):
        print(self.mark1 + self.mark2)
    
s = Student()
s.name = "John"
s.mark1 = 80
s.mark2 = 90
s.total()