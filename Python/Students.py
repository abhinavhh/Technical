class Student:
    name = None
    mark1 = 0
    mark2 = 0
    def total(self):
        print(self.mark1 + self.mark2)


students = []


for i in range(2):
    s = Student()
    s.name = input("Enter the name of student1: ")
    s.mark1 = float(input("Enter the mark1: "))
    s.mark2 = float(input("Enter the mark2: "))
    students.append(s)

for st in students:
    print(f"Name : {st.name} Mark1 : {st.mark1} Mark2: {st.mark2}");