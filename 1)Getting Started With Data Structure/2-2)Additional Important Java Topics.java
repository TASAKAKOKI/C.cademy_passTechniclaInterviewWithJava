Additional Important Java Topics
    Learn about a few important topics in Java that supplement the information covered in our Learn Java course.

Casting
    "Type casting" is the process of converting a value of one primitive data type to another primitive data type. Data types are classified as “lower” if they hold less data and “higher” if they hold more data.
    Lowest to highest primitive data types:
        Byte-->Short-->Int-->Long-->Float-->Double
    "Narrowing type casting (explicit)": Manually convert a higher data type to a lower one ie. double to int. There is a loss in data so the conversion is not automatic.
        public class Main {
            public static void main(String[]args) {
                // double to int
                double doubleNum = 19.97;
                System.out.println("The double value: " + doubleNum);
                // Need explicit casting because the double, doubleNum, cannot automatically fit into the int, intNum
                int intNum = (int) doubleNum;
                System.out.println("The int value: " + intNum);
            }
        }
        The double value: 19.97
        The int value: 19
    "(int)" in the line int intNum = (int) doubleNum indicates that doubleNum is being converted to an int.
    
    "Widening type casting (implicit)": Java automatically converts a lower data type to a higher one ie. int to double. There is no loss in data.
        public class Main {
            public static void main(String[]args) {
                // int to double
                int intNum = 19;
                System.out.println("The int value: " + intNum);
                // No need for explicit casting because the int, intNum, can automatically fit into the double, doubleNum
                double doubleNum = intNum;
                System.out.println("The double value: " + doubleNum);
            }
        }
        The int value: 19
        The double value: 19.0
    "Other types of casting"
        Casting can also be performed on variables that are not a primitive type such as String or Object. An important thing to remember with this type of casting is that every class in Java is implicitly a subclass of the Object class. We can do this given the Car class, which is descended from Object:
            Object o = new Car();
        A Car is an Object but an Object is not necessarily always a Car. This is an example of implicit casting. Say we wrote the line:
            Car c = o;
        This would cause a compile-time error since the compiler does not know that o is an instance of Car since it is stored above as an Object. We need explicit casting to remedy this:
            Car c = (Car) o;
        A String that holds an integer value can be converted to an int using the Integer class method .parseInt():
            public class Main {
                public static void main(String[]args) {
                    // String to int
                    String s = "12";
                    System.out.println("The string value: " + s);
                    int intNum = Integer.parseInt(s);
                    System.out.println("The int value: " + intNum);
                }
            }
            The string value: 12
            The int value: 12
        An int value can be converted to a String using the String class method .valueOf():
            public class Main {
                public static void main(String[]args) {
                    // int to string
                    int intNum = 12;
                    System.out.println("The int value: " + intNum);
                    String s = String.valueOf(intNum);
                    System.out.println("The String value: " + s);  
                }
            }
            The int value: 12
            The string value: 12
Dictionaries
    In Java, a Dictionary is an abstract class that stores key-value pairs. Given a key, you can retrieve the value associated with that key. Dictionaries are instantiated with one data type for the keys and one for the values, both of which can be any data type. Every key is associated with at most one value.
    
    "Dictionary" is the abstract parent class of Hashtable, a data structure that stores key-value pairs.
    
    "Hashtable" is a data structure that stores key-value pairs in a hashtable, very similar to HashMap. One difference is that Hashtable does not allow any null key or value. In a Hashtable, each key is hashed (using a hash function) to get a hash code, which is then used as the index at which the corresponding value is stored in the hashtable.

    We will create an instance of Hashtable, which extends the Dictionary key-value behavior. Here, the keys are of data type String, and values are of data type Integer:  
        Dictionary<String, Integer> dict = new Hashtable<>();
    You can see how key-value pairs are stored in the Hashtable:
        public class DictionaryCreation {
            public static void main(String[]args) {
                Dictionary<Integer,String> dict = new Hashtable<>();
                // Add key-value pairs to dict
                dict.put(1, "hello");
                dict.put(5, "goodbye");
                // Access the values using the keys
                System.out.println("Value at key 1: " + dict.get(1));
                System.out.println("Value at key 5: " + dict.get(5));
            }
        }
        Value at key 1: hello
        Value at key 5: goodbye
    An "interface" is a collection of abstract methods which lay out the required behavior of any class that implements it. Recently, a Map interface was created; it maps keys to values in a similar manner to Dictionary. This more robust interface was created for data structures such as HashMap and Hashtable to implement. It can only be used with a class that implements its interface.
        Map<String, Integer> m1 = new Hashtable<>();
        Map<String, Integer> m2 = new HashMap<>();
    Because Hashtable is the only subclass of Dictionary and Hashtable implements Map, the Dictionary class has now become somewhat obsolete in the wake of the more versatile and applicable Map interface. When coding outside of Codecademy, we recommend exploring the Map interface and its array of applications. Some data structures besides Hashtable and HashMap that implement the key-value pair behavior of the Map interface are LinkedHashMap, TreeMap and WeakHashMap.