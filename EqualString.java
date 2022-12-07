//public class EqualString {
//    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//        if(str1.equals(str2)){
//            System.out.println("Equal");
//        }else{
//            System.out.println("NOt Equal");
//        }
//        if(str1.equals(str3)){
//            System.out.println("Equal");
//        }else {
//            System.out.println("Not Equal");
//        }
//
//        if(str1 == str2){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }
//
//        if(str1 == str3){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }
//    }
//}


//
//class StringDemo5{
//    public static void main(String... args){
//        String str1 = "Arun Kumar likes core java";
//        String str2[] = str1.split(" ");
//        for(int i=0;i<str2.length;i++){
//            System.out.println(str2[i]);
//        }
//        String str3 = "a/b/c/d";
//        String str4[] = str3.split("/",2);
//        for(String x:str4){
//            System.out.println(x);
//        }
//        String str5 ="Hello C,Hello C++,Hello Java";
//        String str6 = str5.replace('l','m');
//        System.out.println(str6);
//        String str7 = str5.replace("Hello","Hi");
//        System.out.println(str7);
//        String str8 = str5.replaceFirst("Hello","Hi");
//        System.out.println(str8);
//    }
//}





class StringDemo6{
    public static void main(String... args){
        String str1 = "Data ";
        String str2 = "Base";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        str1 = str1 + str2;
        System.out.println(str1.hashCode());
        System.out.println(str1);

    }
}
