public class strings {
    public static void main(String[] args){
        // strings
        String name = "Dario George";
        System.out.println(name);
        //concatenation
        String name1 = "Joseph";
        String name2 = " Babu";
        String name3 = name1+name2;
        System.out.println(name3);
        //charAt
        System.out.println(name1.charAt(0));
        //length
        System.out.println(name3.length());
        // Replace
        String name4 = name1.replace("Joseph","Aibin");
        System.out.println(name4);
        //substring
        String moto = "India is my country!!";
        System.out.println(moto.substring(0,5));
    }
}
