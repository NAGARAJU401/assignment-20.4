package hash;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hmap {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		//HashMap class implements the map interface by using a hash 
		//table. It inherits AbstractMap class and implements Map 
		//interface.HashMap<k,v>
		//K: It is the type of keys maintained by this map.
		//V: It is the type of mapped values.
HashMap<Integer,String> employeeNames=new HashMap<Integer,String>();
//put(K key, V value) method is used to associate the specified 
		//value with the specified key in this map.

employeeNames.put(1,"nag");
 employeeNames.put(2,"prasi");
 employeeNames.put(4,"sandya");
 employeeNames.put(3,"bavana");
//system is final class
 //out is a static member of system class and type printStream
 //println is method of printStream class.ln means nextline
 System.out.println(employeeNames);
 //create the object of keys set
 Set<Integer> keys=employeeNames.keySet();
 for(Integer key:keys)//print the keys using ternary values
 {
	 System.out.println(key);
 }
 System.out.println(employeeNames);
 
 Collection<String> values=employeeNames.values();
 for(String value:values)
 {
	 System.out.println(value);
 }
//The Java collections framework (JCF) is a set of classes and 
//interfaces that implement commonly reusable collection data structures.
//synchronzing the employees 
//Map interface provides methods for storing values based on key basis.
Map map=Collections.synchronizedMap(employeeNames);
System.out.println("After synchronizing:");
Collection value=map.entrySet();//enter into the set
synchronized(employeeNames)
{

Iterator i=value.iterator();
while(i.hasNext())
{
	//create the object and displaying
	Map.Entry me=(Map.Entry)i.next();
	System.out.print(me.getKey()+":");
	System.out.println(me.getValue());
}
}
	}

}
