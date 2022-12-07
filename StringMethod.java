public class StringMethod {
    public static void main(String[] args) {
        String str1 = "I Love Java Coding";
        String str2 = "How is your life";
        String str3 = "     And Like to read    ";


//        length count
        System.out.println(str1.length());



//        concatinaiton
        System.out.println(str1.concat(str2));

//        trim() function
        System.out.println(str3 + "\n" + str3.trim());

//        isEmpty function
        boolean x = str3.isEmpty();
        System.out.println(x);
    }
}
