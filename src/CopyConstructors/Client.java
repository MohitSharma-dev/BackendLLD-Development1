package CopyConstructors;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.getAge("$123"));
    //
    //    Using the below line you are just copying the reference not the exact object
//        Student st1 = st;

        Student st1 = new Student("Mohit" ,32 , 2016);
        //  This is redundant piece of code
        //  We will have to write the same code everywhere
        st1.setAge(st.getAge("$123"));
        st1.setGradYear(st.getGradYear());

        // the below creation uses another object to copy the data from
        Student st2 = new Student(st);
        System.out.println(st.getAge("$123"));
    }
}
