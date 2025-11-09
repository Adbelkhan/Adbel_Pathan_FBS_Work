//Strings user define function
//n. mystrnstr
#include <stdio.h>
#include<string.h>
void mystrnstr(char*, char*, int);
void main()
{
    char dest[50] = "Hello world, welcome to C";
    char src[20] = "world";
    int n = 30; 

    mystrnstr(dest, src, n);
}

void mystrnstr(char* dest, char* src, int n)
{
    int i, j, found = 0;

    for (i = 0; i < n; i++)
    {
        for (j = 0; src[j] != '\0' && i + j < n; j++)
        {
            if (dest[i + j] != src[j])
                break;
        }

        if (src[j] == '\0')   // substring found
        {
            printf("Substring found at position: %d\n", i + 1);
            found = 1;
            break;
        }
    }

    if (found == 0)
        printf("Substring not found in first %d characters\n", n);
}

