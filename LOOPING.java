package mypackage;

nt number = 10;
if (number > 0) {
System.out.println("The number is positive.");
}

int number = 0;
if (number > 0) {
System.out.println("The number is positive.");
} else if (number < 0) {
System.out.println("The number is negative.");
} else {
System.out.println("The number is zero.");
}


int day = 3;
switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
default:
System.out.println("Invalid day");
break;
}



int sum = 0;
for (int i = 1; i <= 10; i++) {
sum += i;
}
System.out.println("Sum: " + sum);

int i = 1;
int sum = 0;
while (i <= 10) {
sum += i;
i++;
}
System.out.println("Sum: " + sum);



int i = 1;
int sum = 0;
do {
sum += i;
i++;
} while (i <= 10);
System.out.println("Sum: " + sum);





