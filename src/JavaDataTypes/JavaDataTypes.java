package JavaDataTypes;

/*
* Data types are divided into two groups:

-- Primitive data types - includes byte, short, int, long, float, double, boolean and char
-- Non-primitive data types - such as String, Arrays and Classes.

* Primitive Data Types
A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

 */
public class JavaDataTypes {
    public static void main(String[] args) {

        System.out.println("Data Type: byte" + "Size: 1 byte" + "\nDescription: Stores whole numbers from -128 to 127");

        byte myByte = 127;
        System.out.println("myByte: " + myByte);

        System.out.println("Data Type: short" + "Size: 2 bytes" + "\nDescription: Stores whole numbers from -32,768 to 32,767");
        short myShort = 2349;
        System.out.println("myShort: " + myShort);

        System.out.println("Data Type: int" + "Size: 4 bytes" + "\nDescription: Stores whole numbers from -2,147,483,648 to 2,147,483,647");
        int myInt = 234878;
        System.out.println("myInt: " + myInt);

        System.out.println("Data Type: long" + "Size: 8 bytes" + "\nDescription: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        long myLong = 9223372038237843L;
        System.out.println("myLong: " + myLong);

        System.out.println("Data Type: float" + "Size: 4 bytes" + "\nDescription: Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits");
        float myFloat = 3482.23498f;
        System.out.println("myFloat: " + myFloat);

        System.out.println("Data Type: double" + "Size: 8 bytes" + "\nDescription: Stores fractional numbers. Sufficient for storing 15 decimal digits");
        double myDouble = 348.32434724782776876668767686d;
        System.out.println("myDouble: " + myDouble);

        System.out.println("Data Type: boolean" + "Size: 1 bytes" + "\nDescription: Stores true or false values");
        boolean myBoolean = true;
        System.out.println("myBoolean: " + myBoolean);

        System.out.println("Data Type: char" + "Size: 2 bytes" + "\nDescription: Stores a single character/letter or ASCII values");
        char myChar = 'A';
        System.out.println("myChar: " + myChar);

    }
}

/*
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
 */