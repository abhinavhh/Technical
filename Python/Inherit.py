class SchoolStudent:
    name: None


class CollegeStudent(SchoolStudent):
    subject:None

students = []

for i in range(2):
    s=CollegeStudent()
    s.name = input("Enter the name: ")
    s.subject = input("Enter the subject: ")
    students.append(s)

for st in students:
    print(f"Name: {st.name} Subject: {st.subject}")
