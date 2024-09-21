public class persion{
 int name;
 String age;

 static int getAge (int x){
  int age =x;
  return age;
 }
    static String getName(String y){
        String name =y;
        return name;
   }
   public static void main(String args[]){

    Person person1 = new Person();
    Person person2 = new Person();
    
    person1.name = getName("Keya Khatun");
    person2.name = getName("Majharul Islam");
    
    person1.age = getAge(21);
    person2.age = getAge(28);
    
    System.out.println("Person1 - Name: "+ person1.name +", \tAge: "+ person1.age);
    System.out.println("Person2 - Name: "+ person2.name +", \tAge: "+ person2.age);
   }
}
