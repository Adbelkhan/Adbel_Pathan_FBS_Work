//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.

void main()
{
	int side1 = 8, side2 = 1, side3 = 2;
	if(side1==side2 && side2==side3)
		printf("The triangle is equilateral");
	      else if(side1==side2 || side1==side3 && side2==side3)
	        printf("isoscles");
	          else 
	            printf("scalen");
}