public static  class Student {
    String name,gender,varsity;
    int id;

    Student(){

    System.out.println("Null");
}
Student(String n,int i,String g,String v){
    name=n;
    id=i;
    gender=g;
    varsity=v;
}

Student(String n,int i,String g){
    name=n;

    gender=g;
}



Student(String n,String v){

    name=n ;
    varsity=v;
}




void display(){
    System.out.println("\n");
    System.out.println("Name:"+name);
    System.out.println("Id:"+id);
    System.out.println("Gender:"+gender);
    System.out.println("University:"+varsity);
}

}


public static void main(String []args){

     Student student1 =new Student("Sabab Mustafa Taranggo",112430016,"Male","United International University");
     student1.display();
    System.out.println("-----------------------------------\n");
     Student student2 =new Student("Maria Alim Trisha",112430030,"Female","United International University");
     student2.display();
    System.out.println("-----------------------------------\n");


    Student student3=new Student("Anika Rehman","United International University");
    student3.display();
    System.out.println("-----------------------------------\n");
    Student student4 =new Student("Hamza Mahtir",11235678,"Male");
    student4.display();
    System.out.println("-----------------------------------\n");


    Student student5 =new Student("Yamin Hasan","United International University");
    student5.display();
    System.out.println("-----------------------------------\n");
    Student student6 =new Student("Maria Alim Trisha",112430030,"Female","United International University");
    student6.display();
    System.out.println("-----------------------------------\n");

    Student student7=new Student();
    student7.display();



}