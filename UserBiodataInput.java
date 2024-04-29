 import java.util.Scanner;

 public class UserBiodataInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your biodata:");

       
        System.out.print("Name: ");
        String name = scanner.nextLine();

         System.out.print("CMS ID: ");
        String cmsId = scanner.nextLine();

        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.print("Address: ");
        String address = scanner.nextLine();

        
        System.out.println("\nBiodata:");
         System.out.println("Name: " + name);
         System.out.println("CMS ID: " + cmsId);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        scanner.close();
    }
}


