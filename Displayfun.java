class Animal{
    String name;
    int age;
    String type;
     void Displayfun()
     {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Type:"+type);
     }
     public static void main(String[] args){
        Animal sc=new Animal();
        sc.name="Tiger";
        sc.age=10;
        sc.type="wild";
        sc.Displayfun();
     }
}