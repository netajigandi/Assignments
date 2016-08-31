class StaffStd
{
       public static void main(String args[])
       {
               Person pObj = new Person("Netaji","Visakhapatanam");
               Student sObj = new Student("Naidu","Visakhapatanam","ANDROID FTP",2016,5000.23);
               Staff tObj = new Staff("Akash-Sinha ","Delli","CITM",60000);
               System.out.println("Person :");
               pObj.Display();
               System.out.println("");
               System.out.println("Student :");
               sObj.Display();
               System.out.println("");
               System.out.println("Staff :");
               tObj.Display();
        }
}