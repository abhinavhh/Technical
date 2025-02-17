class Calculator:
    op1 = 0
    op2 = 0
    def add(self):
        print(f"Sum is : {self.op1 + self.op2}")
    def sub(self):
        print(f"Difference is : {self.op1 - self.op2}")
    def mul(self):
        print(f"Product is : {self.op1 * self.op2}")
    def div(self):
        print(f"Quotient is : {self.op1 / self.op2}")
    def run(self):
        self.op1 = float(input("Enter operand 1: "))
        self.op2 = float(input("Enter operand 2: "))
        op = input("Enter the operation: ")
        if(op == '+'):
            self.add()
        elif(op == '-'):
            self.sub()
        elif(op == '*'):
            self.mul()
        elif(op == '/'):
            self.div()
        else:
            print("Invalid operator")

c = Calculator()
while True:
    
    c.run()

